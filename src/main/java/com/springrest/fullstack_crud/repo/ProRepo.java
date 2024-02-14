package com.springrest.fullstack_crud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.fullstack_crud.model.Product;

public interface ProRepo extends JpaRepository<Product, Integer> {

}
