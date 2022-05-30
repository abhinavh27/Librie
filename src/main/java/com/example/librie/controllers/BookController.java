package com.example.librie.controllers;

import com.example.librie.models.Book;
import com.example.librie.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping("/books")
    private List<Book> getBooks(){
        return bookService.getBooks();
    }

    @PostMapping("/books")
        public Book addBook(@RequestBody Book book){
            return bookService.addBook(book);
        }
}
