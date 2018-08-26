package com.hello_word.demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class GreetingControllerUnitTest {

	private GreetingController controller;
	private GreetingService servicio;

	@Before
	public void setUp(){
		servicio = Mockito.mock(GreetingService.class);
		controller = new GreetingController(servicio);
	}

	@Test
	public void itShouldReturnTheServiceValueWith200StatusCode()
	{
		Mockito.when(servicio.helloWord()).thenReturn("Saludo");
		ResponseEntity<String> httpResponse = controller.sayhello();

		Assert.assertEquals(httpResponse.getStatusCode(), HttpStatus.OK);
		Assert.assertEquals("Saludo", httpResponse.getBody());
	}

}
