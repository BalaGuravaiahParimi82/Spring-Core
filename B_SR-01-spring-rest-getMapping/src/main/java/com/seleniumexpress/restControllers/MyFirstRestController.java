package com.seleniumexpress.restControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstRestController {
 
//	@Autowired
//	private StudentDAO studentDAO;

	@GetMapping(value = "/hello")
	public String sayHello() {

		return "Hello Everyone this is get method";
	}
	
	@GetMapping(value = "/hi")
	public String sayHi() {

		return "Hi Everyone";

	}
	
	@PostMapping(value = "/hello")
	public String sayHello1() {

		return "Hello Everyone this is post method";
	}
	
	

}
