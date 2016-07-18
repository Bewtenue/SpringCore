package com.softpath.import2beansfactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.softpath.beanstwo.TextEditor;
import com.softpath.beanstwo.TextEditorConfig;

public class MainConfig {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigB.class);
		A a = context.getBean(A.class);
		B b = context.getBean(B.class);
		a.setName("Hola A");
		System.out.println(a.getName());
		
	}
}
