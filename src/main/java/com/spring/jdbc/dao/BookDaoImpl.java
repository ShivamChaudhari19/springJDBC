package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class BookDaoImpl implements BookDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public int insert(Book book) {
        String q="INSERT INTO book(BKid,title,author,cost)values(?,?,?,?)";
        return this.jdbcTemplate.update(q,book.getBkid(),book.getTitle(),book.getAuthor(),book.getCost());
    }
    public int update(Book book){
        String q="UPDATE BOOK SET title=?,author=? where Bkid=?;";
        return this.jdbcTemplate.update(q,book.getTitle(),book.getAuthor(),book.getBkid());
    }
    public int delete(Book book){
        String q="DELETE FROM BOOK where Bkid=?;";
        return this.jdbcTemplate.update(q,book.getBkid());
    }

    @Override
    public Book getBook(int BKid) {
        String q="SELECT * from book where BKid=?";
        RowMapper<Book> rowMapper=new RowMapperImpl();
        return this.jdbcTemplate.queryForObject(q, rowMapper, BKid);
    }

    @Override
    public List<Book> getAllBooks() {
        String q="SELECT * FROM BOOK";
        RowMapper<Book> rowMapper= new RowMapperImpl();
        return this.jdbcTemplate.query(q,rowMapper);
    }
}
