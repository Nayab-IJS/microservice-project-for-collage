package com.students.info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value="com.students.info.*")
public class StudentsInformationApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentsInformationApplication.class, args);
	}

}
