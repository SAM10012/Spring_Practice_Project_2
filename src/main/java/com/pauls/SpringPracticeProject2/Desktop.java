package com.pauls.SpringPracticeProject2;

import com.pauls.SpringPracticeProject2.Computer;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

    @Override
    public void compile(){
        System.out.println("Compiling in Desktop.");

    }
}