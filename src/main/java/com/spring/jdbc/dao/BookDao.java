package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Book;

import java.util.List;

public interface BookDao {
    public  int insert(Book book);
    public  int update(Book book);
    public  int delete(Book book);
    public  Book getBook(int BKid);
    public List<Book> getAllBooks();
}
