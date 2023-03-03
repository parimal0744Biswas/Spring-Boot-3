package com.parimal.junit_01;

import java.util.Arrays;

public class MyMath
{
	public int calculateSum(int[] numbers)
	{
		return Arrays.stream(numbers).reduce(0, (c, e) -> c + e);
	}

}
