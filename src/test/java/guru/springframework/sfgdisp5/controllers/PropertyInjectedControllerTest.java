package guru.springframework.sfgdisp5.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdisp5.services.GreetingServiceImpl;

class PropertyInjectedControllerTest {

	PropertyInjectedController controller;
	
	@BeforeEach
	void setUp() {
		controller = new PropertyInjectedController();
		controller.greetingService = new GreetingServiceImpl(); 
	}
	
	@Test
	void getGreeting() {
	//void testGetGreeting() {
		//fail("Not yet implemented");
		System.out.println(controller.getGreeting()); 
	}

}
