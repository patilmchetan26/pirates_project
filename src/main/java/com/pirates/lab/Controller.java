package com.pirates.lab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pirates")
public class Controller {

	@GetMapping("/test")
	public String test() {
		
		return "test";
	}
}
