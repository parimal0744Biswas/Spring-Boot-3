package com.parimal.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SomeBusinessImplTest
{

	@Test
	void findTheGreatestFromAllData_basicSenario()
	{
		DataServiceStub dataServiceStub = new DataServiceStub();
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(25, result);

	}

}

class DataServiceStub implements DataService
{

	@Override
	public int[] retriveAllData()
	{
		return new int[]
		{ 25, 15, 5 };
	}

}
