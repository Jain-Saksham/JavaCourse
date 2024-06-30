package com.sakshamjain24.learn_spring_framework.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App02HwlloWorldSpring {

	public static void main(String[] args) {
		//1: Launch a Spring Context
		
		try(var context=new AnnotationConfigApplicationContext(HelloWorldConfiguration.class))
		{
			//2: Configure the things that we want Spring to manage 
			// HelloWorldConfiguration -- @Configuration
			// name -- @Bean
			
			//3: Retrieving Beans managed by Spring
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("person2"));
			System.out.println(context.getBean("person3"));
			System.out.println(context.getBean("address2"));
			System.out.println(context.getBean(Address.class));
			
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);

		}
				
	}

}
