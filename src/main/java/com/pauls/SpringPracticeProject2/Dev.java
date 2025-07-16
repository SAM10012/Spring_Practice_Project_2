package com.pauls.SpringPracticeProject2;
import org.springframework.stereotype.Component;


// @Component Annotation helps Spring to understand which class's object it is supposed to create and manage inside IOC Container.
@Component
public class Dev {

    public void build()
    {
        System.out.println("Working on Awesome Project!");

    }
}
