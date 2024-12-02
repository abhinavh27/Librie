package com.abhinav.librie.service;

import com.abhinav.librie.models.Book;
import com.abhinav.librie.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public Book addBook(Book book) throws Exception {

        try {
            if (book.getAuthor() != null) {
                return bookRepository.save(book);
            } else throw new Exception();
        } catch (Exception e) {
            throw e;
        }
    }

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }
}
