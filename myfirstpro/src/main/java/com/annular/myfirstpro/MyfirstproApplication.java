package com.annular.myfirstpro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class MyfirstproApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyfirstproApplication.class, args);
		System.out.println("\n\n\n vinayaka................................................\n\n\n");
	}

	@Bean
	public Docket productApi() {
System.out.println("\n \n Swagggggwerrrrrrrrr");
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.annular.myfirstpro")).build().apiInfo(metaData());

	}

	private ApiInfo metaData() {
		return new ApiInfoBuilder().title("Employee sample project")
				.description("\"Employee details for practice\"").build();
	}

}
