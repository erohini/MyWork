package gradeaverage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GradeAverage {

	public GradeAverage() {
		try{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int total=in.nextInt();
		
		double[] each=new double[(total+1)];
		Double sum=(double) 0;
		int i=1;
		
		while(i<=total)
		{
			System.out.println("Enter the grade of student"+i +": ");
			each[i]=in.nextDouble();
			if(each[i]>100)
			{
				System.out.println("Error in entering...");
			}else{
			sum=(double) each[i]+sum;
			i++;
			}
		}
		System.out.println("Sum is: "+sum);
		
		Double Avg= (sum/(i-1));
		System.out.println("Average is: "+Avg);
		}
		catch(InputMismatchException e){
			System.out.println("only Integer numbers allowed...");
		}
		
		
	}

}
