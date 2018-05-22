package com.dhruba.test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMethod; 

import com.dhruba.test.beans.Employee;
import com.dhruba.test.dao.EmployeeDao;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeDao dao;
	
	
	
	@RequestMapping("/empform")
	public ModelAndView showFrom(){
		return new ModelAndView("employeeform","command",new Employee());
	}
	
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("employee") Employee employee){
		dao.save(employee);
		return new ModelAndView("redirect:/viewemp/1");
	}
	
	@RequestMapping("/viewemp/{pageid}")
	public ModelAndView viewEmployee(@PathVariable int pageid){
		
		int start = 0;
		int total = 5;
		if(pageid==1){
			total = 4;
		}else{
			start=(pageid-1)*total; //1*5,2*5
			total=start+4; //5+4,10+4
		}
		
		List<Employee> employeeList = dao.getEmployees();
		
		int size = employeeList.size();
		if (total > size){
			total = (size-1);
		}
		List<Employee> employeeListToView = employeeList.subList(start, (total+1));
		System.out.println("start = " + start +  " total = " + total);
		return new ModelAndView("viewemployee","list",employeeListToView);
	}
	
	@RequestMapping(value="/editemp/{id}")
	public ModelAndView editEmployee(@PathVariable int id){
		Employee employee = dao.getEmpByName(id);
		System.out.println("Employee to be modified from db is " + employee.getName());
		return new ModelAndView("empeditform","command",employee);
	}
	
	@RequestMapping(value="/editsave",method = RequestMethod.POST)  
    public ModelAndView editsave(@ModelAttribute("employee") Employee employee){  
        dao.update(employee);  
        return new ModelAndView("redirect:/viewemp/1");  
    }
	
	@RequestMapping(value="/deleteemp/{id}",method = RequestMethod.GET)  
    public ModelAndView delete(@PathVariable int id){  
        dao.delete(id);  
        return new ModelAndView("redirect:/viewemp/1");  
    } 
}
