package com.demo.demo.repository;

import com.example.demo.demo.model.Book;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer> {
    
}
