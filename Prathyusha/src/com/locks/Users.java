package com.locks;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class Users 
{
	private static Map<String, User> users = new HashMap<String, User>();
	Lockout lockout = new Lockout();
	
	public Users() {
		users.put("sri", new User("sri","sri"));
	}
	
	public Integer authenticate(String userId, String pwd)
	{
		if(users.get(userId) == null)
		{
			System.out.println("User does not exist.");
			return -1;
		}
		else
		{
			User user = users.get(userId);
			int isValid =  user.authenticate(pwd);
			if(isValid == 1)
			{
				user.setNextAttemptTime(0);
				user.setWrongAttempts(0);
				return -1;
			}
			else if(isValid == 0)
			{
				int wrongAttempts = user.getWrongAttempts();
				int waitTime = lockout.getLockoutValue(++wrongAttempts);
				user.setWrongAttempts(wrongAttempts);
				Calendar cal = new GregorianCalendar();
				user.setNextAttemptTime((waitTime * 1000) + cal.getTimeInMillis());
				return waitTime;
			}
			else
			{
				System.out.println("Account locked. ");
				return -2;
			}
		}
	}
	
	public void createUser(String userId, String pwd)
	{
		if(users.get(userId) == null)
		{
			users.put(userId, new User(userId, pwd));
		}
		else
		{
			System.out.println("User exists");
		}
	}
}

class User
{
	private String userId;
	private String pwd;
	private int wrongAttempts;
	private long nextAttemptTime;
	
	public User(String userId, String pwd) 
	{
		this.userId = userId;
		this.pwd = pwd;
		wrongAttempts = 0;
		nextAttemptTime = 0;
	}

	public int getWrongAttempts() {
		return wrongAttempts;
	}

	public void setWrongAttempts(int wrongAttempts) {
		this.wrongAttempts = wrongAttempts;
	}

	public long getNextAttemptTime() {
		return nextAttemptTime;
	}

	public void setNextAttemptTime(long nextAttemptTime) {
		this.nextAttemptTime = nextAttemptTime;
	}
	
	public int authenticate(String mypass)
	{
		Calendar cal = new GregorianCalendar();
		if(this.nextAttemptTime > cal.getTimeInMillis())
			return -1;
		if(this.pwd.equals(mypass))
		{
			return 1;
		}
		return 0;
	}
}
