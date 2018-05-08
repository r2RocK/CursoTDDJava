package com.main.tdd;

public class Calculos {
	
	public static int limInferior = 1;
	public static int limSuperior = 10;
	public Integer numero = null;
	
	public static int obtenerNumeroAleatorio(){
		 double numero = Math.floor(Math.random()*limSuperior+limInferior);
		 return (int) numero;
	}
	
	public static int obtenerNumeroNegativo(){
		return obtenerNumeroAleatorio()*-1;
	}
	
	public static int multiplicarNumeros(int num1, int num2){
		return num1 * num2;
	}
	
	public Integer getNumero(){
		return this.numero;
	}
	
	public void setNumero(int numero){
		this.numero = numero;
	}

}
