package com.test.tdd;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doReturn;

public class SpyTest {
	
	@Test
	public void deberiaProbarUnSpyIncorrecto() {
	    List<String> lista = new LinkedList<>();
	    //Comentar las dos lineas de abajo para mostrar efecto. 
	    lista.add("Yuliana");
	    lista.add("Armando");
	    
	    List<String> spy = spy(lista);

	    when(spy.get(0)).thenReturn("Hola");
	    when(spy.get(1)).thenReturn("mundo");

	    assertEquals("Hola", spy.get(0));
	    assertEquals("mundo", spy.get(1));
	}
	
	@Test
	public void deberiaProbarUnSpyCorrecto() {
	    List<String> lista = new LinkedList<>();
	    List<String> spy = spy(lista);
	    doReturn("hola").when(spy).get(0);

	    assertEquals("hola", spy.get(0));
	}

}
