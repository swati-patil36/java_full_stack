package com.swati;

import java.beans.ConstructorProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component    // here along with the @Component("Name_of_the_bean") if not it takes the name of the bean as the name of the class with only 1st letter as small i.e., alien
public class Alien {

    @Value("60")
    private int age;

    @Autowired 
    @Qualifier("laptop") // here my bean name is the class name but with first letter as small & @Qualifier annotation is used to assign it as primary when there are more than 2 beans
    private Computer com; // creating a reference of Computer interface inside Alien class

    public Alien() {
        System.out.println("Alien Object created");
    }

    public void setAge(int age) {
        //System.out.println("Setter called");
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }
    
    public void code(){
        System.out.println("Coding");
        com.compile();
    }

}
