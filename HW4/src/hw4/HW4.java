package hw4;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class HW4 {
	
	static int score=0;
	private static Scanner sc;
	private static Scanner sc2;
	public static void Char_len(String pass) throws FileNotFoundException
	{
		//password length...
		if(pass.length()>=7)		
		{
			score= score+1;
			System.out.println("password length: "+score);
		}
		
		//Upper case
		for (char c : pass.toCharArray()) {
		    if (Character.isUpperCase(c)) {
		        score=score+1;
		        System.out.println("uppercase: 1 point");
		        break;
		    }
		}
		
		//Lower case
		for (char c : pass.toCharArray()) {
		    if (Character.isLowerCase(c)) {
		        score=score+1;
		        System.out.println("lowercase: 1 point");
		        break;
		    }
		    }
		
		//Number...
		if(pass.matches("(.)*(\\d)(.)*")){
			score=score+2;
			System.out.println("For numbers: 2 points");
		}
		
		//Special characters...
		String special = "!@#$%^&*()_+";
		if(pass.matches(".*[" + special + "].*")){
			score=score+2;
			System.out.println("For special characters: 2 points");
		}
		
		//Dictionary words both with normal and reverse case...
		String reverse=new StringBuffer(pass).reverse().toString();
		try{
		File file = new File("C:/Users/rohini/Desktop/MY Courses/ITC 520/Assignment 4/words.txt");
		String pass_copy=pass;
		String reverse_copy=reverse;
		sc2 = new Scanner(file);
		List<String> list=new ArrayList<>();
		 while(sc2.hasNextLine()){
		     list.add(sc2.nextLine().toLowerCase()); 
		 }
		 if(pass.matches("(.)*(\\w)(.)*")){
			 pass_copy=pass_copy.replaceAll("[\\d]", "");
			 reverse_copy=reverse_copy.replaceAll("[\\d]", "");
			 pass_copy=pass_copy.replaceAll("[!@#$%^&*()_+-.:;,]", "");
			 reverse_copy=reverse_copy.replaceAll("[!@#$%^&*()_+-.:;,]", "");
			 if(pass_copy.length()!=1){
		 if(list.contains(pass_copy.toLowerCase()) || list.contains(reverse_copy.toLowerCase())){
			
		 }
		 else
		 {
			 for(int i=0;i<pass.length();i++){
				 pass_copy=pass_copy.substring(0, pass_copy.length()-1);
				 if(pass_copy.length()!=1){
				 if(list.contains(pass_copy.toLowerCase()) || list.contains(reverse_copy.toLowerCase())){
					 break;
					 }
				 }
				 else{
					 score=score+2;
					 System.out.println("For dictionary words...: 2 points");
					 break;
				 }
					 
			 }
		 }
		 }
		 }
		 else {
			 score=score+2;
			 System.out.println("For dictionary words...: 2 points");
		 }
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("No proper word Characters (Not a dictionary word): 2 points");
			score=score+2;
		}
		 
		 
		 //Keyboard sequence...
		 String pass_copy1=pass;
			String reverse_copy1=reverse;
		 if(pass.matches("(.)*(\\w)(.)*")){
			 pass_copy1=pass_copy1.replaceAll("[\\d]","");
			 reverse_copy1=reverse_copy1.replaceAll("[\\d]","");
			 pass_copy1=pass_copy1.replaceAll("[!@#$%^&*()_+-.:;,]","");
			 reverse_copy1=reverse_copy1.replaceAll("[!@#$%^&*()_+-.:;,]","");
			 String copy=pass_copy1.toUpperCase();
			 final Set<String> s= new HashSet<String>(Arrays.asList("QWERTYUIOP","ASDFGHJKL","ZXCVBNM","QAZ","WSX","EDC","RFV","TGB","YHN","UJM"));
			 if(s.contains(copy))
			 {
	
			 }
			 else{
				 score=score+1;
				 System.out.println("Keyboard sequence: 1 point");
			 }
		 }
		System.out.println("Score: "+score+" out of 10");
	}
	

	//Main class...
	public static void main(String[] args) throws FileNotFoundException {
		String password;
		
		System.out.println("Enter password to check strength: ");
		sc = new Scanner(System.in);
		password = sc.next();
		
		Char_len(password);
	}

}
