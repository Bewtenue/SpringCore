package com.softpath.beanstwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
//cuando se inyecta por getters y setters y las propiedades se necesitan obligatoriamente
//se le dice a spring que debe ser @Required
//y en el xml se le tiene que agregar un context annotation config
public class Student {
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	//@Required
	@Autowired(required=false)
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	@Autowired()
	public void setName(String name) {
		this.name = name;
	}
	
	
}
