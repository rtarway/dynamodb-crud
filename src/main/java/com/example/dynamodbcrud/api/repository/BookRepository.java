package com.example.dynamodbcrud.api.repository;


import com.example.dynamodbcrud.api.model.Book;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

@EnableScan
public interface BookRepository extends CrudRepository<Book, String> {
    Optional<Book> findByIsbn(String isbn);
}
