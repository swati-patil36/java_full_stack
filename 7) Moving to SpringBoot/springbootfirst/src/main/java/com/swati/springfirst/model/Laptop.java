package com.swati.springfirst.model;

import org.springframework.stereotype.Component;

@Component 
public class Laptop implements Computer{


    public void compile() {
    
        System.out.println("Compiling code in Laptop");
    }

}
