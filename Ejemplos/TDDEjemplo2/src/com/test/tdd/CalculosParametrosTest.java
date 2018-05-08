package com.test.tdd;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.main.tdd.Calculos;

@RunWith(Parameterized.class)
public class CalculosParametrosTest {

	// campos usados con @Parameter deben ser publicos
    @Parameter(0)
    public int num1;
    @Parameter(1)
    public int num2;
    @Parameter(2)
    public int resultado;

    public static int multiplicarNumeros(int num1, int num2){
		return num1 * num2;
	}

    // creates the test data
    @Parameters
    public static Collection<Object[]> data() {
        Object[][] datos = new Object[][] { { 1 , 2, 2 }, { 5, 3, 15 }, { 121, 4, 484 } };
        return Arrays.asList(datos);
    }
    
    @Test
    public void pruebaResultadoEquivalenteMultiplicacion() {
        assertEquals(resultado, multiplicarNumeros(num1, num2));
    }
	
}

