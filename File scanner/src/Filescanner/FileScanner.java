package Filescanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanner {

	public static void main(String[] args) 
		throws FileNotFoundException{
	int num1;
	Double num2;
	String name;
	Double sum;
	Scanner in = new Scanner(new File("in.txt"));
	
	num1=in.nextInt();
	num2=in.nextDouble();
	name=in.next();
	sum=(num1+num2);
	
	System.out.println("Hi"+name+".... Sum is: "+sum);
		}
		
}
