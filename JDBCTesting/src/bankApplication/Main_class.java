package bankApplication;

import java.io.IOException;
import java.util.Scanner;

public class Main_class {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Menu menu = new Menu();
		System.out.println("Welcome to Rohini's Bank... \n Select the desired one...");
		System.out.println("Are you a 1. new user or 2. return user ?");
		int x = sc.nextInt();
		if(x==1){
			System.out.println("Are you want to create new account? (Y/N)");
			String s = sc.next();
			if(s.equals("y")||s.equals("Y")){
				menu.createAccount();
			}
			else if (s.equals("n")||s.equals("N")){
				System.out.println("need help? contact 9898545449");
			}
		}
		if(x==2){
			System.out.println("Select the desired one...");
			System.out.println("1. check balance \n 2. Deposit \n 3. withdrawl \n any key to exit");
			int choice = sc.nextInt();
			if(choice == 1){
				menu.checkBalance();
			}
			else if(choice == 2){
				
			}
			else if(choice == 3){
				
			}
			else 
				System.out.println("Enter proper input...");
		}

	}

}
