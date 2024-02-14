package com.springrest.fullstack_crud.servicxe;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.fullstack_crud.exception.UserNotFoundException;
import com.springrest.fullstack_crud.model.User;
import com.springrest.fullstack_crud.repo.Repo;

import net.bytebuddy.asm.Advice.Return;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private Repo repo;

	public UserServiceImpl() {

	}

	@Override
	public List<User> getUser() {

		return repo.findAll();
	}

	@Override
	public User getUserId(long id) {
		return repo.findById(id).orElseThrow(() -> new UserNotFoundException(id));

	}

	@Override
	public User addUser(User user) {
		repo.save(user);
		// TODO Auto-generated method stub
		return user;
	}

	@Override
	public User updateUsers(User newuser, long id) {

		return repo.findById(id).map(user -> {
			user.setFirstname(newuser.getFirstname());
			user.setLastname(newuser.getLastname());
			user.setEmail(newuser.getEmail());
			return repo.save(user);

		}).orElseThrow(() -> new UserNotFoundException(id));
	}

	@Override
	public String deleteuser(long id) {
		if (!repo.existsById(id)) {
			throw new UserNotFoundException(id);
		}

		repo.deleteById(id);
		return "User with id " + id + "has been delete sucess.";
	}

	



}
