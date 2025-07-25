package com.lecturer.info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value="com.lecturer.info.*")
public class LecturersInformationApplication {

	public static void main(String[] args) {
		SpringApplication.run(LecturersInformationApplication.class, args);
	}

}
