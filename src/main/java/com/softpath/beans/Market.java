package com.softpath.beans;

import java.util.List;

public class Market {
	
	private Manzana manzana;
	private Pera pera;
	private Sandia sandia;
	private List<Sandia> listaSandia;

	
	public List<Sandia> getListaSandia() {
		return listaSandia;
	}

	public void setListaSandia(List<Sandia> listaSandia) {
		this.listaSandia = listaSandia;
	}
	
	public Manzana getManzana() {
		return manzana;
	}

	public void setManzana(Manzana manzana) {
		this.manzana = manzana;
	}

	public Pera getPera() {
		return pera;
	}

	public void setPera(Pera pera) {
		this.pera = pera;
	}

	public Sandia getSandia() {
		return sandia;
	}

	public void setSandia(Sandia sandia) {
		this.sandia = sandia;
	}

	public void descripcion(){
		System.out.println("se resolvieron las dependencias");
		
		System.out.println("La manzana es de tipo : " + getManzana().getTipo() + " y pesa : "+ getManzana().getPeso());
		System.out.println("La pera es de tipo : " + getPera().getTipo() + " y pesa : "+ getPera().getTipo());
		System.out.println("La sandia es de tipo : " + getSandia().getTipo() + " y pesa : "+ getSandia().getPeso());
		System.out.println("Mostrando lista de sandias");
		for (Sandia sandia : this.listaSandia) {
			System.out.println("La sandia es de tipo : " + sandia.getTipo() +" y pesa : " + sandia.getPeso()+ " kilos");
		}
	}
}
