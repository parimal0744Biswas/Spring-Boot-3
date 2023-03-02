package com.parimal.postConstPreDes_10;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomelClass
{

	private SomeDependancy someDependancy;

	@Autowired
	public SomelClass(SomeDependancy someDependancy)
	{
		super();
		this.someDependancy = someDependancy;
		System.out.println("all dependancy are ready");
	}

	@PostConstruct
	public void initialize()
	{
		someDependancy.getReady();
	}

	@PreDestroy
	public void cleanUp()
	{
		System.out.println("CleanUp");
	}

}

@Component
class SomeDependancy
{

	public void getReady()
	{
		System.out.println("Some logic using SomeDependancy");

	}

}

@Configuration
@ComponentScan
public class PreConstrstactApplication
{

	public static void main(String[] args)
	{
		try (var ctx1 = new AnnotationConfigApplicationContext(PreConstrstactApplication.class))
		{
			Arrays.stream(ctx1.getBeanDefinitionNames()).forEach(System.out::println);
		}
	}
}
