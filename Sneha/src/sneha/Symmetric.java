package sneha;

import java.util.Scanner;

public class Symmetric {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the key and challenge: ");
		String k=sc.next();
		String c = sc.next();
		String con=c+k+c;
	double sample_response=con.hashCode();
	System.out.println("Response expected: "+sample_response);
	System.out.println("enter the response: ");
	double response = sc.nextDouble();
	if(sample_response==response)
	{
		System.out.println("Authentication success");
	}
	else
		System.out.println("Authentication failed");
	}
}