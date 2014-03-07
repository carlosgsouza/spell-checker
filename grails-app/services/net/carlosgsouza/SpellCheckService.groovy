package net.carlosgsouza

import org.xeustechnologies.googleapi.spelling.SpellChecker
import org.xeustechnologies.googleapi.spelling.SpellResponse

class SpellCheckService {
	
	SpellChecker spellCheckerClient = new SpellChecker()

    def checkText(String text) {
		spellCheckerClient.check(text)
    }
}
