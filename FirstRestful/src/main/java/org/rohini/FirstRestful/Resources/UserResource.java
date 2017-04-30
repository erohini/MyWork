package org.rohini.FirstRestful.Resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.rohini.FirstRestful.Model.User;
import org.rohini.FirstRestful.Service.UserService;

@Path("/Users")
public class UserResource {

	UserService userService = new UserService();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getUsers(){
		return userService.getAllUsers();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public User addUsers(User user){
		return userService.addUser(user);
		
	}
	
	@PUT
	@Path("/{userId}")
	public User updateMessage(@PathParam("userId") long id, User user) {
		user.setId(id);
		return userService.updateUser(user);
	}
	
	@DELETE
	@Path("/{userId}")
	public void deleteUser(@PathParam("userId") long id) {
		userService.removeUser(id);
	}
	
	@GET
	@Path("/{userId}")
	@Produces(MediaType.APPLICATION_JSON)
	public User test(@PathParam("userId") long userId){
		return userService.getUser(userId);
		
	}
}
