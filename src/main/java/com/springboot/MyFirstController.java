package com.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/first")
public class MyFirstController {

	@GetMapping
	public String returnValue() {
		return "Hi, Welocome to My Demo App";
	}
}
