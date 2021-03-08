package guru.springframework.sfgdisp5.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.sfgdisp5.services.GreetingService;

@Controller
public class MyController {

	private final GreetingService greetingService; 	
	
	
	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}



	public String sayHello() {
		//System.out.println("Hello World!!!");
		//return "Hi amigo";
		return greetingService.sayGreeting(); 
		
	}
}
