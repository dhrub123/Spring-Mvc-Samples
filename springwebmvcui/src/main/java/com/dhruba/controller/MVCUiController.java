package com.dhruba.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dhruba.model.Student;

@Controller
public class MVCUiController {

	@RequestMapping(value="/differentElements")
	public String getHtmlElements(){
		return "elements";
	}
	
	@RequestMapping(value="/textbox")
	public String getTextBox(Model model){
		
		model.addAttribute("student", new Student());
		return "textbox";
	}
	
	@RequestMapping(value="/addStudent",method=RequestMethod.POST)
	public String addStudent(@ModelAttribute("student") Student student){
		return "student";
	}
	
	@RequestMapping(value="/passwordAndTextArea")
	public String getPasswordAndTextArea(Model model){
		model.addAttribute("newstudent", new Student());
		return "passwordAndTextArea";
	}
	
	@RequestMapping(value="/addNewStudent",method=RequestMethod.POST)
	public String addNewStudent(@ModelAttribute("newstudent") Student newStudent){
		return "newstudent";
	}
	
	@RequestMapping(value="/checkBoxes")
	public String getGender(Model model){
		model.addAttribute("student", new Student());
		
		List<String> webFrameworkList = new ArrayList<String>();
		webFrameworkList.add("Spring MVC");
		webFrameworkList.add("Struts 1");
		webFrameworkList.add("Struts 2");
		webFrameworkList.add("Apache Wicket");
		model.addAttribute("webFrameworkList", webFrameworkList);
		
		return "checkbox";
	}
	
	@RequestMapping(value="isMale",method=RequestMethod.POST)
	public String isMale(@ModelAttribute("student") Student student,Model model){
		model.addAttribute("favouriteFrameworks",student.getFavouriteFrameworks());
		return "ismale";
	}
	
	@RequestMapping(value="/radiobuttons")
	public String getRadioButtons(Model model){
		model.addAttribute("student", new Student());
		List<Integer> favouriteNumbersList = new ArrayList<Integer>();
		favouriteNumbersList.add(1);
		favouriteNumbersList.add(2);
		favouriteNumbersList.add(3);
		favouriteNumbersList.add(4);
		model.addAttribute("favouriteNumbersList", favouriteNumbersList);
		return "radiobuttons";
	}
	
	@RequestMapping(value="/radiobuttonresult",method=RequestMethod.POST)
	public String getResult(@ModelAttribute("student") Student student){
		return "radiobuttonresult";
	}
	
	@RequestMapping(value="/dropdown")
	public String getDropdown(Model model){
		model.addAttribute("student",new Student());
		Map<String,String> countryMap = new HashMap<String,String>();
		countryMap.put("United States","US");
		countryMap.put("China","CH");
		countryMap.put("France","FR");
		model.addAttribute("countries",countryMap);
		return "dropdown";
	}
	
	@RequestMapping(value="/getcountry",method=RequestMethod.POST)
	public String getCountry(@ModelAttribute("student") Student student){
		return "country";
	}
}
