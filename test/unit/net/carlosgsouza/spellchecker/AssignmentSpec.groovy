package net.carlosgsouza.spellchecker

import spock.lang.Specification;

class AssignmentSpec extends Specification {

	def "should calculate the score based on the number of errors and words"() {
		expect:
		new Assignment(wordCount:words, errorCount:errors).score == score
		
		where:
		words	| errors	| score
		0		| 0			| 0.0d
		1		| 0			| 1.0d
		1		| 1			| 0.0d
		150		| 15		| 0.9d
	}
	
	def "should count the words when we create an assignment from a text"() {
		expect:
		new Assignment(text).wordCount == words
		
		where:
		words	| text
		0		| ""
		0		| " .,!  \t\n"
		1		| "hello" 
		2		| "hello world"
		2		| "hello world!!"
		3		| "one two three"
	}
	
}
