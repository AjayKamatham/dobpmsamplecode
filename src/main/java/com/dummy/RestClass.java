package com.dummy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class RestClass {
	
	private int testcheck;
	private boolean testCheck;
	
	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	public Integer test1() {
		this.testCheck=true;
		this.testcheck=2;
		return 2;
	}
	
	@RequestMapping(value = "/test2", method = RequestMethod.GET)
	public String test2() {
		
		return "success";
	}
}
