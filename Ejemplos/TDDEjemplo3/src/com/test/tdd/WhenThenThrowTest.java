package com.test.tdd;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Properties;

import org.junit.Test;

public class WhenThenThrowTest {
	
	@Test
	public void deberiaProbarSentenciaWhenThenThrow(){
		Properties properties = mock(Properties.class);

		when(properties.get("Holla")).thenThrow(new IllegalArgumentException("Cadena es incorrecta"));

		try {
		    properties.get("Holla");
		} catch (IllegalArgumentException ex) {
		    System.err.println(ex.getMessage());
		    for(StackTraceElement elemento : ex.getStackTrace()){
		    	System.err.println(elemento.toString());
		    }
		}
	}

}
