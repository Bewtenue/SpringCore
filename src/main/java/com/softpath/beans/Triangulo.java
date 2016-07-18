package com.softpath.beans;

public class Triangulo {
	private String type;
	private int height;
	
	public Triangulo(String type){
		this.type = type;
	}
	
	public Triangulo(int height){
		this.height = height;
	}
	
	public Triangulo(String type, int height){
		this.type = type;
		this.height = height;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void description()
	{
		System.out.println("Este es un triangulo de tipo : " + this.type + " y altura " + this.height);
	}
	
	
	
}
