package anvitha;

import java.util.Scanner;

public class Anvitha {

	public static void main(String[] args) {
	int i;
	System.out.println("enter value");
	Scanner sc = new Scanner(System.in);
	i=sc.nextInt();
	
	int e=(i%2);
	switch(e)
	{
	case 1: 
		System.out.println("odd");
		break;
	case 0:
		System.out.println("even");
		break;
	}
	}
}
