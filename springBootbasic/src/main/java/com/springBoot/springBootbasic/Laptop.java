package com.springBoot.springBootbasic;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    public Laptop(){
        System.out.println("Laptop bean created");
    }
    public void compile(){
        System.out.println("Compiling");
    }
}
