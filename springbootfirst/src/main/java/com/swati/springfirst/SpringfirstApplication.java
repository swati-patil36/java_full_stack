package com.swati.springfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.swati.springfirst.model.Alien;
import com.swati.springfirst.model.Laptop;
import com.swati.springfirst.service.LaptopService;

@SpringBootApplication
public class SpringfirstApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringfirstApplication.class, args);
		System.out.println("Hello! Well Come to SpringBoot.");

		// Alien alienObject = context.getBean(Alien.class);
		// System.out.println(alienObject.getAge());
		// alienObject.code();

		LaptopService service = context.getBean(LaptopService.class);
		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);
	}

}
