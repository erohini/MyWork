package matrix;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Matrix m=new Matrix();
		
		int[][] a=new int[100][100];
		m.printMatrix(a);
		int[][] b=new int[100][100];
		m.printMatrix(b);
		
		/*double[][] c=new double[100][100];
		m.printMatrix(c);
		double[][] d=new double[100][100];
		m.printMatrix(d);*/
		
		m.haveSameDimension(a,b);

	}

}
