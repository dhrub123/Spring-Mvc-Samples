package com.dhruba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dhruba.model.Activity;
import com.dhruba.model.Exercise;
import com.dhruba.service.ExerciseService;

@Controller
public class MinutesController {
	
	@Autowired
	ExerciseService exerciseService;

	@RequestMapping(value="/addMinutes")
	public String addMinutes(@ModelAttribute ("exercise") Exercise exercise){
		
		System.out.println("Minutes exercised " + exercise.getMinutes());
		System.out.println("Activity exercised on " + exercise.getActivity());
		//return "forward:addMoreMinutes.html";
		return "addMinutes";
	}
	
//	@RequestMapping(value="/addMoreMinutes")
//	public String addMoreMinutes(@ModelAttribute ("exercise") Exercise exercise){
//		
//		System.out.println("More Minutes exercised " + exercise.getMinutes());
//		return "addMinutes";
//	}
	
	@RequestMapping(value="/activities",method=RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities(){
		
		return exerciseService.findAllActivities();
	}
	
}
