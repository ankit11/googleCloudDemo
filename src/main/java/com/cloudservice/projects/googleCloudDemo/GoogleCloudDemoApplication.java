package com.cloudservice.projects.googleCloudDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GoogleCloudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoogleCloudDemoApplication.class, args);
	}
	
	@RequestMapping(value="/firstApp")
	public String firstApp(){
		return "Welcome to Google CLoud App Engine...!!!";
	}
}
