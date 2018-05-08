package com.test.tdd;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.main.tdd.ControladorUsuario;
import com.main.tdd.Tarjeta;
import com.main.tdd.Usuario;

@RunWith(MockitoJUnitRunner.class)
public class InjectMocksTest {
	
	@Mock Usuario usuario;
	@Mock Tarjeta tarjeta;

	@InjectMocks private ControladorUsuario controlador; 

	@Test 
	public void deberiaAsociarTarjetaAUsuario() {
		// Invoca al metodo del controlador al que le fueron inyectados los mocks
	    controlador.asociarTarjetaAUsuario();

	    // Valida que efectivamente el asociar la tarjeta haya sido invocado. 
	    verify(usuario).setTarjeta(any(Tarjeta.class));
	}

}
