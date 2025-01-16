package com.spring.jdbc.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class Book {
    @Value("19")
    private int bkid;
    @Value("demo19updated")
    private String title;
    @Value("demoAutor19updated")
    private String author;
    @Value("999.99")
    private double cost;
    private Date date=new Date();

    public int getBkid() {
        return bkid;
    }

    public void setBkid(int bkid) {
        this.bkid = bkid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bkid=" + bkid +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", cost=" + cost +
                ", date=" + date +
                '}';
    }
}
