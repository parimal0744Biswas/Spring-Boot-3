package com.parimal.lazy_8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA
{

}

@Component
@Lazy
class ClassB
{
	private ClassA cA;

	@Autowired
	public ClassB(ClassA cA)
	{
		super();
		System.out.println("Some initialization logic in Xlass B Constractor");
		this.cA = cA;
	}

	public void doSomething()
	{
		System.out.println("Do Something");
	}

}

@Configuration
@ComponentScan
public class LazyInitialization
{
	public static void main(String[] args)
	{

		try (var ctx1 = new AnnotationConfigApplicationContext(LazyInitialization.class))
		{
			// Arrays.stream(ctx1.getBeanDefinitionNames()).forEach(s ->
			// System.out.println(s));
			ctx1.getBean(ClassB.class).doSomething();
		}
	}

}
