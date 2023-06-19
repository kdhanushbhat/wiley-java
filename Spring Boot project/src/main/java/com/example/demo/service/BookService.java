package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Book;

public interface BookService {
    public Book createBook(Book book);

    public List<Book> getAllBooks();

    public Book getbookById(Long bookId);

    public Book updateBook(Book book, Long bookId);

    public void deleteBookById(Long bookId);

    public Book getBookByName(String bookName);
}
