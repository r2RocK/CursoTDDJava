package com.test.tdd;

import org.junit.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

import com.main.tdd.Verify;

import static org.mockito.Mockito.*;

public class VerifyTest {
	
	@Test
	public void deberiaProbarSentenciaVerify()  {
	    // crear y configurar mock
	    Verify prueba = Mockito.mock(Verify.class);
	    when(prueba.getId()).thenReturn(43);


	    // llamando los metodos sobre la clase mock
	    prueba.probando(3);
	    prueba.getId();
	    prueba.getId();
//	    prueba.algunMetodo("");


	    // ahora valida si se invoco el metodo con el parametro que necesitas
	    verify(prueba).probando(ArgumentMatchers.eq(3));

	    // el metodo getId() se invoco 2 veces?
	    verify(prueba, times(2)).getId();

	    // otras alternativas para verificar el numero de llamados a un metodo
	    verify(prueba, never()).algunMetodo("nunca llamado");
//	    verify(prueba, atLeastOnce()).algunMetodo("al menos una vez");
//	    verify(prueba, atLeast(2)).algunMetodo("al menos dos veces");
//	    verify(prueba, times(5)).algunMetodo("llamado 5 veces");
//	    verify(prueba, atMost(3)).algunMetodo("llamado maximo 3 veces");
	    
//	    prueba.algunMetodo("una ultima interaccion");
	    // Verifica ahora que ya no hubo mas invocaciones al objeto mock. 
	    verifyNoMoreInteractions(prueba);
	}

}
