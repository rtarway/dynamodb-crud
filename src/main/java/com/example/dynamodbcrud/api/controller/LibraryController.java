package com.example.dynamodbcrud.api.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dynamodbcrud.api.model.Author;
import com.example.dynamodbcrud.api.model.Book;
import com.example.dynamodbcrud.api.model.Member;
import com.example.dynamodbcrud.api.model.request.AuthorCreationRequest;
import com.example.dynamodbcrud.api.model.request.BookCreationRequest;
import com.example.dynamodbcrud.api.model.request.BookLendRequest;
import com.example.dynamodbcrud.api.model.request.MemberCreationRequest;
import com.example.dynamodbcrud.api.service.LibraryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/api/library")
@RequiredArgsConstructor
public class LibraryController {
	private final LibraryService libraryService;

	@GetMapping("/author")
    public ResponseEntity getAllAuthors() {
        
            return ResponseEntity.ok(libraryService.getAllAuthors());
        
        
    }
	
	
	@GetMapping("/book")
    public ResponseEntity readBooks(@RequestParam(required = false) String isbn) {
        if (isbn == null) {
            return ResponseEntity.ok(libraryService.readBooks());
        }
        return ResponseEntity.ok(libraryService.readBook(isbn));
    }
	
	   @GetMapping("/author/{authorId}")
	    public ResponseEntity<Author> getAuthorById (@PathVariable String authorId) {
	        return ResponseEntity.ok(libraryService.getAuthorById(authorId));
	    }
 
	    @PostMapping("/book")
	    public ResponseEntity<Book> createBook (@RequestBody BookCreationRequest request) {
	        return ResponseEntity.ok(libraryService.createBook(request));
	    }

	    @PatchMapping("/book/{bookId}")
	    public ResponseEntity<Book> updateBook (@PathVariable("bookId") String bookId, @RequestBody BookCreationRequest request) {
	        return ResponseEntity.ok(libraryService.updateBook(bookId, request));
	    }

	    @PostMapping("/author")
	    public ResponseEntity<Author> createAuthor (@RequestBody AuthorCreationRequest request) {
	        return ResponseEntity.ok(libraryService.createAuthor(request));
	    }

	    @DeleteMapping("/book/{bookId}")
	    public ResponseEntity<Void> deleteBook (@PathVariable String bookId) {
	        libraryService.deleteBook(bookId);
	        return ResponseEntity.ok().build();
	    }

	    @PostMapping("/member")
	    public ResponseEntity<Member> createMember (@RequestBody MemberCreationRequest request) {
	        return ResponseEntity.ok(libraryService.createMember(request));
	    }

	    @GetMapping("/member")
	    public ResponseEntity<List<Member>> readMembers () {
	        return ResponseEntity.ok(libraryService.readMembers());
	    }

	    @PatchMapping("/member/{memberId}")
	    public ResponseEntity<Member> updateMember (@RequestBody MemberCreationRequest request, @PathVariable String memberId) {
	        return ResponseEntity.ok(libraryService.updateMember(memberId, request));
	    }

	    @PostMapping("/book/lend")
	    public ResponseEntity<List<String>> lendABook(@RequestBody BookLendRequest bookLendRequests) {
	        return ResponseEntity.ok(libraryService.lendABook(bookLendRequests));
	    }


		@GetMapping("/book/{bookId}")
		public ResponseEntity<Book> readBook (@PathVariable String bookId) {
		    return ResponseEntity.ok(libraryService.readBookById(bookId));
		}
	
}
