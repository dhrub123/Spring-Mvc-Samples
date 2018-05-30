package com.dhruba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dhruba.model.Exercise;

@Controller
public class MinutesController {

	@RequestMapping(value="/addMinutes")
	public String addMinutes(@ModelAttribute ("exercise") Exercise exercise){
		
		System.out.println("Minutes exercised " + exercise.getMinutes());
		//return "forward:addMoreMinutes.html";
		return "redirect:addMoreMinutes.html";
	}
	
	@RequestMapping(value="/addMoreMinutes")
	public String addMoreMinutes(@ModelAttribute ("exercise") Exercise exercise){
		
		System.out.println("More Minutes exercised " + exercise.getMinutes());
		return "addMinutes";
	}
	
}
