package com.parimal.junit_01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MyMathTest
{

	@Test
	void test()
	{
		int[] num =
		{ 1, 2, 3 };

		MyMath math = new MyMath();
		int result = math.calculateSum(num);
		System.out.println(result);
		// fail("Not yet implemented");

		int expectedResult = 5;
		assertEquals(expectedResult, result);
	}

}
