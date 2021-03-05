package guru.springframework.sfgdisp5.controllers;

import guru.springframework.sfgdisp5.services.GreetingService;

public class ConstructorInjectedController {
	private final GreetingService greetingService;
		

	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}


	public String getGreeting () {
		return greetingService.sayGreeting();
	}
}
