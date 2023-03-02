package com.parimal.deapInject;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusnessClass
{
	@Autowired
	Dependancy1 dependancy1;
	@Autowired
	Dependancy2 dependancy2;

	public String toString()
	{
		return " Using " + dependancy1 + " and " + dependancy2;
	}
}

@Component
class Dependancy1
{

}

@Component
class Dependancy2
{

}

@Configuration
@ComponentScan
public class DeapInject_2
{
	public static void main(String[] args)
	{
		try (var ctx = new AnnotationConfigApplicationContext(DeapInject_2.class)) // same class name
		{
			Arrays.stream(ctx.getBeanDefinitionNames()).forEach(s -> System.out.println(s));

			System.out.println("==================");
			System.out.println(ctx.getBean(YourBusnessClass.class));
		}
	}

}
