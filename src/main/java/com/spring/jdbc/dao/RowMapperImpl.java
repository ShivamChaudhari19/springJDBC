package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Book;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImpl implements RowMapper<Book> {

    @Override
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
        Book book=new Book();
        book.setBkid(rs.getInt(1));
        book.setTitle(rs.getString(2));
        book.setAuthor(rs.getString(3));
        book.setCost(rs.getDouble(4));
        book.setDate(rs.getDate(5));
        return book;
    }
}