package assymmetric;

import java.math.BigInteger;
import java.util.*;
import java.util.Scanner;

public class Assymetric {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		try{
		System.out.println("Bob! Enter p, q and e: ");
		BigInteger p=sc.nextBigInteger();
		BigInteger q=sc.nextBigInteger();
		BigInteger e=sc.nextBigInteger();
		ModInverse(p, q, e);
		}catch(InputMismatchException e){
			System.out.println("Enter proper inputs...");
		}
	}

	private static void ModInverse(BigInteger prime1, BigInteger prime2, BigInteger exponent) {
		
		try{
		Scanner sc=new Scanner(System.in);
		BigInteger one=new BigInteger("1");
		BigInteger phiN=((prime1.subtract(one)).multiply((prime2.subtract(one))));
	    BigInteger d = exponent.modInverse(phiN);
	    System.out.println("Private key: "+d);
	    
	    BigInteger n=prime1.multiply(prime2);
	    System.out.println("Alice! please enter a challenge:");
		BigInteger challenge=sc.nextBigInteger();
		
		BigInteger expected_response=challenge.modPow(d,n);
		
		System.out.println("Expected response: "+expected_response);
		
		System.out.println("Bob! Please enter the response");
		BigInteger response=sc.nextBigInteger();
		
		if(expected_response.equals(response))
		{
			System.out.println("Bob has been authenticated...");
		}
		else{
			System.out.println("Authentication denied...");
		}
		}catch(InputMismatchException e){
			System.out.println("Enter proper inputs...");
		}catch(ArithmeticException ae){
			System.out.println("Arithematic exception...");
		}
		
	}
	
	

}
