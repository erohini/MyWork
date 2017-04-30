package bankingAccount;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountDetails {
	String[] Name=new String[100];
	int[] AccountNumber=new int[100];
	double[] Balance_amt=new double[100];
	int Min=1;
	int Max=100;
	int total=0;
	
	double Min_bal=10;
	
	
	Scanner in=new Scanner(System.in);
	
	public void Initialize()
	{
		for(int k=0;k<Max;k++)
		{
			Name[k]=" ";
			AccountNumber[k]=0;
			Balance_amt[k]=0;
		}
	}
	
	public void NewEntry() {
		try{
		System.out.println("Only checking account is allowed..");
		System.out.println("1. Open Checking Account");
		System.out.println("2. Exit");
		int b=in.nextInt();
		
		if(b==1)
		{
			total++;
			AccountNumber[total]=total;
			double IDep_amt=0;
			
			System.out.println("Please enter your details ");
			System.out.println("Enter your name: ");
			Name[total]=in.next();
			System.out.println("Your account number is "+AccountNumber[total]);
			System.out.println("Account Type: Checking Account");
			
			while(IDep_amt<Min_bal)
			{
			System.out.println("Enter the deposit ammount \n Note: You should Deposit minimum of $10");
			IDep_amt=in.nextDouble();
			}
				Balance_amt[total]=IDep_amt;
				System.out.println("Balance amount in your account is "+Balance_amt[total]);
				System.out.println("Congratulations! Your Account is created");
				AccountNumber[total]++;
			
			
		}
		else if(b==2){
			System.out.println("We  are sorry...");
		}
		else
			System.out.println("Sorry this is unavailable option");
		}
		catch(InputMismatchException e)
		{
			System.out.println("Only 1 or 2 allowed");
		}
	}
	
	
	public void Accountnumber(int ac_no)
	{
		if(ac_no<Min || ac_no>total)
		{
			System.out.println("Invalid account number...");
			System.exit(0);
		}
	
	}
	
	
	public void Deposit(int ac_no)
	{
		
			System.out.println("Account number is: "+AccountNumber[ac_no]);
			System.out.println("Name: "+Name[ac_no]);
			System.out.println("Account type: Checking Account");
			System.out.println("Balance in your account: "+Balance_amt[ac_no]);
			System.out.println("Enter Deposit Amount: ");
			double Dep_amt=in.nextDouble();
			
			Balance_amt[ac_no]=Balance_amt[ac_no]+Dep_amt;
			
			System.out.println("After Deposit \n Your Balance is: "+Balance_amt[ac_no]);
		
	}
}
