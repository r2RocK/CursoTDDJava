package com.main.tdd;

public class WhenThenReturn {
	
	private int id;
	
	public int getId(){
		System.out.println("Lo que deberia regresar: "+id);
		return this.id;
	}

}
