package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepo;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepo bookRepo;

    @Override
    public Book createBook(Book book) {
        // TODO Auto-generated method stub
        System.out.println(book.toString());
        return bookRepo.save(book);
    }

    @Override
    public void deleteBookById(Long bookId) {
        // TODO Auto-generated method stub

    }

    @Override
    public List<Book> getAllBooks() {
        // TODO Auto-generated method stub
        return bookRepo.findAll();
    }

    @Override
    public Book getBookByName(String bookName) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Book getbookById(Long bookId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Book updateBook(Book book, Long bookId) {
        // TODO Auto-generated method stub
        return null;
    }

}
