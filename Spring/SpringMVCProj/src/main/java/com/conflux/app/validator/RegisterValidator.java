package com.conflux.app.validator;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.conflux.app.entity.Register;

@Component("registerValidator")
public class RegisterValidator implements Validator {
	
	private ArrayList<String> usernameList = new ArrayList<String>();
	
	@PostConstruct
	public void initRegistervalidator(){
		usernameList.add("Sai");
		usernameList.add("Rohini");
		usernameList.add("Kavya");
	}
	

	@Override
	public boolean supports(Class<?> class1) {
		
		if(class1.equals(Register.class)){
			return true;
		}
		
		return false;
	}

	@Override
	public void validate(Object commandObject, Errors error) {
		
		Register register=(Register) commandObject;
		if(usernameList.contains(register.getUserName())){
			error.rejectValue("userName","uname.error.exists", "Already taken");
			
		}else{
			System.out.println("User already exists...");
		}
		
		
		
	}

}
