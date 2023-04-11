package com.example.graphqldrill.Schema;

import lombok.*;

import javax.persistence.*;



@Setter
@Table(name="Book")
@Entity
@Getter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long bookId;

    private String name;

    public Book(Long bookId, String name) {
        this.bookId = bookId;
        this.name = name;
    }

    public Book() {

    }
}
