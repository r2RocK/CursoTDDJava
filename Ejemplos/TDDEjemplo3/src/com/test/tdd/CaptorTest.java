package com.test.tdd;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.junit.MockitoJUnitRunner;

//Recordatorio: Mockito inicializa los mocks con este runner
@RunWith(MockitoJUnitRunner.class)
public class CaptorTest {

	//Elemento que va a contener lo que se haya ejecutado, debe ser del tipo del objeto que queremos capturar
    @Captor
    private ArgumentCaptor<List<String>> captor;

    @Test
    public final void deberiaContenerCiertosElementos() {
        List<String> lista = Arrays.asList("unElemento", "dosElementos");
        final List<String> listaMock = mock(List.class);
        listaMock.addAll(lista);

        verify(listaMock).addAll(captor.capture());
        final List<String> argumentosCapturados = captor.getValue();
        for(String argumento : argumentosCapturados){
        	System.out.println(argumento);
        }
    }
	
}
