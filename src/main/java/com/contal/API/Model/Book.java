package com.contal.API.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Book {

    @Id
    private String isbn;

    private String title;

    private String author;

    private boolean isAvailable;
}
