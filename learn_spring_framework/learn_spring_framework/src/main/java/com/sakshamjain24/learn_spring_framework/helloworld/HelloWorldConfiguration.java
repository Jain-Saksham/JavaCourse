package com.sakshamjain24.learn_spring_framework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {};
record Address(String firstLine, String City) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Saksham";
	}
	
	@Bean
	public int age() {
		return 22;
	}
	
	@Bean
	public Person person() {
		return new Person("Vashu",21, new Address("Shantinagar","Rishikesh"));
		
	}
	
	@Bean(name="person2")
	public Person person2MethodCall() {
		return new Person(name(),age(), address());
		
	}
	
	@Bean(name="person3")
	@Primary
	public Person person3Parameters(String name, int age, Address address2) {
		return new Person(name,age, address2);
		
	}
	
	@Bean(name="address2")
	@Primary
	public Address address() {
		return new Address("Jurs Country","Haridwar");
		
	}
	
}
