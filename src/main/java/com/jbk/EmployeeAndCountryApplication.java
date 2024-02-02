package com.jbk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@EnableJpaRepositories(basePackages = "com.jbk.repo")
public class EmployeeAndCountryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeAndCountryApplication.class, args);
	}

}
