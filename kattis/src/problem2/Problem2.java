package problem2;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 input numbers seperated by spaces: ");
		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();
		
		int int1=Integer.parseInt(s1);
		int int2=Integer.parseInt(s2);
		int int3=Integer.parseInt(s3);
		
		if(int1<100 && int2<100 && int3<100){
		if((int1+int2)==int3){
			System.out.println(int1+"+"+int2+"="+int3);
		}
		else if(int1==(int2+int3)){
				System.out.println(int1+"="+int2+"+"+int3);
			}
		else if((int1-int2)==int3){
			System.out.println(int1+"-"+int2+"="+int3);
		}
		else if(int1==(int2-int3)){
			System.out.println(int1+"="+int2+"-"+int3);
		}
		else if((int1*int2)==int3){
			System.out.println(int1+"*"+int2+"="+int3);
		}
		else if(int1==(int2*int3)){
			System.out.println(int1+"="+int2+"*"+int3);
		}
		else if((int1/int2)==int3){
			System.out.println(int1+"/"+int2+"="+int3);
		}
		else if(int1==(int2/int3)){
			System.out.println(int1+"="+int2+"/"+int3);
		}
		else 
			System.out.println("Invalid inputs");
		}
		else 
			System.out.println("Inputs should be less than 100");
	}
}
