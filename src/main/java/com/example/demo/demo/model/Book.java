package com.example.demo.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
// @Getter
// @Setter
@ToString

@Document(collection = "Book")
public class Book {
    private int id;
    private String bookName;
    private String authorName;
}
