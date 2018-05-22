package com.dhruba.test.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMethod; 

import com.dhruba.test.beans.Employee;

@Controller
public class EmployeeController {

	@RequestMapping("/empform")
	public ModelAndView showFrom(){
		return new ModelAndView("employeeform","command",new Employee());
	}
	
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("employee") Employee employee){
		System.out.println(employee.getName() + " " + employee.getSalary() + " " + employee.getDesignation());
		return new ModelAndView("redirect:/viewemp");
	}
	
	@RequestMapping("/viewemp")
	public ModelAndView viewEmployee(){
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(178790,"Dhruba",67895.98f,"Engineer"));
		employeeList.add(new Employee(148690,"Abhishek",89895.98f,"Manager"));
		employeeList.add(new Employee(123796,"Ibrahim",12345.98f,"Driver"));
		return new ModelAndView("viewemployee","list",employeeList);
	}
}
