package siva;

public class LotteryPrinter {

public static void main(String[] args) {
	
		
		Lottery lottery=new Lottery();
		
		System.out.println("Play this combination - it will make you rich!");
		
		for (int i=0;i<6;i++){
			lottery.pickNumber();
		}
}
}
