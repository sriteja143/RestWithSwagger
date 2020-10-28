package com.guru.config;

import static springfox.documentation.builders.PathSelectors.regex;
import static springfox.documentation.builders.RequestHandlerSelectors.basePackage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket configDock() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(basePackage("com.guru.controller"))
				.paths(regex("/.*"))
				.build().apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("GURU SPRING BOOT SWAGGER")
				.description("WELCOME TO SWAGGER CLIENT" )
				.contact(new Contact("GURU TEJA", "https://www.javadeveloper.com/", "guru@developer"))
				.license("Mylisence")
				.licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
				.version("1.0.0")
				.build();
	}
	
	
	
	
	
	


}
