package org.rohini.servlets;

public class Factorial_Business_class {
 public boolean isNumber(String number){
	 try{
		 int i=Integer.parseInt(number);
	 }
	 catch(NumberFormatException e){
		 return false;
	 }
	 return true;
	 
 }
}
