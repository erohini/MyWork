package Harmonicseries;

public class HarmonicSum {

	public static void main(String[] args) {
	int den=1,count=0;
	Double sum=0.0;
	while(den<=5)
	{
		if(count%2==0)
		{
		sum=(sum+(double)1/den);
		}
		else
		{
			sum=(sum-(double)1/den);
		}
		den=den+2;
		count++;
	}
	
	System.out.println("sum of harmonic series is: "+sum);

	}

}
