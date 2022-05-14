package com.example.dynamodbcrud.api.repository;
import com.example.dynamodbcrud.api.model.Author;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface AuthorRepository extends CrudRepository<Author, String> {
}
