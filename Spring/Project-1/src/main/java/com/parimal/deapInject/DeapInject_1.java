package com.parimal.deapInject;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class DeapInject_1
{
	public static void main(String[] args)
	{
		try (var ctx = new AnnotationConfigApplicationContext(DeapInject_1.class)) // same class name
		{
			Arrays.stream(ctx.getBeanDefinitionNames()).forEach(s -> System.out.println(s));

		}
	}

}
