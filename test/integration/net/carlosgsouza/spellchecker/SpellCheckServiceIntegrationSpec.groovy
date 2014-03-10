package net.carlosgsouza.spellchecker

import spock.lang.Specification

class SpellCheckServiceIntegrationSpec extends Specification {
	
	SpellCheckService service = new SpellCheckService()
	
	// This test has been moved to integration because it requires initialization of a real dictionary stored on the file system
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
