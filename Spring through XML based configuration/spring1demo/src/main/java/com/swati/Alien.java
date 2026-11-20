package com.swati;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;
    //but this what we dont want to do creating object mannually
    //Laptop lap = new Laptop(); // creating a new object of Laptop class inside Alien class
    //private Laptop lap; // creating a reference of Laptop class inside Alien class
    private Computer com; // creating a reference of Computer interface inside Alien class

    public Alien() {
        //System.out.println("Object created");
    }

    // assigning the valuse through constructor injection
    // @ConstructorProperties ({"age", "lap"})
    // public Alien(int age, Laptop lap) {
    //     System.out.println("Para constructor called");
    //     this.age = age;
    //     this.lap = lap;
    // }

    public void setAge(int age) {
        //System.out.println("Setter called");
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    // public Laptop getLap() {
    //     return lap;
    // }

    // public void setLap(Laptop lap) {
    //     this.lap = lap;
    // }

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
