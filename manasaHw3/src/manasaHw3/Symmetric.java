package manasaHw3;

import java.security.NoSuchAlgorithmException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Symmetric {
	
	private static Scanner sc;

	public static void main(String[] args) throws NoSuchAlgorithmException {
		Symmetric();

	}
	
	private static void Symmetric() throws NoSuchAlgorithmException {
		sc = new Scanner(System.in);
		System.out.println("What is the key: ");
		String key=sc.next();
		
		System.out.println("Alice! Please enter your challenge...");
		String challenge = sc.next();
		
		String concat=challenge+key+challenge;
			
	try{
	long response=concat.hashCode();
	System.out.println("Expected response: "+response);
	
	System.out.println("Bob! please enter the response: ");
	long bob_Response = sc.nextInt();
	
	if(response==bob_Response)
	{
		System.out.println("Bob is authenticated...");
	}
	else
		System.out.println("Authentication denied...");
	} catch (InputMismatchException e){
	System.out.println("Authentication denied...");
}
	
}}
