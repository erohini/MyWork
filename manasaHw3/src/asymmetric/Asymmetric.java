package asymmetric;

import java.math.*;
import java.util.*;

public class Asymmetric {

	private static Scanner sc;
	//private static Scanner sc2;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		try{
		System.out.println("Enter p, q and e values: ");
		BigInteger p=sc.nextBigInteger();
		BigInteger q=sc.nextBigInteger();
		BigInteger e=sc.nextBigInteger();
		ModInverse(p, q, e);
		}catch(InputMismatchException e){
			System.out.println("Enter proper inputs...");
		}
	}

	private static void ModInverse(BigInteger p1, BigInteger p2, BigInteger e2) {
		
		try{
		sc = new Scanner(System.in);
		BigInteger one=new BigInteger("1");
		BigInteger phN=((p1.subtract(one)).multiply((p2.subtract(one))));
	    BigInteger d = e2.modInverse(phN);
	    System.out.println("The Private key: "+d);
	    
	    BigInteger n=p1.multiply(p2);
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
