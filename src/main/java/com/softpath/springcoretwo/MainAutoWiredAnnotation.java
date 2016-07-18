package com.softpath.springcoretwo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softpath.beanstwo.Profile;
import com.softpath.beanstwo.Student;
import com.softpath.beanstwo.TextEditor;

public class MainAutoWiredAnnotation {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_spellchecker.xml");
		TextEditor texteditor = (TextEditor) context.getBean("textEditor");
		texteditor.spellCheck();
		
		ApplicationContext context2 = new ClassPathXmlApplicationContext("spring_autowire_profile.xml");
		Profile profile = (Profile) context2.getBean("profile");
		profile.profileInfo();
		
	}
}
