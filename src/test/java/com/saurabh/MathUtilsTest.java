package com.saurabh;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Random;
import java.util.function.*;

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
	@DisplayName("all 3 should work")
	void testAdd() {
		
		assertAll(
				() -> assertEquals(4, mu.add(2, 2)),
				() -> assertEquals(12, mu.add(12, 0)),
				() -> assertEquals(23, mu.add(12, 11))
				);
	}
	
	@DisplayName("Main() ...")
	 static int getTwoDigitRandom() {
		Random r = new Random();
		return r.nextInt(32);
		
	}

	@Test
	@DisplayName("Main() ...")
	void testComputeMain() {
//		BiConsumer<String, String> first = (t, u) -> System.out.println(t.toUpperCase() + u.toUpperCase());
//		BiConsumer<String, String> second = (t, u) -> System.out.println(t.toLowerCase() + u.toLowerCase());
//		first.andThen(second).accept("this is t", "this is u");

		 
        Supplier<Integer> supplier1 = MathUtilsTest::getTwoDigitRandom;

		IntSupplier supplier2 =  () -> 1; // lambda expression
		IntSupplier supplier3 =  MathUtilsTest::getTwoDigitRandom; // method reference
		System.out.println("supper 2: " + supplier3.getAsInt());
    
        System.out.println("supper 1: " + supplier1.get());
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
		
		@Test
		void testDivide() {
			assertThrows(ArithmeticException.class , () -> {
				mu.divide(10,0);	
			}, "asset throws !!");
			
		}
	}

}
