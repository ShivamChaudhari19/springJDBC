package com.spring.jdbc;

import com.spring.jdbc.dao.BookDaoImpl;
import com.spring.jdbc.entities.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
public class Main {
    public static void main(String[] args) {
        System.out.println("Program is Started...........");
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        JdbcTemplate jdbcTemplate=context.getBean("jdbcTemplate", JdbcTemplate.class);
        Book book=context.getBean("book",Book.class);
BookDaoImpl bookDaoImpl=context.getBean("BookDaoImpl", BookDaoImpl.class);
        System.out.println("number of record inserted:"+bookDaoImpl.insert(book));

    }
}