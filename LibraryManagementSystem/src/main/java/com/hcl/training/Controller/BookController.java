/**
 * 
 */
package com.hcl.training.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.training.model.Book;
import com.hcl.training.service.BookServiceImpl;
//import com.hcl.training.service.BookServiceInterface;

//import antlr.collections.List;

/**
 * @author reddy-madhumitha
 *
 */

@RestController
public class BookController {
	@Autowired
	BookServiceImpl bookService;
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/fetchData/{categoryName}")
	public ResponseEntity<List<Book>> fetchData(@PathVariable("categoryName") String categoryName) {
		List<Book> book = new ArrayList<Book>();
		bookService.fetchData(categoryName).forEach(book::add);
		System.out.println(book);
		
		System.out.println(categoryName);
		int i=0;
		if(!book.isEmpty()) { 
			
			return new ResponseEntity<>(book,HttpStatus.OK);
		}
		return new ResponseEntity<>(book, HttpStatus.NO_CONTENT);
	}
}
