package ownprng;

import java.util.Date;
import java.util.Random;


public class OwnPRNG 
{
	public static void main(String[] args) {
		Date date= new Date();
		long random = new Random().nextLong();
		long time = date.getTime();
		for(int i=0; i<10000000;i++)
			System.out.print(Long.toBinaryString(time * random));
	}
}
