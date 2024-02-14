package com.springrest.fullstack_crud.exception;

public class UserNotFoundException extends RuntimeException {
	public UserNotFoundException(long id) {
		super ("could not found the user with id");
	}

}
