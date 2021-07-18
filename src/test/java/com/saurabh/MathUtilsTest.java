package com.saurabh;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.function.Supplier;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
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
	@DisplayName("Assert All demo")
	@Tag("Math")
	void testAdd() {
		
		assertAll(
				() -> assertEquals(4, mu.add(2, 2)),
				() -> assertEquals(12, mu.add(12, 0)),
				() -> assertEquals(23, mu.add(12, 11))
				);
	}
	
	
	
	@Nested
	@DisplayName("Add Method")
	class AddTest {
		
		Supplier<String> messageSupplier = () -> "saurabh";
		@Test
		void testComputeCircleArea() {
			double actual = mu.computeCircleArea(10);
			assertEquals(314, actual, messageSupplier );
		}
	
	
	}
	
//	@Test
	@RepeatedTest(3)
	void testDivide() {

		assertThrows(ArithmeticException.class , () -> {
			mu.divide(10,0);	
		}, "asset throws !!");
		
	}

}
