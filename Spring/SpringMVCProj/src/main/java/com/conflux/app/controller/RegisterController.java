package com.conflux.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.conflux.app.entity.Register;
import com.conflux.app.validator.RegisterValidator;

@Controller
public class RegisterController {
	
//	Logger logger = Logger.getLogger(RegisterController.class);
	
	@Autowired
	private RegisterValidator registerValidator;
	
	/*@InitBinder
	public void registerInitBind(WebDataBinder webDataBinder){
		webDataBinder.setValidator(registerValidator);
	}*/
	
	@ModelAttribute("cities")
	public List<String> getCities(){
//		logger.info("*****getCities()*****");
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("Rajahmundry");
		arrayList.add("Hyd");
		arrayList.add("Vizag");
		arrayList.add("Vijayawada");
		
		return arrayList;
		
	}
	
	@ModelAttribute("states")
	public List<String> getStates(){
//		logger.info("*****getStates()*****");
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("AP");
		arrayList.add("TN");
		arrayList.add("KA");
		arrayList.add("MH");
		
		return arrayList;
	}
	
	@RequestMapping(value="/registerProcess", method=RequestMethod.GET)
	public String showRegisterView(ModelMap modelMap){
//		logger.info("*****showRegisterView()*****");
		
		Register register=new Register();
		
		//registering command object
		modelMap.addAttribute("register",register);
		
		//input jsp name
		return "register";
	}
	
	@RequestMapping(value="/registerProcess", method=RequestMethod.POST)
	public String processRegisterRequest(@Validated Register register, BindingResult bindingResult, Model model){
//		logger.info("*****showRegisterRequest()*****");
		/*System.out.println("Registration Details:");
		System.out.println("FirstName: "+register.getFirstName());
		System.out.println("LastName: "+register.getLastName());
		System.out.println("City: "+register.getCity());
		System.out.println("email: "+register.getEmail());
		
		ModelAndView modelAndView = new ModelAndView("welcome");*/
		
		if(bindingResult.hasErrors()){
			return "register";
		}
		
		model.addAttribute("register",register);
		
		return "welcome";
		
	}

}
