package factorialint;

public class FactorialInt {

	public static void main(String[] args) {
		FactorialInt f=new FactorialInt();
		
		f.printFactorialInt();
	}
	
	
	public void printFactorialInt()
	{
		int i=1;
		int fn=1;
		
		while(true)
		{
			System.out.println("Factorial of "+i+" is "+fn);
			 if ((Integer.MAX_VALUE / fn) < (i+1)){
			 System.out.println("out of range...");
			 break;
			 }
			 
			 i++;
			 fn*=i;
		}
	}

}
