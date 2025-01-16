package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Book;

public interface BookDao {
    public  int insert(Book book);
    public  int update(Book book);
    public  int delete(Book book);
}
