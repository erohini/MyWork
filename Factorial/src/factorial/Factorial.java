package factorial;

public class Factorial {

	public static void main(String[] args) {
		Factorial f=new Factorial();
		
		for(int i=1;i<=10;i++){
		f.printFactorial(i);
		}

	}

	public void printFactorial(int n)
	{
		
		int result=1;
		for(int i = n;i>0;i--)
		{
			result=result*i;
		}
		System.out.println("Factorial of "+n+" is: "+result);
		
			
	}
}
