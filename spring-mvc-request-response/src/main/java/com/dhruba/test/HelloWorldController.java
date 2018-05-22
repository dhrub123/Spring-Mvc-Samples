package com.dhruba.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	public ModelAndView helloWorld(HttpServletRequest request, HttpServletResponse response){
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		if(password.equals("admin")){
			String message = "Hello " + name;
			return new ModelAndView("hellopage","message",message);
		}else{
			return new ModelAndView("errorpage","message","wrong username or password");
		}
		
	}
}
