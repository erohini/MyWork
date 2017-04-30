package bankingAccount;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Account {

	public Account(int input) {
		AccountDetails ad=new AccountDetails();
				
		if(input==1)
		{
			System.out.println("You entered that you want to open new account...");
			ad.NewEntry();
			
		}
		else if(input==2)
		{
			System.out.println("So you want to do changes or check the existing Account...");
			ExistingAccount ea=new ExistingAccount();
			ea.Exist_Account();
		}
		
		else
		{
			System.out.println("Enter the proper option 1 or 2...");
		}
	}
	
	
	public void input()
	{
		int a=0;
		do{			
        Scanner in=new Scanner(System.in);
		
		System.out.println("Account: ");
		System.out.println("1. New Account");
		System.out.println("2. Existing Account");
		a=in.nextInt();
		
		Account acc=new Account(a);
		}while(a!=2);
		/*catch(InputMismatchException e)
		{
			System.out.println("Only numbers 1 or 2 allowed.. other than that are not allowed...");
		}*/
	}

}
