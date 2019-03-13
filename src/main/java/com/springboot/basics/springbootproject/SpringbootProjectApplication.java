package com.springboot.basics.springbootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication      //Spring Context file, also enables AUTO CONFIGURATION
public class SpringbootProjectApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext =
				SpringApplication.run(SpringbootProjectApplication.class, args);

		for (String name: applicationContext.getBeanDefinitionNames()) {

			//System.out.println(name);  //List of things getting Configured automatically by Spring Boot

//Spring Boot Auto Configure - provided by DispatcherServletAutoConfiguration.java Class in package org.springframework.boot.autoconfigure.web.servlet;
//Creates Beans
//Spring Boot looks at the Frameworks available in the CLASSPATH and for Existing
//configuration for the application. Based on these, Spring Boot provides basic configuration
//needed to configure the application with these frameworks

//All these Frameworks are located in the Project under External Libraries

//to see all these Frameworks being Auto Configured when Application starts
//put - logging.level.org.springframework = DEBUG in application.properties file


		}
	}
}
