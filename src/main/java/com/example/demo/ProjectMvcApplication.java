package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class ProjectMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectMvcApplication.class, args);
	}

}



//@SpringBootApplication
//public class ServingWebContentApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(ServingWebContentApplication.class, args);
//	}
