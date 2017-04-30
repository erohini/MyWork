package perfectanddeficientnumbers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m=new Main();
		m.perfectNumberList();
	}
		
		public void perfectNumberList()
		{
			int count=0;
		PDNumbers pd=new PDNumbers();
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the upper bound: ");
		int i=in.nextInt();
		
		
		System.out.println("These numbers are not perfect nor deficient...");
		for(int j=1;j<=i;j++){
		pd.isPerfect(j);
		}
		
		System.out.print("\n");
		/*System.out.println("These numbers are deficient...");
		for(int j=1;j<=i;j++){
		pd.isDeficient(j);
		}*/
		}

	}


