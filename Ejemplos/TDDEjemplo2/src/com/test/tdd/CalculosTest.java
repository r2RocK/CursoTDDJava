package com.test.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.main.tdd.Calculos;

public class CalculosTest {
	
	public static Integer numNeg1;
	public static Integer numPos1;
	public static Integer numPos2;
	
	@Test
	public void debeObtenerNumeroNegativo(){
		System.out.println("Ejecutando metodo de prueba debeObtenerNumeroNegativo");
		assertEquals(Boolean.TRUE, String.valueOf(Calculos.obtenerNumeroNegativo()).contains("-") );
	}
	
	@Test
	public void debeObtenerNumeroPositivo(){
		System.out.println("Ejecutando metodo de prueba debeObtenerNumeroPositivo");
		assertEquals(Boolean.FALSE, String.valueOf(Calculos.obtenerNumeroAleatorio()).contains("-"));
	}
	
//	@Ignore("Para efectos de prueba de la anotacion @BeforeClass")
	@BeforeClass
	public static void debePrellenarVariablesGlobales(){
		System.out.println("Ejecutando metodo de prueba debePrellenarVariablesGlobales");
		System.out.println("Antes: numNeg1 = "+ numNeg1 + " | numPos1 = " + numPos1 + " | numPos2 = "+ numPos2);
		numNeg1 = Calculos.obtenerNumeroNegativo();
		numPos1 = Calculos.obtenerNumeroAleatorio();
		numPos2 = Calculos.obtenerNumeroAleatorio();
		System.out.println("Despues: numNeg1 = "+ numNeg1 + " | numPos1 = " + numPos1 + " | numPos2 = "+ numPos2);
	}
	
	@Before
	public void debeObtenerNumeroNegativoCuandoMultiplicaUnPositivoyUnNegativo(){
		System.out.println("Ejecutando metodo de prueba debeObtenerNumeroNegativoCuandoMultiplicaUnPositivoyUnNegativo");
		int resultadoOperacion = Calculos.multiplicarNumeros(numNeg1, numPos1);
		System.out.println("resultado = "+resultadoOperacion);
		assertEquals(Boolean.TRUE, String.valueOf(resultadoOperacion).contains("-"));
	}
	
//	@After
//	public void debeObtenerNumeroPositivoCuandoMultiplicaDosPositivos(){
//		System.out.println("Ejecutando metodo de prueba debeObtenerNumeroPositivoCuandoMultiplicaDosPositivos");
//		assertEquals(Boolean.FALSE, String.valueOf(Calculos.multiplicarNumeros(numPos1, numPos2)).contains("-"));
//	}
//	
//	@AfterClass
//	public static void debeLimpiarVariablesGlobales(){
//		System.out.println("Ejecutando metodo de prueba debeLimpiarVariablesGlobales");
//		System.out.println("Antes: numNeg1 = "+ numNeg1 + " | numPos1 = " + numPos1 + " | numPos2 = "+ numPos2);
//		numNeg1 = null;
//		numPos1 = null;
//		numPos2 = null;
//		System.out.println("Despues: numNeg1 = "+ numNeg1 + " | numPos1 = " + numPos1 + " | numPos2 = "+ numPos2);
//	}
	
//	@Ignore("Para efectos de la prueba de timeout")
//	@Test(timeout = 20)
//	public void debeLanzarExcepcionPorTiempo(){
//		System.out.println("Ejecutando metodo de prueba debeLanzarExcepcionPorTiempo");
//		do{
//			int resultado = numNeg1 + numPos1;
//		}while(true);
//	}
	
//	@Test(expected = NullPointerException.class)
//	public void debeLanzarExcepcionPorNull(){
//		System.out.println("Ejecutando metodo de prueba debeLanzarExcepcionPorNull");
//		Calculos calculos = null;
////		Calculos calculos = new Calculos();
//		calculos.setNumero(0);
//		int numero = calculos.getNumero();
//		System.out.println("El numero es: "+numero);
//	}

}
