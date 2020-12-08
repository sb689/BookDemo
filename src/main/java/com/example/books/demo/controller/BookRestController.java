package com.example.books.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.books.demo.dao.BookRepo;
import com.example.books.demo.dao.BookRestRepo;
import com.example.books.demo.model.Book;


// Rest API implementation

@RestController
@RequestMapping("books")
public class BookRestController {
	
	@Autowired
	BookRestRepo repo;
	
	@GetMapping(produces= {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public List<Book> restGetBooks()
	{
		return repo.findAll();
		
	}
	
	@GetMapping(path = "/{bookid}", produces= {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public Optional<Book> restGetBookById(@PathVariable int bookid )
	{
		
		return repo.findById(bookid);
		
	}
	
	@PostMapping(produces= {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
			consumes= {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public Book restCreateBook(@RequestBody Book newBook )
	{
		repo.save(newBook);
		return newBook;
		
	}
	
	@DeleteMapping(path = "/{bookid}", produces= {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<Object> restDeleteBookById(@PathVariable int bookid )
	{
		if(repo.existsById(bookid))
		{
		repo.deleteById(bookid);
		return new ResponseEntity<>(HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	@PutMapping( produces= {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
			consumes= {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	
	public ResponseEntity<Book> restUpdateBook(@RequestBody Book book)
	{

		repo.save(book);
		return new ResponseEntity<>(HttpStatus.OK);
	
	}

}
