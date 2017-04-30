package constructorExample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a: ");
		int a=sc.nextInt();
		System.out.println("Enter b: ");
		int b=sc.nextInt();
		ConstructorExample cons = new ConstructorExample();
		ConstructorExample cons1 = new ConstructorExample(a);
		ConstructorExample cons2= new ConstructorExample(a,b);
		cons.add(a, b);
		cons.sub(a, b);
		
		cons1.add(a, b);
		cons1.sub(a, b);
		

	}

}
