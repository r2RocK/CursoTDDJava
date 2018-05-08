package com.main.tdd;

public class Leyendas {
	
	private static final String saludo = "Hola";
	
	public static String saludar(){
		return saludo.toUpperCase();
	}
	
	public static Boolean compararSimilitudLeyendas(String leyenda1, String leyenda2){
		return leyenda1.equalsIgnoreCase(leyenda2);
	}

}
