package com.bipin.model;

public class Triangle {

	private String name ;
	
	public Triangle() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Triangle [name=" + name + "]";
	}

}
