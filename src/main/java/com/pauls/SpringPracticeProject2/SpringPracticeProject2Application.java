package com.pauls.SpringPracticeProject2;
import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringPracticeProject2Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringPracticeProject2Application.class, args);
		Dev obj = context.getBean(Dev.class);
		obj.build();
	}

}
