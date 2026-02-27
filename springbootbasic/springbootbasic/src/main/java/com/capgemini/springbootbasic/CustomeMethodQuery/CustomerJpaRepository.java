package com.capgemini.springbootbasic.CustomeMethodQuery;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerJpaRepository extends JpaRepository<Customer,Integer>{
	public Customer getByEmail(String email);
	
	public Customer getByNameAndEmail(String name, String email);
	
	List<Customer> getByNameOrEmail(String name, String email);

}
