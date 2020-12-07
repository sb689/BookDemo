package com.example.books.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.books.demo.dao.BookRepo;
import com.example.books.demo.model.Book;



@Controller
public class BookController {
	
	@Autowired
	BookRepo repo;
	
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	@RequestMapping("/addNewBook")
	public String addBoook(Book book)
	{
		repo.save(book);
		return "home.jsp";
	}
	
	@RequestMapping("/getBook")
	public ModelAndView getBook(@RequestParam int bookid)
	{
		ModelAndView mv = new ModelAndView("showBook.jsp");
		Book book =   repo.findById(bookid).orElse(new Book());
		mv.addObject(book);
		return mv;
	}
	
	@RequestMapping("/updateBook")
	public ModelAndView updateBook(@RequestParam int bookid,
			@RequestParam String title, @RequestParam String author)
	{
		ModelAndView mv = new ModelAndView("showBook.jsp");
		Book newBook = new Book(title, author);
		repo.save(newBook);
		if(repo.existsById(bookid))
		{
			repo.deleteById(bookid);
		}
		mv.addObject(newBook);
		return mv;
	}
	
	@RequestMapping("/deleteBook")
	public String deleteBook(@RequestParam int bookid)
	{
		repo.deleteById(bookid);
		return "home.jsp";
	}
	
	@RequestMapping("/findBooksByAuthor")
	public ModelAndView findBooksByAuthor(@RequestParam String author)
	{

		List<Book> booklist = repo.findByAuthorSorted(author);
		System.out.println("booklist size = "+ booklist.size());
		ModelAndView mv = new ModelAndView("showAllBook.jsp");
		mv.addObject("booklist", booklist);
		return mv;
	}
	
	@RequestMapping("/getAllBooks")
	public ModelAndView getAllBooks()
	{

		List<Book> booklist = (List<Book>) repo.findAll();
		System.out.println("booklist size = "+ booklist.size());
		ModelAndView mv = new ModelAndView("showAllBook.jsp");
		mv.addObject("booklist", booklist);
		return mv;
	}

}
