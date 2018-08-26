package com.hello_word.demo;

import org.junit.Assert;
import org.junit.Test;

public class GreetingServiceUnitTest {
	private GreetingService greetinService = new GreetingService();

	@Test
	public void itShouldSayHolaMundo(){
		Assert.assertEquals("Hola Mundo", greetinService.helloWord());
	}



}
