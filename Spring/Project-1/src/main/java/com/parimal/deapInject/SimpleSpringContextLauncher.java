package com.parimal.deapInject;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SimpleSpringContextLauncher
{
	public static void main(String[] args)
	{
		try (var ctx = new AnnotationConfigApplicationContext(SimpleSpringContextLauncher.class)) // same class name
		{
			Arrays.stream(ctx.getBeanDefinitionNames()).forEach(s -> System.out.println(s));

		}
	}

}
