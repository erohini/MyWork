package homework2;

import java.util.Scanner;
public class RockPaperScissors
{
	public static void main(String[] args)
    {
		 boolean b=true;
		 Scanner scan = new Scanner(System.in);
		do{
			System.out.println("Press exit to end else press any key to continue...");
		     String exit=scan.next();
		     if(exit.equals("exit")){
		    	 b=false;
		    	 break;
		     }
		     else{
         System.out.println("Player 1: Choose rock, scissor, or paper:");
         String player1 = scan.next().toLowerCase();
         System.out.println("Player 2: Choose rock, scissor, or paper:");
         String player2 = scan.next().toLowerCase(); 
         
         if (player1.equals(player2)) {
        	   System.out.println("It's a tie!");
        	}
        	else if (player1.equals("rock")) {
        	   if (player2.equals("scissor")) 
        	      System.out.println("Rock crushes scissors. player 1 WIN!! , player 2 LOSE!!");
        	   else if (player2.equals("paper")) 
        	        System.out.println("Paper eats rock. Player 2 WIN!!, Player 1 LOSE!!");
        	}
        	else if (player1.equals("paper")) {
        	   if (player2.equals("scissor")) 
        	       System.out.println("Scissor cuts paper. Player 2 WIN!! , Player 1 LOSE!!"); 
        	   else if (player2.equals("rock")) 
        	        System.out.println("Paper eats rock. Player 1 win!! , Player 2 LOSE");
        	} 
        	else if (player1.equals("scissor")) {
        	     if (player2.equals("paper")) 
        	         System.out.println("Scissor cuts paper. Player 1 WIN!!, Player 2 LOSE"); 
        	     else if (player2.equals("rock")) 
        	        System.out.println("Rock breaks scissors. Player 2 WIn!! , Player 1 LOSE!!");
        	}
        	else 
        	{
        	     System.out.println("Invalid user input.");
        	}
		     }
     	}while (b=true);
	     }
}
  
