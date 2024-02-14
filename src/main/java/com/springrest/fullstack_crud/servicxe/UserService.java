package com.springrest.fullstack_crud.servicxe;

import java.util.List;

import com.springrest.fullstack_crud.model.User;



public interface UserService   {
	
	public List<User> getUser();

	public User getUserId(long id);

	public User addUser(User user);

	public User updateUsers(User newuser,long id);

	public String deleteuser(long id );




	

	

	

}
