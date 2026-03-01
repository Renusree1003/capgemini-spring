package com.capgemini.library_Management.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.library_Management.entity.Author;
import com.capgemini.library_Management.dao.AuthorRepository;
import com.capgemini.library_Management.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepo;

    @Override
    public Author addAuthor(Author author) {
        return authorRepo.save(author);
    }

    @Override
    public Author getAuthorById(Long id) {
        return authorRepo.findById(id).orElseThrow();
    }

    @Override
    public List<Author> getAllAuthors() {
        return authorRepo.findAll();
    }

    @Override
    public Author updateAuthor(Long id, Author author) {
        Author existing = authorRepo.findById(id).orElseThrow();
        existing.setName(author.getName());
        existing.setBiography(author.getBiography());
        return authorRepo.save(existing);
    }

    @Override
    public void deleteAuthor(Long id) {
        authorRepo.deleteById(id);
    }
}