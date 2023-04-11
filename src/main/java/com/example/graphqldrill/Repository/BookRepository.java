package com.example.graphqldrill.Repository;


import com.example.graphqldrill.Schema.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {

    Optional<Object> findById(String bookSn);
    Book findByBookId(String bookId);
}
