package com.parimal.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address)
{

};

record Address(String firstLine, String city)
{

};

@Configuration
public class HelloWorldConfiguration
{
	@Bean
	public String name()
	{
		return "Parimal";
	}

	@Bean
	public int age()
	{
		return 12;
	}

	@Bean
	public Person person()
	{
		return new Person("parimal", 25, new Address("main Street", "Kolkata"));

	}

	@Bean
	public Person person2MethodCall()
	{
		return new Person(name(), age(), address()); // name, age

	}

	@Bean
	public Person person3Parameters(String name, int age, Address address3) // name, age, address2
	{
		return new Person(name, age, address3);

	}

	@Bean
	@Primary
	public Person person4Parameters(String name, int age, Address address) // name, age, address2
	{
		return new Person(name, age, address);

	}

	@Bean
	public Person person5Qualifer(String name, int age, @Qualifier("address3qualifier") Address address) // name, age,
																											// address2
	{
		return new Person(name, age, address);

	}

	@Bean(name = "address2")
	@Primary
	public Address address()
	{
		return new Address("Howrah", "Kolkata");

	}

	@Bean(name = "address3")
	@Qualifier("address3qualifier")
	public Address address3()
	{
		return new Address("Hydrabad", "Tel");

	}

}
