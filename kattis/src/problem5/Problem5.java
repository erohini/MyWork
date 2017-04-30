package problem5;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int m=sc.nextInt();
		if(m!=-1){
		for(int i=0;i<m;i++)
		{
			String s=sc.next();
			String[] parts = s.split(" ");

			int x= Integer.valueOf(parts[0].trim());
			System.out.println(x);
			//int y= Integer.valueOf(parts[1].substring(0,parts[1].length()-1));
		}
		}
	}

}
