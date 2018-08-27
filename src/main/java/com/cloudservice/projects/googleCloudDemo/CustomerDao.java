package com.cloudservice.projects.googleCloudDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public String getCustName(String id){
		return jdbcTemplate.queryForObject("select customerName from customers where customerNumber=?", new Object[] {id}, String.class);
	}
}
