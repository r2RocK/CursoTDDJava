package com.test.tdd;

import java.util.Properties;

import org.junit.Test;
import static org.mockito.Mockito.spy;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;

public class DoReturnWhenTest {
	
	@Test
	public void deberiaProbarSentenciaDoReturnWhen(){
		Properties properties = new Properties();
		Properties spyProperties = spy(properties);
		doReturn("mundo").when(spyProperties).get("Marco");
		assertEquals("mundo", spyProperties.get("Marco"));
	}
	
	@Test
	public void deberiaProbarSentenciaDoReturnWhenMultiple(){
		Properties properties = new Properties();
		Properties spyProperties = spy(properties);
		doReturn("mundo").doReturn(" y Arturo").when(spyProperties).get("hola");
		String cadena = (String) spyProperties.get("hola");
		cadena += (String) spyProperties.get("hola");
		assertEquals("mundo y Arturo", cadena);
	}

}
