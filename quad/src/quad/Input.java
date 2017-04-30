package quad;


import java.util.Scanner;

public class Input {

	private double a;
	private double b;
	private double c;

	public Input(double a,double b,double c)
	{	
		this.a =a;
		this.b =b;
		this.c =c;
	double discriminant=((b * b) - (4 * a * c)); 
	if(discriminant>0)
	{
		System.out.println("It has 2 roots....");
		double r1 = (-b + Math.sqrt(discriminant))/2 * a;
	    double r2 = (-b - Math.sqrt(discriminant))/2 * a;
	    System.out.println("first Root is:"+r1);
	    System.out.println("second Root is:"+r2);
	}
	if(discriminant==0)
	{
		System.out.println("equation has 1 root...");
		double r1=(-b+ Math.sqrt(discriminant))/(2*a);
		System.out.println("Root is: "+r1);
	}
	if(discriminant<0)
	{
		double a1 = (-b/2*a);
		double a2 = (Math.sqrt(discriminant*(-1)))/(2*a);
		System.out.println("it has imaginary roots...");
	    System.out.println("Root1:"+a1 + "+"+a2+"i");
	    System.out.println("Root1:"+a1 +"-"+a2+"i");
	}
	}
}
