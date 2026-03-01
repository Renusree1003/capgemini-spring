package com.capgemini.library_Management.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.library_Management.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
	
}