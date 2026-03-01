package com.capgemini.library_Management.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.library_Management.entity.LibraryBranch;

public interface LibraryBranchRepository extends JpaRepository<LibraryBranch, Long> {
	
}