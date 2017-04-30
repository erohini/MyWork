package problemG;

import java.util.Scanner;

public class ProblemG {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] array= new int[n];
		for(int i=0;i<n;i++){
			array[i]=sc.nextInt();
		}
		
		int result=0;
		int y=2;
		
		for(int i=0;i<n;i++){
		for(int x=2;x<=(n/2);x++){
			while(y<=x/2){
				if(x%y==0){
					
				}
				else
					result++;
			}
			System.out.println(x+"+"+(array[i]-x));
			}
		}
	}

}
