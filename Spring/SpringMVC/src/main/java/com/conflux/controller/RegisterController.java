package com.conflux.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.conflux.entity.Student;

@Controller
public class RegisterController {

	@RequestMapping(value="/registerProcess", method=RequestMethod.GET)
	public String showRegisterView(ModelMap modelMap){
		Student student=new Student();
		modelMap.addAttribute("register", student);
		return "register";
	}
	
	
}
