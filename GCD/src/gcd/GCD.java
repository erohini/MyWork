package gcd;

public class GCD {
	
	public static int recursive(int a,int b)
	{
		int aModb=0;
		if(a>b)
		{
		aModb=a%b;
		}
		//else
			//System.out.println("a should be greater than b...");
		return aModb;
	}
	
	

	public static int gcd(int a, int b)
	{
		int temp=0;
		if(a>b)
		{
		while(b!=0)
		{
			temp=b;
			b=GCD.recursive(a, b);
			a=temp;
		}
		System.out.println("GCD is: "+a);
		}
		else 
			System.out.println("A should be greater than b...");
		return temp;
	}
}
