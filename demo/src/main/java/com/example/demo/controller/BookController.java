package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jmx.MBeanServerNotFoundException;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Book;
import com.example.demo.repo.BookRepository;

@RestController
@RequestMapping("/api/books")
public class BookController {
    @Autowired
    private BookRepository bookRepository;
 
    @GetMapping("/")
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
 
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookRepository.findById(id).orElseThrow(() -> new MBeanServerNotFoundException("Book not found"));
    }
 
    @PostMapping("/")
    public Book createBook(@Validated @RequestBody Book book) {
        return bookRepository.save(book);
    }
 
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @Validated @RequestBody Book bookDetails) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new MBeanServerNotFoundException("Book not found"));
 
        book.setTitle(bookDetails.getTitle());
        book.setAuthor(bookDetails.getAuthor());
        book.setIsbn(bookDetails.getIsbn());
 
        return bookRepository.save(book);
    }
 
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable Long id) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new MBeanServerNotFoundException("Book not found"));
 
        bookRepository.delete(book);
 
        return ResponseEntity.ok().build();
    }
}
