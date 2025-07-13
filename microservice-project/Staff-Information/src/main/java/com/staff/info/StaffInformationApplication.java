package com.staff.info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value="com.staff.info.*")
public class StaffInformationApplication {

	public static void main(String[] args) {
		SpringApplication.run(StaffInformationApplication.class, args);
	}

}
