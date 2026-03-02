package com.capgemini.Employee_2nd.march;

import org.springframework.data.jpa.repository.JpaRepository;



public interface EmployeeJpaRepository extends JpaRepository<Employee, String>{
	public Employee findByEmailAndPassword(String email, String password);

}
