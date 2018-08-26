package com.hello_word.demo;

import org.springframework.stereotype.Component;



@Component
public class GreetingService {

	private final String MENSAJE = "Hola Mundo"; 


	public String helloWord(){
		return MENSAJE;
	}
}
