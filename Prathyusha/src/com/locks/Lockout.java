package com.locks;

import java.util.HashMap;
import java.util.Map;

public class Lockout 
{
	private static Map<Integer, Integer> lockouts = new HashMap<Integer, Integer>();
	
	public Lockout() 
	{
		lockouts.put(1, 0);
		Double a=Math.pow(2, 2-1);
		a.intValue();
		for(int i=2; i<=15; i++)
		{
			lockouts.put(i, Double.valueOf(Math.pow(2, i-1)).intValue());
		}
	}

	public void printLockOuts()
	{
		for(int i=1; i<=15; i++)
		{
			System.out.println(i + "    " + lockouts.get(i));
		}
	}
	
	public Integer getLockoutValue(Integer i)
	{
		return lockouts.get(i);
	}
}
