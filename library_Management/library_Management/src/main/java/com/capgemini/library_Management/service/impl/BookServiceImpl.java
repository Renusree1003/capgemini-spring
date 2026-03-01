package com.capgemini.library_Management.service.impl;



import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.library_Management.dao.AuthorRepository;
import com.capgemini.library_Management.dao.BookRepository;
import com.capgemini.library_Management.dao.CategoryRepository;
import com.capgemini.library_Management.dao.LibraryBranchRepository;
import com.capgemini.library_Management.entity.Author;
import com.capgemini.library_Management.entity.Book;
import com.capgemini.library_Management.entity.Category;
import com.capgemini.library_Management.entity.LibraryBranch;
import com.capgemini.library_Management.service.BookService;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepo;

    @Autowired
    private CategoryRepository categoryRepo;

    @Autowired
    private LibraryBranchRepository branchRepo;

    @Autowired
    private AuthorRepository authorRepo;

    @Override
    public Book addBook(Book bookDetails, Long categoryId, Long branchId, Set<Long> authorIds) {

        Category category = categoryRepo.findById(categoryId).orElseThrow();
        LibraryBranch branch = branchRepo.findById(branchId).orElseThrow();

        bookDetails.setCategory(category);
        bookDetails.setBranch(branch);

        Set<Author> authors = new HashSet<>();
        for (Long id : authorIds) {
            authors.add(authorRepo.findById(id).orElseThrow());
        }

        bookDetails.setAuthors(authors);
        bookDetails.setStatus("ACTIVE");

        return bookRepo.save(bookDetails);
    }

    @Override
    public Book getBookById(Long bookId) {
        return bookRepo.findById(bookId).orElseThrow();
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    @Override
    public Book updateBook(Long bookId, Book updatedDetails) {
        Book book = bookRepo.findById(bookId).orElseThrow();

        book.setTitle(updatedDetails.getTitle());
        book.setIsbn(updatedDetails.getIsbn());
        book.setPublishYear(updatedDetails.getPublishYear());
        book.setCopiesTotal(updatedDetails.getCopiesTotal());

        return bookRepo.save(book);
    }

    @Override
    public void deleteOrDisableBook(Long bookId) {
        Book book = bookRepo.findById(bookId).orElseThrow();
        book.setStatus("INACTIVE");
        bookRepo.save(book);
    }
}
