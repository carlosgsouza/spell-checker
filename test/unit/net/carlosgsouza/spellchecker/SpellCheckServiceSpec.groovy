
package net.carlosgsouza.spellchecker

import spock.lang.Specification

class SpellCheckServiceSpec extends Specification {
	
	SpellCheckService service = new SpellCheckService()
	
	def "should get the number of errors in a text"() {
		expect:
		service.getErrorCount(text) == errorCount
		
		where:
		text				| errorCount
		""					| 0
		" "					| 0
		" \t\n"				| 0
		"Hello"				| 0
		"hellow"			| 1
		"hello world"		| 0
		"hellow world"		| 1
		"hellow wurld"		| 2
		"helLO wOrLd"		| 0
	}
}
