package com.example.graphqldrill.Schema;

import graphql.ExecutionResult;


public interface BookDetails {

    ExecutionResult execute(String query);

//    List<Book> findAll();
//    Book findByBookId(String bookId);


}
