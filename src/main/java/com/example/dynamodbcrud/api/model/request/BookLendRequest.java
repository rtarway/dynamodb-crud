package com.example.dynamodbcrud.api.model.request;

import java.util.List;

import lombok.Data;

@Data
public class BookLendRequest {

	/*
	 * public List<String> getBookIds() { return bookIds; } public void
	 * setBookIds(List<String> bookIds) { this.bookIds = bookIds; } public String
	 * getMemberId() { return memberId; } public void setMemberId(String memberId) {
	 * this.memberId = memberId; }
	 */
	
	private List<String> bookIds;
    private String memberId;
	
	
}
