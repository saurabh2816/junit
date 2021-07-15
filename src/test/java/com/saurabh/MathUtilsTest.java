package com.saurabh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void test() {
		MathUtils mu = new MathUtils();
		int actual = mu.add(10, 20);
		assertEquals(30, actual);
	}

}
