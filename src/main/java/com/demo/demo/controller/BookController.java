package com.demo.demo.controller;

import java.util.List;
import java.util.Optional;

import com.demo.demo.repository.BookRepository;
import com.example.demo.demo.model.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/saveBook")
    public String saveBook(@RequestBody Book book) {
        bookRepository.save(book);
        return "Saved with id" + book.toString();
    }

    @GetMapping("/getBooks")
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @GetMapping("/getById/{id}")
    public Optional<Book> getBookById(@PathVariable int id) {
        return bookRepository.findById(id);
    }
}
