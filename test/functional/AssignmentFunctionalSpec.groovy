

import geb.spock.GebReportingSpec

import java.lang.invoke.MethodHandleImpl.BindCaller.T

import org.junit.experimental.theories.internal.Assignments;

import pages.AssignmentCreatePage
import pages.AssignmentListPage
import pages.AssignmentShowPage;
import spock.lang.Stepwise

@Stepwise
class AssignmentFunctionalSpec extends GebReportingSpec {
	
	def "shoud show an empty assignment list"() {
		when:
		to AssignmentListPage
		
		then:
		at AssignmentListPage
	}
	
	def "should click on the New Assignment button and be taken to the Assignment creation page"() {
		when:
		newAssignmentButton.click()
		
		then:
		at AssignmentCreatePage
	}
	
	def "should submit a new assignment"() {
		when:
		textArea << "This text should containt only one errrrrrrror"
		
		and:
		saveButton.click()
		
		then:
		at AssignmentShowPage
	}
	
	def "should list the just created assignment"() {
		when:
		to AssignmentListPage
		
		then:
		assignments.size() == 1
	}
	
}
