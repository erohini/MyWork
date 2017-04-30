package trignometricseries;

public class Main {

	public static void main(String[] args) {
		TrignometricSeries ts=new TrignometricSeries();
		
		Double x=Math.PI/3;
		int numTerms=10;
		//System.out.printf("sin(%1$d) = %2$f \n", (int)Math.round(x*180/Math.PI)
               // , ts.sin(x, numTerms));
		System.out.println(+ts.sin(x, numTerms));
		System.out.println(+ts.cos(x, numTerms));
		
		
		System.out.println(+Math.sin(x));
		System.out.println(+Math.cos(x));

	}

}
