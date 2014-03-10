package net.carlosgsouza.spellchecker

class Assignment {
	
	String text
	int wordCount
	int errorCount
	double score

    static constraints = {
		text blank:false
    }
	
	void setText(String text) {
		this.text = text
		this.wordCount = !text ? 0 : text.split("[ \t\n\\.,!?+-]").length
	}
	
	double getScore() {
		(wordCount == 0) ? 0.0d : (wordCount - errorCount)/((double)wordCount)
	}
	
}
