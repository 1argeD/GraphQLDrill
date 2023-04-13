package com.example.graphqldrill.MutationResolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.graphqldrill.Repository.BookRepository;
import com.example.graphqldrill.Schema.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Component
@Transactional(rollbackFor = Exception.class)
public class BookMutationResolver implements GraphQLMutationResolver {
    private final BookRepository repository;


    public Book createBook(Book book) {
        return this.repository.save(book);
    }

    public boolean deleteBookId(final Long bookId) {
        if(bookId<=0) return false;
        Book book = this.repository.findByBookId(bookId).orElse(null);
        if(book == null) return false;

        this.repository.deleteByBookId(bookId);
        return true;
    }
}
