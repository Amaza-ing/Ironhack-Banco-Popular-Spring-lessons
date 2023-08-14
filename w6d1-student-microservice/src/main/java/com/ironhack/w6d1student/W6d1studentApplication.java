package com.ironhack.w6d1student;

import com.ironhack.w6d1student.model.Student;
import com.ironhack.w6d1student.model.StudentInfo;
import com.ironhack.w6d1student.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class W6d1studentApplication {

	public static void main(String[] args) {
		SpringApplication.run(W6d1studentApplication.class, args);
	}

	@Bean
	CommandLineRunner run(StudentRepository studentRepository) {
		return args -> {
			StudentInfo studentInfo1 = new StudentInfo("Fake Street", 1, "+99 555-555");
			StudentInfo studentInfo2 = new StudentInfo("Round Square", 2, "+34 111-111");

			Student student1 = new Student(8, studentInfo1);
			Student student2 = new Student(4, studentInfo2);

			studentRepository.save(student1);
			studentRepository.save(student2);
		};
	}

}
