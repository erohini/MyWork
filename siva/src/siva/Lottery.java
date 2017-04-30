package siva;

import java.util.Random;

public class Lottery {
	
int upperLimit;
	
	public Lottery(){
		upperLimit = 99;
	}
	
	public Lottery(int upperlimit){
		
	}
	
	public int pickNumber(){
		int random = new Random().nextInt(99);
			System.out.println(random);
		return upperLimit;
		
	}		
}

