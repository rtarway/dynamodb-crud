package com.example.dynamodbcrud.api.repository;


import org.socialsignin.spring.data.dynamodb.repository.EnableScan;

import com.example.dynamodbcrud.api.model.Book;
import com.example.dynamodbcrud.api.model.Lend;
import com.example.dynamodbcrud.api.model.LendStatus;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

@EnableScan
public interface LendRepository extends CrudRepository<Lend, String> {

	//Optional<Lend> findByBookAndStatus(Book book, LendStatus borrowed);
      Optional<Lend> findByBookIdAndStatus(String bookId, LendStatus status);
}