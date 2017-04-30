package matrix;

import java.util.Scanner;

public class Matrix {
	public static void printMatrixInt(int[][] m)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter no of rows and columns: ");
		int r=in.nextInt();
		int c=in.nextInt();
		m=new int[r][c];
		
		System.out.println("Enter matrix 1:");
		for(int row=0;row<r;row++){
			for(int col=0;col<c;col++){
				a[row][col]=in.nextInt();
			}}
		
		/*for(int row=0;row<r;row++){
			for(int col=0;col<c;col++){
				System.out.print(+a[row][col]);
			}
		}*/
		
		System.out.println("Enter matrix 2:");
		for(int row=0;row<r;row++){
			for(int col=0;col<c;col++){
				b[row][col]=in.nextInt();
				//System.out.print(+b[row][col]);
			}
		}
	}
	
	
	
	public static void printMatrixDouble()
	{
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter no of rows and columns: ");
		int r=in.nextInt();
		int c=in.nextInt();
		double[][] a=new double[r][c];
		double[][] b=new double[r][c];
		
		System.out.println("Enter matrix1:");
		for(int row=0;row<r;row++){
			for(int col=0;col<c;col++){
				a[row][col]=in.nextDouble();
				//System.out.print(+a[row][col]);
			}}
		System.out.println("Enter matrix 2:");
		for(int row=0;row<r;row++){
			for(int col=0;col<c;col++){
				b[row][col]=in.nextDouble();
				//System.out.print(+b[row][col]);
			}
		}
	}
	
	
	
	
	/*public static boolean haveSameDimension(int[][] a,int[][] b )
	{
		if(a.length!=b.length){
		return false;
		}
		
		else
			return true;		
	}
	
	
	
	public static boolean haveSameDimension(double[][] a,double[][] b )
	{
		for(int row=0;row<a.length;row++){
		if(a[row].length!=b[row].length){
		return false;
		}
		else if()		
	}
	}
	*/
	
}
