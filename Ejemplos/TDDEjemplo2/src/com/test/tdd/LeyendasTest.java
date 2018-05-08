package com.test.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Assume;
import org.junit.Ignore;
import org.junit.Test;

import com.main.tdd.Leyendas;

public class LeyendasTest {
	
	private final String SALUDO = "HOLA";
	
	@Ignore("Para efectos de prueba")
//	@Test
	public void debeRegresarHola(){
		assertEquals(Leyendas.saludar(), SALUDO);
	}
	
	@Test
	public void debenSerLeyendasIguales(){
//		assertEquals(Leyendas.saludar(), "Holo"); //Descomentar para ver efecto del assumeFalse
		Assume.assumeFalse(Leyendas.compararSimilitudLeyendas(Leyendas.saludar(), SALUDO));
		assertEquals(Leyendas.saludar(), "HOLA");
	}
	
	@Test
	public void debenSerLeyendasIguales2(){
//		assertEquals(Leyendas.saludar(), "Hi"); //Descomentar para ver efecto del assumeTrue
		Assume.assumeTrue(Leyendas.compararSimilitudLeyendas(Leyendas.saludar(), SALUDO));
		assertEquals(Leyendas.saludar(), SALUDO);
	}

}
