package com.example.dynamodbcrud.api.repository;

import com.example.dynamodbcrud.api.model.Member;

import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, String> {
	
	
}
