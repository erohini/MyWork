package rsa;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Decryption {
	
	BigInteger m;
	public Decryption(BigInteger c, BigInteger e, BigInteger n) {
		long copyN=n.longValueExact();
		List<Integer> primefactors = new ArrayList<Integer>();
		int i=2;
		while(i <= copyN){
			if(copyN % i==0)
			{
				primefactors.add(i);
				copyN /= i;
				i--;
			}
			i++;
		}	    
	    int p=primefactors.get(0);
	    int q=primefactors.get(1);
	    System.out.println("Prime factors: \n"+p+"\n"+q);
	    long phiN=((p-1)*(q-1));
	    BigInteger phi_n=BigInteger.valueOf(phiN);
	    try{
	    BigInteger d = e.modInverse(phi_n);
	    System.out.println("Private key: "+d);
	    m=c.modPow(d,n);
	    System.out.println("Decryption");
	    System.out.println("~~~~~~~~~~");
		System.out.println("Original message: "+m);
	    }
	    catch(ArithmeticException ae){
	    	System.out.println("sorry! This cant be invertible");
	    }	
	}
}