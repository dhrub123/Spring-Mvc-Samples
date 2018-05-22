package com.dhruba.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author nagdh
 * ModelAndView --> mapped name,message name,message value to be displayed
 */

@Controller
public class HelloWorldController {
	
	@RequestMapping("/hello")
	public ModelAndView helloWorld(){
		String message = "Hello New Developer, Hello from SpringMVC";
		return new ModelAndView("hellopage","message",message);
	}
}
