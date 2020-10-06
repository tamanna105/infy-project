package com.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2


public class EmpdataApplication implements WebMvcConfigurer {
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
		
	
	public static void main(String[] args) {
		SpringApplication.run(EmpdataApplication.class, args);
	}
	
	@Override
	public void addCorsMappings(CorsRegistry registry)
	{
		registry.addMapping("/**").allowedMethods("GET" , "POST");
		
	}

}
