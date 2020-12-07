package com.example.books.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.books.demo.model.*;

public interface BookRepo extends CrudRepository<Book, Integer>{
	
	List<Book> findByAuthor(String author);
	
	@Query("from Book where author=?1 order by title")
	List<Book> findByAuthorSorted(String author);
}
