package bankApplication;

import java.util.Scanner;

public class AccountTester {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		Account a=new Account();

		System.out.println("you want credit or debit? ");
		int choice=sc.nextInt();
		if(choice==1){
			a.credit();
		}
		else if(choice==2){
			a.debit();
		}
		else
			System.out.println("Invalid input");

	}

}
