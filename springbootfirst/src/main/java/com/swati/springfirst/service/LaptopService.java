package com.swati.springfirst.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import com.swati.springfirst.repo.LaptopRepository;
import com.swati.springfirst.model.Laptop;

@Service 
public class LaptopService {

    @Autowired 
    private LaptopRepository repo;

    public void addLaptop(Laptop lap) {
        System.out.println("addLaptop Method called");
        repo.save(lap);
    }

    public boolean isGoodForProg(Laptop lap) {
        return true;
    }

}
