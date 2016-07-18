package com.softpath.beanstwo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TextEditorConfig {
	
	@Bean
	public TextEditor textEditor()	{
		return new TextEditor(spellCheckerAnnotation());
	}
	
	@Bean
	public SpellCheckerAnnotation spellCheckerAnnotation(){
		return new SpellCheckerAnnotation();
	}
	
	
}
