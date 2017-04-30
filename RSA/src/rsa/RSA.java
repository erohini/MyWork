package rsa;

import java.math.BigInteger;
import java.util.*;

public class RSA {

	public static void main(String[] args) {
		
		int i=1;
		do{
		try{
		BigInteger message = null;
		BigInteger exponent = null;
		BigInteger mod = null;
		BigInteger cipher=null;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter e: ");
		exponent=sc.nextBigInteger();
		System.out.println("Enter n: ");
		mod=sc.nextBigInteger();
		System.out.println("Enter your choice: \n1. Encryption \n2. Decryption \n3. Both");
		int choice=sc.nextInt();
		switch(choice){
		case 1:
		{
			System.out.println("Assume m^e mod(n)...");
			System.out.println("Enter m: ");
			message=sc.nextBigInteger();
			Encryption e=new Encryption(message, exponent, mod);
		}
			break;
		case 2:
		{
			System.out.println("Enter c:");
			cipher=sc.nextBigInteger();
			Decryption d=new Decryption(cipher, exponent, mod);
		}
		break;
		case 3: {
			System.out.println("Enter m: ");
			message=sc.nextBigInteger();
			Encryption e=new Encryption(message, exponent, mod);
			System.out.println("Enter c:");
			cipher=sc.nextBigInteger();
			Decryption d=new Decryption(cipher, exponent, mod);
		}
		break;
		default:
			System.out.println("Not a proper input");
		}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter proper input!");
		}
		}while(i!=0);
		
	}

}
