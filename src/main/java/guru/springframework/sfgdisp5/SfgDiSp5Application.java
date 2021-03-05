package guru.springframework.sfgdisp5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.sfgdisp5.controllers.MyController;

@SpringBootApplication
public class SfgDiSp5Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiSp5Application.class, args);
		MyController myController = (MyController)ctx.getBean("myController");
		String greeting = myController.sayHello(); 
		System.out.println(greeting);
	}

}
