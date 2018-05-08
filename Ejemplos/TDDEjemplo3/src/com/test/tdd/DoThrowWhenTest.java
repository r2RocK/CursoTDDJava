package com.test.tdd;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mock;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doThrow;

import java.util.Properties;

import org.junit.Test;

public class DoThrowWhenTest {
	
//	@Test
//	public void deberiaProbarSentenciaDoThrowWhen(){
//		Properties properties = new Properties();
//		Properties spyProperties = spy(properties);
//		doThrow(new IllegalArgumentException("Cadena es incorrecta")).when(spyProperties).get("Holla");
//
//		try {
//		    assertEquals("mundo", spyProperties.get("Holla"));
//		} catch (IllegalArgumentException ex) {
//		    System.err.println(ex.getMessage());
//		    for(StackTraceElement elemento : ex.getStackTrace()){
//		    	System.err.println(elemento.toString());
//		    }
//		}
//	}
	
	@Test
	public void deberiaProbarSentenciaDoThrowWhenMock(){
		Properties propiedades = mock(Properties.class);
		doThrow(new IllegalArgumentException("Cadena es incorrecta")).when(propiedades).get("Holla");

		try {
		    assertEquals("mundo", propiedades.get("Holla"));
		} catch (IllegalArgumentException ex) {
		    System.err.println(ex.getMessage());
		    for(StackTraceElement elemento : ex.getStackTrace()){
		    	System.err.println(elemento.toString());
		    }
		}
	}

}
