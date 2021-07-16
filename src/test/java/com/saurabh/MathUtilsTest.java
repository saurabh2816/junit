package com.saurabh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void testAdd() {
		MathUtils mu = new MathUtils();
		int actual = mu.add(10, 20);
		assertEquals(30, actual);
	}
	
	@Test
	void testComputeCircleArea() {
		MathUtils mu = new MathUtils();
		double actual = mu.computeCircleArea(10);
		assertEquals(314, actual);
	}
	
	@Test
	void testDivide() {
		MathUtils mu = new MathUtils();
		
		assertThrows(ArithmeticException.class , () -> {
			mu.divide(10,0);	
		}, "asset throws !!");
		
	}

}
