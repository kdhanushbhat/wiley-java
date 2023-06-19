package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Author;
import com.example.demo.repository.AuthorRepo;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepo authorRepo;

    @Override
    public Author createAuthor(Author author) {
        System.out.println(author);
        return authorRepo.save(author);
    }

    @Override
    public void deleteAuthorById(Long authorId) {
        // TODO Auto-generated method stub

    }

    @Override
    public List<Author> getAllAuthor() {
        // TODO Auto-generated method stub
        return authorRepo.findAll();
    }

    @Override
    public Author getAuthorById(Long authorId) {
        // TODO Auto-generated method stub
        return authorRepo.findById(authorId).get();
    }

    @Override
    public Author getAuthorByName(String authorName) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Author updateAuthor(Author author, Long authorId) {
        // TODO Auto-generated method stub
        return null;
    }

}
