package bankingAccount;

import java.util.Scanner;

public class ExistingAccount {

	Scanner in=new Scanner(System.in);
	AccountDetails ad=new AccountDetails();
	int n=0;
	public void Exist_Account() {
		
		int Min=1;
		int Max=100;
		int Choice=0;
		System.out.println("Enter your Account number");
		n=in.nextInt();
		ad.Accountnumber(n);
		
		System.out.println("Select the options which you want...");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Check details of your account");
		System.out.println("4. Close Account");
		Choice=in.nextInt();
		
		switch(Choice)
		{
		case 1: ad.Deposit(n);
		        break;
		case 2:
		}
		
	}

}
