package com.wissen.jenkinsdemo.cicd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator c = new Calculator();
	
	@Test
	public void testAdd() {
	assertEquals(15, c.add(10,5));
	}
	
	@Test
	public void testSub() {
	assertEquals(5, c.sub(10,5));
	}

}
