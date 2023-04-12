package com.example.graphqldrill.Resolver;

import com.example.graphqldrill.Repository.BookRepository;
import com.example.graphqldrill.Schema.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Component
@Transactional(readOnly = true)
public class BookQueryResolver {

    private final BookRepository repository;

    public Book getBookById(final Long bookId) {
    if (bookId<=0) return null;

    return (Book) this.repository
            .findByBookId(bookId)
            .orElse(null);
    }
}
