package com.example.springapidemo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/books")

public class BookController {
    private List<Book> books = new ArrayList<>();

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Book> getAllBooks() {
        return books;
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        book.setId(books.size() + 1);
        books.add(book);
        return book;
    }

}
