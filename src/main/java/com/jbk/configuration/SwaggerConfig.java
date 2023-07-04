package com.jbk.configuration;

import java.util.Collection;
import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(getInfo()).select().apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any()).build();
	}

	private ApiInfo getInfo() {
		// TODO Auto-generated method stub
		return new ApiInfo("Employee and country",
				"this is angular project", "1.0",
				"terms and service", 
				new Contact("Nasir Nadaf", "https://www.youtube.com/watch?v=A-lqrhhMEYY", "nnadaf28@gmail.com"),
				"licence of api", "api licence url", Collections.EMPTY_LIST);
	}

}
