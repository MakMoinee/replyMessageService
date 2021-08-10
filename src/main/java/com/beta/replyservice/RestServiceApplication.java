package com.beta.replyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.beta.replyservice.service.ServiceImpl;
import com.beta.replyservice.service.ServiceIntf;

@ComponentScan(basePackages = { "com.beta.replyservice" })
@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
	}
	
	@Bean
	public ServiceIntf getService() {
		return new ServiceImpl();
	}

}
