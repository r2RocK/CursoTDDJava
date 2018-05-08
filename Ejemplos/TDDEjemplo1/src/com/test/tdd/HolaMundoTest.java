package com.test.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.main.tdd.HolaMundo;

public class HolaMundoTest {
	
	public static final String LEYENDA_A_COMPARAR = "Hola mundo, ";
	
	@Test
	public void pruebaSaludo(){
		String parametro = "Arturo";
		assertEquals( LEYENDA_A_COMPARAR + parametro, HolaMundo.saludar( parametro ) );
	}

}

