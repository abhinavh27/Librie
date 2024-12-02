package com.abhinav.librie.repository;

import com.abhinav.librie.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
