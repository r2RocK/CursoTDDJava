package com.test.tdd;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(PruebasLentas.class)
@ExcludeCategory(PruebasRapidas.class)
@SuiteClasses({ ClaseA.class, ClaseB.class })
public class SuiteSinPruebasRapidas {
	// Va a correr A.b, pero no A.a or B.c
}
