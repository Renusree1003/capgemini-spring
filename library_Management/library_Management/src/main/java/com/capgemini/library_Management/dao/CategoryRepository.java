package com.capgemini.library_Management.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.library_Management.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}