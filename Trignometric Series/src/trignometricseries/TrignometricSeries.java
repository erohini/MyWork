package trignometricseries;

public class TrignometricSeries {
	
	public static Double power(double x, int numTerms)
	{
		Double term=1.0;
		for(int j=numTerms;j>0;j--)
		{
			term=term*(x/j);
		}
		return term;
	}
	
	
	
	public static double sin(double x, int numTerms)
	{
		double result=0.0;
		int count=0;
		for(int i=0;i<=numTerms;i++)
		{
			if(count%2!=0){
			result=result-power(x,(2*i+1));
			count++;
			}
			else 
			{
				result=result+power(x,(2*i+1));
				count++;
			}
		}
		return result;
	}
	
	
	
	public static double cos(double x, int numTerms)
	{
		double result=0.0;
		int count=0;
		for(int i=1;i<=numTerms;i++)
		{
			if(count%2!=0){
			result=result-power(x,(2*i));
			count++;
			}
			else 
			{
				result=result+power(x,(2*i));
				count++;
			}
		}
		return result;
	}

}
