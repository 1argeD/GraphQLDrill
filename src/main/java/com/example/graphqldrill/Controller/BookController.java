package com.example.graphqldrill.Controller;

import com.example.graphqldrill.MutationResolver.BookMutationResolver;
import com.example.graphqldrill.Schema.Book;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@AllArgsConstructor
public class BookController {
    private final BookMutationResolver bookMutationResolver;

    @PostMapping("/book")
    ResponseEntity<?> createBook(@RequestBody Book book){
        return ResponseEntity.ok().body(bookMutationResolver.createBook(book));
    }

    @DeleteMapping("/delete")
    ResponseEntity<?> deleteBook(@RequestBody Book book) {
        return ResponseEntity.ok().body(bookMutationResolver.deleteBookId(book.getBookId()));
    }
}
