package com.softpath.myxmlannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.softpath.beanstwo.TextEditor;
import com.softpath.beanstwo.TextEditorConfig;

public class MainXMLWithEditor {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(TextEditorConfig.class);
		TextEditor txt = context.getBean(TextEditor.class);
		txt.spellCheck();
		
	}
}
