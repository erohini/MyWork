package bankApplication;

import java.util.Scanner;

public class Account implements IBalance{
	
	Scanner sc= new Scanner(System.in);
	private double account_balance;
	
	
	public Account(){
		System.out.println("Enter the amount: ");
		double initial_balance = sc.nextDouble();
		account_balance=initial_balance;
	}
	
	double current_balance = account_balance;
	public void credit(){
		double amount;
		System.out.println("Enter credit amount: ");
		amount=sc.nextDouble();
		if(amount>0){
		current_balance=current_balance+amount;
		System.out.println("Amount: "+current_balance);
		}
		else
			System.out.println("Improper entry...");
	}
	
	
	public void debit(){
			double withdraw_money;
			System.out.println("Enter debit amount: ");
			withdraw_money=sc.nextDouble();
			if(withdraw_money<=current_balance){
				if(withdraw_money>0){
				current_balance=current_balance-withdraw_money;
				System.out.println("Amount: "+current_balance);
				}
				else 
					System.out.println("Improper entry...");
			}
			else
				System.out.println("Debit amount exceeded account balance");
		}

	@Override
	public void getBalance() {
		// TODO Auto-generated method stub
		
	}
	

}
