package com.parimal.XImportant;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("SuperContractGameX_Qualifier")
@Component
public class SuperContractGameX implements GamingConsoleX_I
{

	public void up()
	{
		System.out.println("up");
	}

	public void down()
	{
		System.out.println("Shit Down");
	}

	public void left()
	{
		System.out.println("Go Back");
	}

	public void right()
	{
		System.out.println("Shoot a boolet");
	}

}
