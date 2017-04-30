package specialseries;

public class SpecialSeries {
	
	private static double calculateTerm(double x, int numTerms)
    {
        double term = 1D;
        for (int i = (2*numTerms+1); i > 0; i--) {
            term *= x*(i%2 == 0 ? 1 : i)/(i%2 == 0 ? i : 1);
        }
        term /= 2*(2*numTerms+1);
        return term; 
    }
        
    public static double sumOfSeries(double x, int numTerms)
    {
        if (x < -1D || x > 1D) {
            System.out.println("Please ensure what x value in range [-1; 1] and try again.");
            return 0D;
        }
        
        double result = 0D;        
        for (int i = 0; i < numTerms; i++) {
            result += calculateTerm(x, i);
        }        
        return result;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static double Term(double x, int numTerms)
	{
		if(numTerms%2==0){
			numTerms=numTerms-1;
		}
		else{
			numTerms=numTerms;
		}
		
		double term=((double)1/numTerms);
		for(int i=numTerms;i>0;i--){
		term=term*x;
		}
		return term;
	}

	public static double sumOfSeries(double x, int numTerms)
	{
		double result1=x;
		for(int j=numTerms;j>1;j=j-2){
		double result=1.0*Term(x,numTerms);
		for(int i=numTerms;i>1;i=i-2){
				int num=numTerms-2;
				int den=numTerms-1;
				
				result=result*((num)/(den));
			}		
		result1=result1+result;
		numTerms=numTerms-2;
		}
		return result1;
	}*/
}
