package com.locks;

public class Login 
{
	Users users = new Users();
	
	public void doLogin(String userId, String pwd)
	{
		int status = users.authenticate(userId, pwd);
		if(status == -2)
		{
			System.out.println("Login Failed");
		}
		else if(status == -1)
		{
			System.out.println("Login Successful.");
		}
		else
		{
			System.out.println("Account locked for " + status + " Secs");
		}
	}

}
