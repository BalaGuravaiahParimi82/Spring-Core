package com.seleniumexpress.restControllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstRestController {

	@GetMapping(value = "/hello")
	public String GetMapping() {

		return "You have clicked send button with get mapping";
	}
	
	@PutMapping(value = "/hello")
	public String PutMapping() {

		return "You have clicked send button with put mapping";
	}
	
	@PostMapping(value = "/hello")
	public String PostMapping() {

		return "You have clicked send button with post mapping";
	}
	
	@DeleteMapping(value = "/hello")
	public String DeleteMapping() {

		return "You have clicked send button with delete mapping";
	}
	

	}
