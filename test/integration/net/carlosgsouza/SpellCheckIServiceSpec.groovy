package net.carlosgsouza

import org.xeustechnologies.googleapi.spelling.SpellChecker;

import spock.lang.Specification;

class SpellCheckIServiceSpec extends Specification {

   def "run"() {
	   when:
	   SpellChecker sc = new SpellChecker()
	   
	   then:	
	   println sc.check("Helloo Worldd")
   }
}
