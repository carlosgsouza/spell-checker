package net.carlosgsouza.spellchecker

class Assignment {
	
	String text
	int wordCount
	int errorCount

    static constraints = {
		text blank:false
    }
	
	public Assignment(String text) {
		// TODO this regex could be so much better...
		wordCount = !text ? 0 : text.split("[ \t\n\\.,!?+-]").length
	}
	
	double getScore() {
		(wordCount == 0) ? 0.0d : (wordCount - errorCount)/((double)wordCount)
	}
}
