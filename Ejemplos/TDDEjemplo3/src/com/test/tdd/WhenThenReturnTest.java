package com.test.tdd;

import org.junit.Test;

import com.main.tdd.WhenThenReturn;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.Iterator;

public class WhenThenReturnTest {
	
	@Test
	public void deberiaProbarSentenciaWhenThenReturn()  {
	        //  crear mock
			WhenThenReturn prueba = mock(WhenThenReturn.class);

	        // define valor de retorno para getId()
	        when(prueba.getId()).thenReturn(40);

	        // usar mock en la prueba
	        assertEquals(40, prueba.getId());
	}
	
	// Demuestra el valor de regresar diferentes valores
	@Test
	public void deberiaProbarSentenciaWhenThenReturnMultiple()  {
			Iterator<String> i= mock(Iterator.class);
	        when(i.next()).thenReturn("Hola").thenReturn("mundo");
	        String resultado = i.next()+" "+i.next();
	        assertEquals("Hola mundo", resultado);
	}
	
	// Demuestra como regresar valores dependiendo de la entrada
	@Test
	public void deberiaProbarSentenciaWhenThenReturnPorParametro()  {
	        Comparable<String> c= mock(Comparable.class);
	        when(c.compareTo("Mockito")).thenReturn(1);
	        when(c.compareTo("Eclipse")).thenReturn(2);
	        
	        assertEquals(1, c.compareTo("Mockito"));
	        assertEquals(2, c.compareTo("Eclipse"));
	}
	
	@Test
	public void deberiaProbarSentenciaWhenThenReturnConAnyInt()  {
	        Comparable<Integer> c= mock(Comparable.class);
	        when(c.compareTo(anyInt())).thenReturn(-1);
	        assertEquals(-1, c.compareTo(9));
	}
	
	@Test
	public void deberiaProbarSentenciaWhenThenReturnConIsA()  {
	        Comparable<WhenThenReturn> c= mock(Comparable.class);
	        when(c.compareTo(isA(WhenThenReturn.class))).thenReturn(0);
	        //assert
	        assertEquals(0, c.compareTo(new WhenThenReturn()));
	}


}
