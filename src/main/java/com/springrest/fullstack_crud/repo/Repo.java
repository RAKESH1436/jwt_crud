package com.springrest.fullstack_crud.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springrest.fullstack_crud.model.User;

public interface Repo extends JpaRepository<User, Long>{
	
	
}
