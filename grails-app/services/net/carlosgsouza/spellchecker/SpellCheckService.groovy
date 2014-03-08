package net.carlosgsouza.spellchecker

import com.swabunga.spell.engine.SpellDictionaryHashMap
import com.swabunga.spell.event.SpellCheckEvent
import com.swabunga.spell.event.SpellCheckListener
import com.swabunga.spell.event.SpellChecker
import com.swabunga.spell.event.StringWordTokenizer
import com.swabunga.spell.event.TeXWordFinder

class SpellCheckService  {
	
	static SpellChecker spellChecker
	static {
		// This takes a long time to be initialized so we share it among all instances of the service
		spellChecker = new SpellChecker(new SpellDictionaryHashMap(new File("dictionary/en.txt")))
	}
	
    int getErrorCount(String text) {
		StringWordTokenizer tokenizer = new StringWordTokenizer(text, new TeXWordFinder());
		return Math.max(0, spellChecker.checkSpelling(tokenizer))
    }
}
