package com.capgemini.library_Management.service;

import java.util.List;
import java.util.Set;

import com.capgemini.library_Management.entity.Book;

public interface BookService {

    Book addBook(Book bookDetails, Long categoryId, Long branchId, Set<Long> authorIds);

    Book getBookById(Long bookId);

    List<Book> getAllBooks();

    Book updateBook(Long bookId, Book updatedDetails);

    void deleteOrDisableBook(Long bookId);
}