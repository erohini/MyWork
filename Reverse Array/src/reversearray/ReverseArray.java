package reversearray;

import java.util.Scanner;

public class ReverseArray {

	public ReverseArray() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter How many numbers u want to enter for reverse: ");
		int n=in.nextInt();
		
		int[] array={2,3,4};
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter "+(i+1)+" value");
			array[i]=in.nextInt();
			
		}
		System.out.println("numbers entered are: ");
		for(int i=0;i<n;i++)
		{
		System.out.println(+array[i]);	
		}
		for(int i=0;i<(n/2);i++){
			int temp=array[i];
			array[i]=array[array.length-i-1];
			array[array.length-i-1]=temp;
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("Reverse is: "+array[i]);
		}
	}

	public static void main(String[] args) {
	ReverseArray ra=new ReverseArray();

	}

}
