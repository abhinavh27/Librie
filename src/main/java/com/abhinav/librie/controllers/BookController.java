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

    @GetMapping("/allBooks")
    private List<Book> getBooks() {
        return bookService.getBooks();
    }

    @GetMapping("/booksByGenre")
    private List<Book> getBooksByGenre(
            @RequestParam String genre
    ){
        return bookService.getBooksByGenre(genre);
    }

    @GetMapping("/{title}")
    public List<Book> getBookByTitle(
            @PathVariable String title
    ){
        return bookService.getBooksByTitle(title);
    }

    @PostMapping("/addBook")
    public Book addBook(
            @RequestBody Book book
    ) throws Exception {
        return bookService.addBook(book);
    }
}
