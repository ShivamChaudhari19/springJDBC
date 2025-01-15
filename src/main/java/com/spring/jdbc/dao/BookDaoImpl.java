package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class BookDaoImpl implements BookDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public int insert(Book book) {
        String q="INSERT INTO book(BKid,title,author,cost)values(?,?,?,?)";
        int r=this.jdbcTemplate.update(q,book.getBkid(),book.getTitle(),book.getAuthor(),book.getCost());
        return r;
    }
}
