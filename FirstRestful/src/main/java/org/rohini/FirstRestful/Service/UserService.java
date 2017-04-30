package org.rohini.FirstRestful.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.rohini.FirstRestful.Model.*;
import org.rohini.FirstRestful.database.*;

public class UserService {
	private Map<Long, User> users =DatabaseClass.getUsers();

	public UserService(){
		users.put(1L, new User(1,"Sairam"));
		users.put(2L, new User(2,"Viharika"));
	}
	
	public List<User> getAllUsers(){
		return new ArrayList<User>(users.values());
	}
	
	public User getUser(long id){
		return users.get(id);
	}
	
	public User addUser(User user){
		user.setId(users.size()+1);
		users.put(user.getId(), user);
		return user;
	}
	
	public User updateUser(User user) {
		if (user.getId() <= 0) {
			return null;
		}
		users.put(user.getId(), user);
		return user;
	}
	
	public User removeUser(long id) {
		return users.remove(id);
	}
	
}
