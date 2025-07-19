package com.pauls.SpringPracticeProject2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


// @Component Annotation helps Spring to understand which class's object it is supposed to create and manage inside IOC Container.
@Component
public class Dev{

    //private Laptop laptop = new Laptop(); => This will work, but we need Spring to create and handle objects.

    // Due to @Component annotation, there are 2 objects inside IOC, Dev object and Laptop object. Now, we need to connect those two objects(to be done by Spring, not by using new keyword).

    // Way 1 of connecting 2 objects: Field Injection (Autowired Annotation mandatory)
    /*@Autowired
    private Laptop laptop;*/

    // Way 2 of connecting 2 objects: Constructor Injection (Autowired Annotation optional)

    /*private Laptop laptop;

    public Dev(Laptop laptop){
        this.laptop = laptop;
    }*/

    // Way 3 of connecting 2 objects: Setter Injection (Autowired Annotation mandatory)

    /*private Laptop laptop;

    @Autowired
    public void setLaptop(Laptop laptop)
    {
        this.laptop = laptop;
    }*/

    @Autowired
    @Qualifier("laptop")
    private Computer comp;
    public void build()
    {
        comp.compile();
        System.out.println("Working on Awesome Project!");

    }
}
