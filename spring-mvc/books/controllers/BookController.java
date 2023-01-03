package com.nightcrew.mvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.nightcrew.mvc.models.Book;
import com.nightcrew.mvc.services.BookService;

@Controller
public class BookController {

	@Autowired
	BookService bookService;
	
	@GetMapping("/books")
    public String main(Model model) {
        List<Book> books = bookService.allBooks();
        model.addAttribute("books", books);
        return "index.jsp";
    }
	
//	@GetMapping("/books/{id}")
//	public String main(Model model, @PathVariable("id") Long id) {
//		
//		Book book = bookService.findBook(id);
//		model.addAttribute("book", book);
//		
//		return "index.jsp";
//	}
	
}
