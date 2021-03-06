package com.hello_word.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

	private final GreetingService greetingService;

	@Autowired
	public GreetingController(GreetingService greetingService){
		this.greetingService = greetingService;

	}

	@GetMapping("/hello")
	public ResponseEntity<String> sayhello(){
		return ResponseEntity.ok(greetingService.helloWord());
	}

}
