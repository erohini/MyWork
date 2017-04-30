package quad;

import java.util.Scanner;
public class QuadraticEquation 
{
private static Scanner var;

public static void main(String[] args) {
	var = new Scanner(System.in);
	System.out.println("To solve the quadratic equation.....");
	System.out.print("\nEnter coefficients a, b, and c: ");
	
	double a = var.nextDouble();
	double b = var.nextDouble();
	double c = var.nextDouble();
	
	System.out.printf("The equation is %fx*x + %fx + %f\n", a, b, c);
Input in= new Input(a,b,c);
} 
}