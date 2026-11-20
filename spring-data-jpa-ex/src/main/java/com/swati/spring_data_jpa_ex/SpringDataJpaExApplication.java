package com.swati.spring_data_jpa_ex;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import com.swati.spring_data_jpa_ex.model.Student;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

		// s1.setRollNo(101);
		// s1.setName("Swati");
		// s1.setMarks(90);

		s2.setRollNo(102);
		s2.setName("Priya");
		s2.setMarks(80);

		// s3.setRollNo(103);
		// s3.setName("Rohit");
		// s3.setMarks(70);	

		// // repo.save(s1);
		// repo.save(s2);
		// repo.save(s3);

		System.out.println(repo.findAll());
		System.out.println(repo.findById(103));
		System.out.println(repo.findByName("Riya"));
		System.out.println(repo.findByMarks(90));
		System.out.println(repo.findByMarksGreaterThan(60));

		repo.save(s2);
		// repo.deleteById(103);
		// repo.delete(s2);
	}

}
