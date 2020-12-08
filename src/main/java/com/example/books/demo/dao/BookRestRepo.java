package com.example.books.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.books.demo.model.Book;

public interface BookRestRepo extends JpaRepository<Book, Integer>{

}
