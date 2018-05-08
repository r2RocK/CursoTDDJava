package com.test.tdd;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Ignore;
import org.junit.Test;

import com.main.tdd.Calculos;

public class CalculosBisTest {
	
	@Ignore("Solo para efectos de prueba de la afirmacion fail")
//	@Test
//	public void debeFallar(){
//		fail("Forzado a fallar");
//	}
	
	@Test
	public void debeObtenerNumeroNegativo(){
		assertTrue(String.valueOf(Calculos.obtenerNumeroNegativo()).contains("-"));
	}
	
	@Test
	public void debeObtenerNumeroPositivo(){
		assertFalse(String.valueOf(Calculos.obtenerNumeroAleatorio()).contains("-"));
	}
	
	@Test
	public void debeObtenerNumeroNulo(){
		Calculos calculos = new Calculos();
		assertNull(calculos.getNumero());
	}
	
	@Test
	public void debeObtenerNumeroNoNulo(){
		Calculos calculos = new Calculos();
		calculos.setNumero(1);
		assertNotNull(calculos.getNumero());
	}
	
	@Test
	public void debeObtenerObjetosIguales(){
		Calculos calculos = new Calculos();
		calculos.setNumero(new Integer(1));
		Calculos calculos2 = new Calculos();
		calculos2.setNumero(new Integer(1));
		assertSame(calculos.getNumero(), calculos2.getNumero());
	}
	
	@Test
	public void debeObtenerObjetosDiferentes(){
		Calculos calculos = new Calculos();
		calculos.setNumero(1);
		assertNotSame(calculos.getNumero(), new Integer(1));
	}

}
