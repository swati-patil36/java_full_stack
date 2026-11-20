package com.swati;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.swati.config.AppConfig;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        // Desktop dt = context.getBean(Desktop.class);
        // Desktop dt1 = context.getBean("desktop1", Desktop.class);
        // dt1.compile();

        // Desktop dt2 = context.getBean("desktop1", Desktop.class);
        // dt2.compile();

        Alien obj1 = context.getBean(Alien.class);
        //obj1.setAge(25);
        System.out.println(obj1.getAge());
        obj1.code();


        
    }
}
