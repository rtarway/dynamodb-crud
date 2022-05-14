package com.example.dynamodbcrud.api.model.request;

import lombok.Data;

@Data
public class AuthorCreationRequest {
	
    private String firstName;
    private String lastName;

}


