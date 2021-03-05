package guru.springframework.sfgdisp5.controllers;

import guru.springframework.sfgdisp5.services.GreetingService;

public class PropertyInjectedController {

	public GreetingService greetingService;
	
	public String getGreeting () {
		return greetingService.sayGreeting();
	}
}
