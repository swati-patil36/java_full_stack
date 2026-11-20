package com.swati.springfirst.repo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.swati.springfirst.model.Laptop;

//Class responsible for Database connection
@Repository 
public class LaptopRepository {
    public void save(Laptop lap){
        System.out.println("Saved in Database...");
    }
    
}
