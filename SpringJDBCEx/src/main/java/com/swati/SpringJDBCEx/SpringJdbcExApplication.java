package com.swati.SpringJDBCEx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.swati.SpringJDBCEx.model.Student;
import com.swati.SpringJDBCEx.service.StudentService;
import java.util.List;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcExApplication.class, args);

		Student s1 = context.getBean(Student.class);
		s1.setRollNo(104);
		s1.setName("Varsha");
		s1.setMarks(65);

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s1);

		List<Student> students = service.getStudents();
		System.out.println(students);
	}

}
