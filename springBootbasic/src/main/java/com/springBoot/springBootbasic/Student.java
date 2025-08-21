package com.springBoot.springBootbasic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    public Student (){
        System.out.println("Bean created");
    }

    @Autowired
    Laptop lap;

    public void code(){
        lap.compile();
        System.out.println("Coding");
    }
}
