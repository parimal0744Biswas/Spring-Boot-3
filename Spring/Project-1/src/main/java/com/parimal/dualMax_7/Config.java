package com.parimal.dualMax_7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Config
{
	public static void main(String[] args)
	{
		try (var ctx1 = new AnnotationConfigApplicationContext(Config.class))
		{
			Object object = ctx1.getBean(BusnessCalculationService.class).findMax();

			System.out.println("--------------------------------------");
			System.out.println(object);
		}
	}

}
