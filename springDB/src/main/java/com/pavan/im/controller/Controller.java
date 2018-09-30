package com.pavan.im.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@RequestMapping(value = "/create",method=RequestMethod.GET)
	private void Create() {
		try {
			jdbcTemplate.execute("Create table Emp("+"id int(3),name varchar2(255), age int(3))");
			System.out.println("table created");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	@RequestMapping(value="/insert",method=RequestMethod.GET)
	private void insert() {
		jdbcTemplate.execute("insert into Emp values(1,'aman',24)");

	}

	@RequestMapping(value="/show",method=RequestMethod.GET)
	private void show() {
		jdbcTemplate.execute("select * from emp");

	}
}
