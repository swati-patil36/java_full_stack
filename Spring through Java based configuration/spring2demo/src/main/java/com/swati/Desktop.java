package com.swati;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component 
//@Primary // to make it primary choice between the beans
//Drawback of @Primary is it can be overriden by the @Qualifier annotation
public class Desktop implements Computer {
    public Desktop() {
        System.out.println("Desktop object created");
    }

    @Override
    public void compile() {
        System.out.println("Compiling using Desktop");
    }
    
}
