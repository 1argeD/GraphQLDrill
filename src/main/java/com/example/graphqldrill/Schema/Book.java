package com.example.graphqldrill.Schema;

import lombok.*;

import javax.persistence.*;



@NoArgsConstructor
@AllArgsConstructor
@Table(name="Book")
@Entity
@Getter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id", nullable = false)
    private Long bookId;

    @Column(name = "book_author", nullable = false, length = 100)
    private String bookAuthor;

    @Column(name = "book_title", nullable = false)
    private String bookTitle;

}
