package com.pauls.SpringPracticeProject2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringPracticeProject2Application {

	public static void main(String[] args) {

		// SpringApplication.run() creates and returns the IOC Container inside JVM. The IOC Container is of a class that implements interface called ApplicationContext.
		ApplicationContext context = SpringApplication.run(SpringPracticeProject2Application.class, args);

		// Asking Spring to get the object of Dev class from the IOC Container called context using getBean method.
		Dev obj = context.getBean(Dev.class);

		// Using method of the object
		obj.build();
	}

}
