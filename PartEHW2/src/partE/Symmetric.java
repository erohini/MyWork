package partE;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Symmetric {
	
	public static void main(String[] args) throws NoSuchAlgorithmException {
		Symmetric();

	}
	
	private static void Symmetric() throws NoSuchAlgorithmException {
		Scanner sc=new Scanner(System.in);
		String key;
		System.out.println("Enter the key: ");
		key=sc.next();
		
		System.out.println("Alice! Please enter your challenge...");
		String challenge = sc.next();
		
		String concat=challenge+key+challenge;
		
		MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
		messageDigest.update(concat.getBytes());
		String response = new String(messageDigest.digest());
		
		System.out.println("Expected response:  "+"\n"+response);
		
		System.out.println("Bob! please enter the response: ");
		String bob_Response = sc.next();
		
		if(bob_Response.equals(response))
		{
			System.out.println("Bob is authenticated...");
		}
		else
			System.out.println("Authentication denied...");
		}
		
	}


		
	
//	try{
//	long response=concat.hashCode();
//	System.out.println("Expected response: "+response);
//	
//	System.out.println("Bob! please enter the response: ");
//	long bob_Response = sc.nextInt();
//	
//	if(response==bob_Response)
//	{
//		System.out.println("Bob is authenticated...");
//	}
//	else
//		System.out.println("Authentication denied...");
//	} catch (InputMismatchException e){
//	System.out.println("Authentication denied...");
//}
//	
//}}
