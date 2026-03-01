package com.capgemini.library_Management.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.library_Management.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
	
}
