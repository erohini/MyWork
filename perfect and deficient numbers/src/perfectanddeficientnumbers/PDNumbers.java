package perfectanddeficientnumbers;

public class PDNumbers {

	public void isPerfect(int n)
	{
		//System.out.println("These numbers are perfect...");
		int result=0;
		for(int i=1;i<n;i++){
			if(n%i==0)
			{
				result=result+i;
			}
		}
		if(result==n){
		//System.out.print(+n+" \t");
		}
		else if(result<n){
				//System.out.print(+n+" \t");
			}
		else 
			System.out.print(+n+" \t");
			
			//System.out.println(+n+" is not perfect number...");
			
	}
	
	
	public void isDeficient(int n)
	{
		//System.out.println("These numbers are deficient...");
		int result=0;
		for(int i=1;i<n;i++){
			if(n%i==0)
			{
				result=result+i;
			}
		}
		if(result<n){
			System.out.print(+n+" \t");
		//System.out.println(+n+" is deficient number...");
		}
		/*else
			System.out.println(+n+" is not deficient number...");*/

	}
}
