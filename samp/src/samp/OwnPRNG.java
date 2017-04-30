package samp;

import java.util.Date;
import java.util.Random;


public class OwnPRNG 
{
	public static void main(String[] args) {
		for(int i=0; i<10000000;i++)
			System.out.print(getRandomBitString());
	}
	
	public static String getRandomBitString()
	{
		Date d = new Date();
		long rand = new Random().nextLong();
		long timeInMS = d.getTime();
		return Long.toBinaryString(timeInMS * rand);
	}
}
