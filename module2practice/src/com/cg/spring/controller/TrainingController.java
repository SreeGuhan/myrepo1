package com.cg.spring.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.spring.dto.ScheduledSessions;
import com.cg.spring.service.TrainingService;

@Controller
public class TrainingController {
	@Autowired
	TrainingService employeeservice;
	
	@RequestMapping(value="/showall",method=RequestMethod.GET)
   public ModelAndView showAllData(@ModelAttribute("aa") ScheduledSessions emp){
   List<ScheduledSessions> empList=employeeservice.showAllEmployee();		
	return new ModelAndView("show","sessiondata",empList);
	
}
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String myEmployee(@Valid @ModelAttribute("emp") ScheduledSessions emp, Map<String,Object> model) {
		model.put("emp", emp);
		return "add_employee";
		
	}
	@RequestMapping(value="/addemployee",method=RequestMethod.POST)
	public String addEmployee(@Valid @ModelAttribute("emp") ScheduledSessions emp, BindingResult result,Map<String,Object> model) {
		if(result.hasErrors()) {
			return "add_employee";
		}
		employeeservice.addEmployee(emp);
		return "redirect:/showall";
	}
	
	@RequestMapping(value="/update/{id}" )
	public ModelAndView getUpdateEmployee
	( @PathVariable("id") int id ,@ModelAttribute("up") ScheduledSessions scsession, Map<String,Object> model) {
		
		ScheduledSessions empOne=employeeservice.searchEmployee(id);	
		
		List<String> myQul=new ArrayList<String>();
		myQul.add("BSC");
		myQul.add("MCA");
		myQul.add("BE");
		myQul.add("ME");
		model.put("myq",myQul);
		
		return new ModelAndView("update","modelupdate",empOne);
		
	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String updateEmployeeDataBase(
			@Valid@ModelAttribute("up") ScheduledSessions emp,
			BindingResult result
			,Map<String,Object> model
			){
		System.out.println(emp.getFaculty());

		if(result.hasErrors()){
			List<String> myQul=new ArrayList<String>();
			myQul.add("BSC");
			myQul.add("MCA");
			myQul.add("BE");
			myQul.add("ME");
			model.put("myq",myQul);
			return "update";
		}
		
		employeeservice.updateEmployee(emp);
		//return "redirect:/showall";
		return "redirect:/Success";
		
	}
	
}
