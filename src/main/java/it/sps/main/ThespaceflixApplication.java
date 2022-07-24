package it.sps.main;

import org.springframework.boot.SpringApplication;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableSwagger2
public class ThespaceflixApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThespaceflixApplication.class, args);
	}
	
	@Bean
	public Docket productApi() {
	return new Docket(DocumentationType.SWAGGER_2).select()
	.apis(RequestHandlerSelectors.basePackage("it.sps.main.restapi")).build();
	}

}
