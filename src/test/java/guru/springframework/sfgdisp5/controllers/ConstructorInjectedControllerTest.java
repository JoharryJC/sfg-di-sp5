package guru.springframework.sfgdisp5.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdisp5.services.GreetingServiceImpl;

class ConstructorInjectedControllerTest {

	ConstructorInjectedController controller; 
	
	@BeforeEach
	void setUp() throws Exception {
		controller = new ConstructorInjectedController(new GreetingServiceImpl());
	}

	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}

}
