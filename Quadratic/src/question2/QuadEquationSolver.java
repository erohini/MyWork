package question2;

/**
 * The quadratic equation solver. It provides these methods:
 * 
 * 1. constructor with three coefficients as parameters.
 * 2. solve -- solve the equation
 * 3. displaySolutions -- display the equation and the two roots
 * 
 */

import java.util.List;
import java.util.Vector;

public class QuadEquationSolver {
	
	private double a, b, c;
	List<Complex> roots;
	
	QuadEquationSolver(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		roots = new Vector<>();
	}
	
	/**
	 * Solve the quadratic equation.
	 * @return List containing the two roots
	 */
	public List<Complex> solve() {
		if (a == 0) {
		   if (b == 0)
		      System.out.println("No solution -- both a and b are 0.");
		   else {
			   double re = -c / b;
		       roots.add(new Complex(re, 0));
		   }
		}
		else {
			roots.add(findARoot(1));
			roots.add(findARoot(-1));
        } 
		return roots;
	}
	
	/**
	 * Display the quadratic equation. The "sum" signs
	 * of the terms depend on the coefficients.
	 */
	private void displayEquation() {
	    char bSign = (b >= 0) ? '+' : '-';
		char cSign = (c >= 0) ? '+' : '-';	    
        System.out.println("   " + a + "X^2 " + bSign + " " + Math.abs(b) +
                           "X " + cSign + " " + Math.abs(c) + " = 0");
    }

	/**
	 * Find a root of the quadratic equation.
	 * @param whichRoot Get the "+" root if whichRoot is 1
	 *                  Get the "-" root if whichRoot is -1
	 * @return The root
	 */
    private Complex findARoot(int whichRoot) {
        double discriminant = b * b - 4 * a * c;
        double denominator = 2 * a;
        double realPart = -b / denominator;
        double imgPart = Math.sqrt(Math.abs(discriminant)) / denominator;
        if (discriminant >= 0) {
        	realPart += whichRoot * imgPart;
        	imgPart = 0;
        }
        return new Complex(realPart, whichRoot * imgPart);
    }
	
    public void displaySolutions() {
    	System.out.println("\nThe two roots of the equation\n");
    	displayEquation();
    	System.out.printf("\nare:\n%8s%s\n%8s%s\n",
    			          "x1 = ", roots.get(0), "x2 = ", roots.get(1));
    }
	
}
