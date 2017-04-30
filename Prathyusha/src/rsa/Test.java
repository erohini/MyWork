package rsa;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {
	static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
   	 System.out.println("Question 1 ");
   	 System.out.println("Enter n, e, m, c: ");
   	 int n = sc.nextInt();
   	 int e = sc.nextInt();
   	 int m = sc.nextInt();
   	 int c = sc.nextInt();
   	 question1(n, e, m);
   	 System.out.println("Question 2 ");
   	 question2(n, e, c);
    }
    public static void question1(int n,int e,int m){
   	 BigInteger big = BigInteger.valueOf(m).pow(e).mod(BigInteger.valueOf(n));
   	 System.out.println(big);
    }
    
    public static void question2(int n,int e,int c){
   	 int p = allFactors(n).get(0);
   	 int q = allFactors(n).get(1);
   	 int piofn = (p-1)*(q-1);
   	 int d = 0;
   	 for (int i = 0; i < piofn; i++) {
   		 if((i*e)%piofn == 1){
   			 d = i;
   			 break;
   		 }
   	 }
   	 BigInteger big = BigInteger.valueOf(c).pow(d).mod(BigInteger.valueOf(n));
   	 System.out.println(big);
    }
    public static ArrayList<Integer> allFactors(int a) {
    	int upperlimit = (int)(Math.sqrt(a));
    	ArrayList<Integer> factors = new ArrayList<Integer>();
    	for(int i=1;i <= upperlimit; i+= 1){
        	if(a%i == 0){
       		 if((a/i > 1) && (a/i !=a)){
       			 factors.add(i);
       		 }
            	if(i != a/i){
           		 if((a/i > 1) && (a/i !=a)){
           			 factors.add(a/i);
           		 }
            	}
        	}
    	}
    	Collections.sort(factors);
    	return factors;
    }
}

