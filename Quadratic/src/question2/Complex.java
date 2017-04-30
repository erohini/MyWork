package question2;

/**
 * A complex number a+bi has real part a and imaginary part b.
 * 
 * This class should provides many methods for complex number
 * operations, but here only the string representation of a
 * complex number is given.
 *
 */

public class Complex {
	 private double re;
	 private double im;

	 public Complex(double real, double imag) {
	     re = real;
	     im = imag;
	 }
	 public double re() { return re; }
	 public double im() { return im; }
	 
	 /**
	  * String representation of a complex number
	  * with 4-digit decimal
	  */
	 @Override
	 public String toString() {
		 String reStr = String.format("%.4f", re);
		 String imStr = String.format("%.4f", Math.abs(im));
		 String sign = im < 0 ? " - " : " + ";
		 if (im == 0) return reStr;
		 if (re == 0) return imStr + "i";
		 return reStr + sign + imStr + "i";
	 }
}
