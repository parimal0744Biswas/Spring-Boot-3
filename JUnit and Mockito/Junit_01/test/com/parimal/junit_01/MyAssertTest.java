package com.parimal.junit_01;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyAssertTest
{
	List<String> todos = Arrays.asList("AWS", "Cloud", "DevOps");

	@Test
	void test()
	{
		boolean test = todos.contains("AWS");
		assertEquals(true, test);
		assertEquals(3, todos.size(), "shoud be size 3");

		assertArrayEquals(new int[]
		{ 1, 2 }, new int[]
		{ 1, 2 });

	}

}
