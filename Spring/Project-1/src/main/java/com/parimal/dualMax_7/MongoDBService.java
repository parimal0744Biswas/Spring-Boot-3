package com.parimal.dualMax_7;

import org.springframework.stereotype.Component;

@Component
public class MongoDBService implements DataService
{

	@Override
	public int[] retriveData()
	{
		return new int[]
		{ 11, 22, 33, 44, 55 };
	}

}
