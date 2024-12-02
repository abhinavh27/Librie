package com.abhinav.librie.repository;

import com.abhinav.librie.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Long> {

    List<Book> findAllByGenre(String genre);
    List<Book> findAllByBookTitle(String title);
}
