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

    public Book getBookBySn(final String bookSn) {
    return (Book) this.repository
            .findById(bookSn)
            .orElse(null);
    }
}
