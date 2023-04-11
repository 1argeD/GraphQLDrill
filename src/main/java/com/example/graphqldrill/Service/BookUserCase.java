package com.example.graphqldrill.Service;

import com.example.graphqldrill.Schema.BookDetails;
import graphql.ExecutionResult;
import org.springframework.stereotype.Service;

@Service
public class BookUserCase {
    private final BookDetails bookDetails;

    public BookUserCase(BookDetails bookDetails) {
        this.bookDetails = bookDetails;
    }

    public ExecutionResult executionResult(String query) {
        return bookDetails.execute(query);
    }
}
