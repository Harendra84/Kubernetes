package com.rest.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class DocConfig {
	
	@Bean
	public Docket createDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.rest.controller"))
				.paths(PathSelectors.regex("/rest/api/.*"))
				.build()
				.useDefaultResponseMessages(true)
				.apiInfo(createApiInfo());
	}
	
	private ApiInfo createApiInfo() {
		Contact contact = new Contact("Harendra", "https://www.google.com", "harendracutm@gmail.com");
		return new ApiInfo("Rest Api", 
				"Give server info", 
				"4.0.0 Release", 
				"https://www.google.com/license",
				contact, 
				"GNU Public", 
				"https://apache.org/license/gnu",
				Collections.emptyList());
	}
}