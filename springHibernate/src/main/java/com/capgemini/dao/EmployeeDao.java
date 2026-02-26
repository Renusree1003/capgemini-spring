package com.capgemini.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capgemini.dto.Employee;
import com.capgemini.main.JpaUtil;

@Repository
public class EmployeeDao {
	
	@Autowired
	JpaUtil jpa;
	EntityManager em = jpa.getEntityManager();
			
	//EntityManager entityManager;
	
	
	
	public void insert(Employee e) {
		em.getTransaction().begin();
		Employee employee = findById(e.getId());
		
		em.getTransaction().commit();
	}
	
	public Employee findById(int id) {
		return em.find(Employee.class, id);
	}
	
	public void Delete(Employee e) {
	
		Employee employee = findById(e.getId());
		em.getTransaction().begin();
		if(employee != null) {
			em.remove(e);
		} else {
			System.out.println("Employee not found");
		}
		em.getTransaction().commit();
	}
	
	
	public void update(Employee e) {
		Employee employee = findById(e.getId());
		em.getTransaction().begin();
		if(employee !=  null) {
			e.setSalary(30000);
		} else {
			System.out.println("Employee not found");
		}
		em.getTransaction().commit();
	}

}
