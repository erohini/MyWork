package com.rohini.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rohini.app.entity.Student;

@Controller
public class StudentController {
	
	Student student=new Student();
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String showLogin(ModelMap modelMap){
		modelMap.put("studentLogin", student);
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String submitLogin(Model model, @ModelAttribute("studentLogin") Student student){
			model.addAttribute("username", student.getUserName());
			model.addAttribute("password", student.getPassword());
			return "success";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String showRegister(ModelMap modelMap){
		modelMap.put("studentRegister", student);
		return "register";
	}

}
