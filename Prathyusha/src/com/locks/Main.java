package com.locks;

import java.util.Scanner;

public class Main 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Login login = new Login();
		Users users = new Users();
		int action = 1;
		do
		{
			System.out.println("1. Login");
			System.out.println("2. Add User");
			System.out.println("3. Exit");
			System.out.println("Enter Option:");
			action = sc.nextInt();
			switch (action) {
				case 1:
					System.out.println("Enter userid and pass:");
					String userId = sc.next();
					String pwd = sc.next();
					login.doLogin(userId, pwd);
					break;
				
				case 2:
					System.out.println("New user Id: ");
					String newUserId = sc.next();
					System.out.println("Password for " + newUserId +": ");
					String newPass = sc.next();
					users.createUser(newUserId, newPass);
					break;
					
				case 3:
					System.out.println("Bye.");
				default:
					break;
			}
			
			
			
		}while(action<3);
		sc.close();
	}
	
}
