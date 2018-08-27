package com.cloudservice.projects.googleCloudDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GoogleCloudDemoApplication {

	@Autowired
	CustomerDao customerDao;
	
	public static void main(String[] args) {
		SpringApplication.run(GoogleCloudDemoApplication.class, args);
	}
	
	@RequestMapping(value="/firstApp")
	public String firstApp(){
		return "Welcome to Google CLoud App Engine...!!!";
	}
	
	@RequestMapping(value="/customers/{id}",method=RequestMethod.GET)
	public String getCustomerName(@PathVariable("id") String custNum){
		return customerDao.getCustName(custNum);
	}
}
