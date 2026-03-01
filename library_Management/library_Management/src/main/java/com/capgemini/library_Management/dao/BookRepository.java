package com.capgemini.library_Management.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.library_Management.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {}

