package com.parimal.demo;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloSpring
{
	public static void main(String[] args)
	{

		var ctx1 = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		System.out.println(ctx1.getBean("name"));
		System.out.println(ctx1.getBean("age"));
		System.out.println(ctx1.getBean("person"));
		System.out.println(ctx1.getBean("person2MethodCall"));

		System.out.println(ctx1.getBean("person3Parameters"));

		System.out.println(ctx1.getBean("address2"));

		System.out.println(ctx1.getBean(Person.class));
		System.out.println(ctx1.getBean(Address.class));

		System.out.println(ctx1.getBean("person5Qualifer"));

		System.out.println("+++++++++++++++++++++++++++++");
		Arrays.stream(ctx1.getBeanDefinitionNames()).forEach(s -> System.out.println(s));

	}

}
