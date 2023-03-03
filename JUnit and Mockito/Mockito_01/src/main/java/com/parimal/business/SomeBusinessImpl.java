package com.parimal.business;

public class SomeBusinessImpl
{

	private DataService dataService;

	public SomeBusinessImpl(DataService dataService)
	{
		super();
		this.dataService = dataService;
	}

	public int findTheGreatestFromAllData()
	{
		int[] retriveAllData = dataService.retriveAllData();

		int greatestValue = Integer.MIN_VALUE;

		for (int value : retriveAllData)
		{
			if (value > greatestValue)
			{
				greatestValue = value;
			}
		}

		return greatestValue;
	}
}

interface DataService
{
	int[] retriveAllData();

}