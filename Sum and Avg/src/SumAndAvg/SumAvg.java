package SumAndAvg;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumAvg {

	public SumAvg() {
		int sum=0,limit=0,count=0;
		Double avg;
		
		Scanner b=new Scanner(System.in);
		try {
			
		System.out.println("Enter starting number: ");
		int a=b.nextInt();
		System.out.println("Enter the limit: ");
		limit=b.nextInt();
		
		
		for(a=a;a<=limit;a++)
		{
			int s=a;
			s=s*s;;
			sum=s+sum;
			count++;
			
		}
		
		System.out.println("Sum of numbers is: "+sum);
		
		avg=((double) sum/count);
		System.out.println("Average is: "+avg);
		}
		
		catch (InputMismatchException e )
		{
			System.out.println("Exception Caught: u should enter only integer values");
		}
		
	}

}
