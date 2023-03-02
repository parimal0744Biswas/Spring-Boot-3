package com.parimal.dualMax_7;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BusnessCalculationService
{

	private DataService dataService;

	@Autowired
	public BusnessCalculationService(@Qualifier("mongoDBService") DataService dataService)
	{
		super();
		this.dataService = dataService;
	}

	public int findMax()
	{
		return Arrays.stream(dataService.retriveData()).max().orElse(0);
	}

}
