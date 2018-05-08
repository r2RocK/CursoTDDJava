package com.test.tdd;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(PruebasLentas.class)
@SuiteClasses({ ClaseA.class, ClaseB.class })
public class SuitePruebasLentas {
	// Va a correr A.b y B.c, pero no A.a
}
