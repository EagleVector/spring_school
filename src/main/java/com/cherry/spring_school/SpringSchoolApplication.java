package com.cherry.spring_school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
// exclude bean configuration
//@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@SpringBootApplication
public class SpringSchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSchoolApplication.class, args);
	}
}
