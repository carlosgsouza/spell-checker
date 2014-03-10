package net.carlosgsouza.spellchecker

import spock.lang.Specification;

class AssignmentSpec extends Specification {

	def "should calculate the score based on the number of errors and words"() {
		expect:
		new Assignment(wordCount:words, errorCount:errors).score == score
		
		where:
		words	| errors	| score
		0		| 0			| 0
		1		| 0			| 10
		1		| 1			| 0
		150		| 15		| 9
	}
	
	def "should count the words when we create an assignment from a text"() {
		given:
		Assignment assignment = new Assignment()
		assignment.text = text
		
		expect:
		assignment.wordCount == words
		
		where:
		words	| text
		0		| ""
		0		| " .,!  \t\n"
		1		| "hello" 
		2		| "hello world"
		2		| "hello world!!"
		3		| "one two three"
	}
	
	def "should update the word count if we change the text of an assignment"() {
		given:
		Assignment assignment = new Assignment()
		
		when:
		assignment.text = "hello world"
		
		then:
		assignment.wordCount == 2
		
		when:
		assignment.text = "hello beautiful world"
		
		then:
		assignment.wordCount == 3
		
	}
	
}
