package com.example.dynamodbcrud.api.model.request;

import lombok.Data;

@Data
public class MemberCreationRequest {
	
	/*
	 * public String getFirstName() { return firstName; } public void
	 * setFirstName(String firstName) { this.firstName = firstName; } public String
	 * getLastName() { return lastName; } public void setLastName(String lastName) {
	 * this.lastName = lastName; }
	 */
	private String firstName;
    private String lastName;


}
