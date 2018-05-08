package com.main.tdd;

public class Verify {
	
	private int id;
	
	public int getId(){
		System.out.println("Lo que deberia regresar: "+id);
		return this.id;
	}
	
	public void probando(int parametro){
		System.out.println("Ejecutando metodo probando("+parametro+")");
	}
	
	public void algunMetodo(String parametro){
		System.out.println("Ejecutando metodo algunMetodo("+parametro+")");
	}

}
