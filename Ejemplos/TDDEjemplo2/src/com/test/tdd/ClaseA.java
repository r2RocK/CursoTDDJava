package com.test.tdd;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ClaseA {
	
	@Test
    public void metodoA() {
        fail();
    }

    @Category(PruebasLentas.class)
    @Test
    public void metodoB() {
    }

}
