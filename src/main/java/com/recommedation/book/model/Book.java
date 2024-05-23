package com.recommedation.book.model;

import lombok.Data;

@Data
public class Book {
    private Long id;
    private String title;
    private String author;
    private String genre;
    private double rating;
}
