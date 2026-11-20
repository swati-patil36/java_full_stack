package com.swati.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.swati.Alien;
import com.swati.Computer;
import com.swati.Desktop;
import com.swati.Laptop;

@Configuration 
@ComponentScan(basePackages = "com.swati")
public class AppConfig {
/*Here we are defining the beans
but we can minimize the java config file by using @Componet on top every class were we wanted to create the object along with @ComponentScan("com.swati") annotaion int the config file */

    // // @Bean("name_of_bean")  // we can give name to bean using this way, if not by defalt the name of the bean will be the name of the method i.e desktop1 here & also we can give multiple names for it in an array format like @Bean({"desktop1", "desktop2"})
    // @Bean 
    // //@Scope ("prototype") // by default the scope of the bean is singleton, if we want to create a new object every time we call it then we can use prototype scope
    // public Desktop desktop1() {
    //     return new Desktop();
    // }

    // @Bean 
    // public Alien alien(@Qualifier("laptop")  Computer com) {    // @autowired is optional @Qualifier helps to refer which bean we need when 2 bean share the same interface or we can add @Primary annotation to prefered bean
    //     Alien obj = new Alien();
    //     obj.setAge(27);
    //     //obj.setCom(desktop1()); //what if we need it from laptop, so for that we can directly pass in the constructor only if that is defined in the config file
    //     obj.setCom(com);
    //     return obj;
    //     //return new Alien();
        
    // }

    // @Bean 
    // public Laptop laptop() {
    //     return new Laptop();
    // }
    
}
