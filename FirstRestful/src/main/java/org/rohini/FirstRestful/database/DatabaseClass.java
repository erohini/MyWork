package org.rohini.FirstRestful.database;

import java.util.HashMap;
import java.util.Map;

import org.rohini.FirstRestful.Model.User;



public class DatabaseClass {

	private static Map<Long, User> users = new HashMap<>();
	
	public static Map<Long, User> getUsers() {
		return users;
	}
}
