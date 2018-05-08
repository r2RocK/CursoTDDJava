package com.test.tdd;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	CalculosTest.class,
	CalculosBisTest.class
})
public class CalculosSuiteTest {

}

