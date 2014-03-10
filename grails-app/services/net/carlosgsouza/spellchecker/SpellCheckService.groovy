package net.carlosgsouza.spellchecker

import com.swabunga.spell.engine.SpellDictionaryHashMap
import com.swabunga.spell.event.SpellCheckEvent
import com.swabunga.spell.event.SpellCheckListener
import com.swabunga.spell.event.SpellChecker
import com.swabunga.spell.event.StringWordTokenizer
import com.swabunga.spell.event.TeXWordFinder

class SpellCheckService  {
	
	SpellChecker spellCheckerInstance
	
	// We synchronize this method to avoid the spellchecker to be instantiated twice by two instances of this service
	private synchronized SpellChecker createSpellChecker() {
		if(spellCheckerInstance == null) {
			spellCheckerInstance = new SpellChecker(new SpellDictionaryHashMap(new File("dictionary/en.txt")))
		}
		return spellCheckerInstance
	}
	
    int getErrorCount(String text) {
		StringWordTokenizer tokenizer = new StringWordTokenizer(text, new TeXWordFinder());
		
		SpellChecker sc = createSpellChecker()
		int checkResult = spellCheckerInstance.checkSpelling(tokenizer)
		
		return Math.max(0, checkResult)
    }
}
