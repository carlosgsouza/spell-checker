package net.carlosgsouza.spellchecker

class Assignment {
	
	String text
	int wordCount
	int errorCount
	int score

    static constraints = {
		text blank:false, size: 1..1000
    }
	
	void setText(String text) {
		this.text = text
		this.wordCount = !text ? 0 : text.split("[ \t\n\\.,!?+-]").length
	}
	
	int getScore() {
		(wordCount == 0) ? 0 : (int)10 * (wordCount - errorCount)/((double)wordCount)
	}
	
}
