package jdbc_lab1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Donor donor=new Donor();
		donor.createTable();
		int option;
		Scanner sc=new Scanner(System.in);
		do{
		System.out.println("Enter your choice.... \n 1. Want to add new donor. \n 2. Want to see all donors list. \n 3. exit");
		option=sc.nextInt();
		switch(option){
		case 1:
		System.out.println("Enter First name: ");
		String first_name=sc.next();
		System.out.println("\nEnter Last name: ");
		String last_name=sc.next();
		System.out.println("Enter Amount: ");
		int amt=sc.nextInt();
		System.out.println("Enter email: ");
		String e_mail=sc.next();
		
		donor.setFName(first_name);
		donor.setLName(last_name);
		donor.setAmount(amt);
		donor.setEmail(e_mail);
		donor.insertTable(first_name, last_name, amt, e_mail);
		break;
		
		//System.out.println(donor.getFName()+"\n"+donor.getLName()+"\n"+donor.getAmount()+"\n"+donor.getEmail());*/
		case 2:
			donor.selectTable();
			break;
		case 3: System.exit(0);
		default: System.out.println("Invalid option...");
		}}while(option!=3);
		
		}

	
}
