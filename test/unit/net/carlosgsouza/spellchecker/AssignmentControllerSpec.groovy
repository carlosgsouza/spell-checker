package net.carlosgsouza.spellchecker

import grails.test.mixin.*
import spock.lang.Specification

@Mock(Assignment)
@TestFor(AssignmentController)
class AssignmentControllerSpec extends Specification {

	AssignmentController controller = new AssignmentController()
	
	def "should evaluate assignments when they are created"() {
		given:
		controller.spellCheckService = Mock(SpellCheckService)
		
		and:
		controller.params.text = "A text submitted by a student"
		
		expect: 
		Assignment.list() == []
		
		when:
		controller.save()
		
		then:
		1 * controller.spellCheckService.getErrorCount("A text submitted by a student") >> 0
		
		and:
		Assignment.list().size() == 1
		Assignment.list()[0].text == "A text submitted by a student"
		Assignment.list()[0].errorCount == 0
	}
}
