package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Author;

public interface AuthorService {
    public Author createAuthor(Author author);

    public List<Author> getAllAuthor();

    public Author getAuthorById(Long authorId);

    public Author updateAuthor(Author author, Long authorId);

    public void deleteAuthorById(Long authorId);

    public Author getAuthorByName(String authorName);
}
