package com.abhinav.librie.controllers;

import com.abhinav.librie.models.Book;
import com.abhinav.librie.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/books")
public class BookController {

    private final BookService bookService;

    @GetMapping("/")
    private List<Book> getBooks() {
        return bookService.getBooks();
    }

    @PostMapping("/addBook")
    public Book addBook(
            @RequestBody Book book
    ) throws Exception {
        return bookService.addBook(book);
    }
}
