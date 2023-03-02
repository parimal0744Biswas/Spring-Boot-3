package com.parimal.dualMax_7;

import org.springframework.stereotype.Component;

@Component
public class MySQLService implements DataService
{

	@Override
	public int[] retriveData()
	{
		return new int[]
		{ 1, 2, 3, 4, 5 };
	}

}
