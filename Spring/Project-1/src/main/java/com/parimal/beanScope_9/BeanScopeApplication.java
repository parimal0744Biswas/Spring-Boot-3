package com.parimal.beanScope_9;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass
{

}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass
{

}

@Configuration
@ComponentScan
public class BeanScopeApplication
{

	public static void main(String[] args)
	{
		try (var ctx1 = new AnnotationConfigApplicationContext(BeanScopeApplication.class))
		{
			System.out.println("++++++++++++++++++++++++++++++");
			System.out.println(ctx1.getBean(NormalClass.class));
			System.out.println(ctx1.getBean(NormalClass.class));
			System.out.println(ctx1.getBean(NormalClass.class));
			// Arrays.stream(ctx1.getBeanDefinitionNames()).forEach(s ->
			// System.out.println(s));
			System.out.println("*******************************");
			System.out.println(ctx1.getBean(PrototypeClass.class));
			System.out.println(ctx1.getBean(PrototypeClass.class));
			System.out.println(ctx1.getBean(PrototypeClass.class));
		}
	}
}
