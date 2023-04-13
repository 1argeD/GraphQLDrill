//package com.example.graphqldrill.Resolver;
//
//import com.example.graphqldrill.Schema.BookDto;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//
//@RequiredArgsConstructor
//@Component
//@Transactional(readOnly = true)
//public class BookQueryResolver {
//
//    public BookDto bookDto() {
//        int seq = 1;
//        String title = "제발 좀 되라";
//        String author = "나";
//
//        return new BookDto((long) seq, title, author);
//    }
//}
