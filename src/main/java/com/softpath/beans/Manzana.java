package com.softpath.beans;

import org.springframework.beans.factory.annotation.Required;

public class Manzana {
	private int peso;
	private String tipo;
	
	public int getPeso() {
		return peso;
	}
	@Required
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getTipo() {
		return tipo;
	}
	@Required
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
