package com.softpath.beanstwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TextEditor {
	//@Autowired
	private SpellCheckerAnnotation spell;
	
	public TextEditor(SpellCheckerAnnotation spell){
		this.spell = spell;
	}
	
	public SpellCheckerAnnotation getSpell() {
		return spell;
	}
	@Autowired //tambien se puede poner en la propiedad
	public void setSpell(SpellCheckerAnnotation spell) {
		this.spell = spell;
	}
	
	public void spellCheck(){
		spell.checkSpellingAnnotation();
	}
	
}
