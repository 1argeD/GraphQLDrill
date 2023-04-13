package com.example.graphqldrill.Schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "BookDto")
public class BookDto {
    @Id
    private Long id;
    private String title;
    private String author;

}
