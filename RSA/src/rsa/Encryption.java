package rsa;


import java.math.BigInteger;

public class Encryption {

	BigInteger c;
	public Encryption(BigInteger m, BigInteger e, BigInteger n) {
		
		System.out.println("Encryption");
		System.out.println("~~~~~~~~~~");
		c=m.modPow(e,n);
		System.out.println("Cipher text...\n"+c);
		
	}

}
