package com.parimal.inject;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusnessClass
{

	Dependancy1 dependancy1;

	Dependancy2 dependancy2;

	@Autowired
	public YourBusnessClass(Dependancy1 dependancy1, Dependancy2 dependancy2)
	{
		System.out.println("Constractor Injection --");
		this.dependancy1 = dependancy1;
		this.dependancy2 = dependancy2;
	}

//	@Autowired
//	public void setDependancy1(Dependancy1 dependancy1)
//	{
//		System.out.println("Setter Injection -- 1");
//		this.dependancy1 = dependancy1;
//	}
//
//	@Autowired
//	public void setDependancy2(Dependancy2 dependancy2)
//	{
//		System.out.println("Setter Injection -- 2");
//		this.dependancy2 = dependancy2;
//	}
//
//	public String toString()
//	{
//		return " Using " + dependancy1 + " and " + dependancy2;
//	}
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
public class DeapInject_SetterConstractoeInject
{
	public static void main(String[] args)
	{
		try (var ctx = new AnnotationConfigApplicationContext(DeapInject_SetterConstractoeInject.class)) // same class
																											// name
		{
			Arrays.stream(ctx.getBeanDefinitionNames()).forEach(s -> System.out.println(s));

			System.out.println("==================");
			System.out.println(ctx.getBean(YourBusnessClass.class));
		}
	}

}
