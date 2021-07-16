package com.saurabh;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
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
	@DisplayName("Add")
	void testAdd() {
		int actual = mu.add(10, 20);
		assertEquals(30, actual);
	}
	
	@Test
	void testComputeCircleArea() {
		double actual = mu.computeCircleArea(10);
		assertEquals(314, actual);
	}
	
	@Test
	void testDivide() {
		assertThrows(ArithmeticException.class , () -> {
			mu.divide(10,0);	
		}, "asset throws !!");
		
	}

}
