package com.saurabh;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

	MathUtils mu;
	
	@BeforeEach
	void init() {
		mu = new MathUtils();
	}
	
	@BeforeAll 
	static void testBeforeAllMethod() {
		System.out.println("Before all");
	}

	@Test
	void testAdd() {
	
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
