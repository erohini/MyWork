package matrix;

import java.util.Scanner;

public class Matrix {
	
	public static void printMatrix(int[][] m)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter no of rows and columns: ");
		int r=in.nextInt();
		int c=in.nextInt();
		m=new int[r][c];
		
		System.out.println("Enter matrix: ");
		for(int row=0;row<r;row++){
			for(int col=0;col<c;col++){
				m[row][col]=in.nextInt();
			}}
		
		for(int row=0;row<r;row++){
			System.out.println("\n");
			for(int col=0;col<c;col++){
				System.out.print(+m[row][col]+"\t");
			}
		}
	}
	
	
	
	
	public static void printMatrix(double[][] m)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter no of rows and columns: ");
		int r=in.nextInt();
		int c=in.nextInt();
		m=new double[r][c];
		
		System.out.println("Enter matrix: ");
		for(int row=0;row<r;row++){
			for(int col=0;col<c;col++){
				m[row][col]=in.nextDouble();
			}}
		
		for(int row=0;row<r;row++){
			System.out.println("\n");
			for(int col=0;col<c;col++){
				System.out.print(+m[row][col]+"\t");
			}
		}
	}
	
	
	
	
	public static boolean haveSameDimension(int[][] m1, int[][] m2)
	{
		if(m1.length!=m2.length)
		
			System.out.println("Dimensions are not same...");
			return false;
		/*}
		else
			System.out.println("Dimensions are same...");
			return true;*/
	}
	
	
}
