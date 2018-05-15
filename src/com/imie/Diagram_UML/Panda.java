package com.imie.Diagram_UML;

public class Panda implements Client {

	private String name;
	
	
	public Panda(String name) {
		this.name = name;
	}

	public void congratulate() {
		System.out.println("Bonjour joli panda !!!");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
