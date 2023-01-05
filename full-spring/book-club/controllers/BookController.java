package com.nightcrew.auth.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.nightcrew.auth.models.Book;
import com.nightcrew.auth.models.User;
import com.nightcrew.auth.services.BookService;
import com.nightcrew.auth.services.UserService;

@Controller
public class BookController {
	@Autowired
	private BookService bookService;
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/books")
    public String home(HttpSession session, Model model) {
    	if(session.getAttribute("userId") == null) {
    		return "redirect:/";
    	}
    	User loggedInUser = userService.oneUser((Long) session.getAttribute("userId"));
    	model.addAttribute("bookList", bookService.allBooks());
    	model.addAttribute("user", loggedInUser);
    	return "index.jsp";
    }
	
	//create display
	@GetMapping("/books/new")
	public String displayNewForm(@ModelAttribute("newBook") Book newBook, HttpSession session) {
		if(session.getAttribute("userId") == null) {
    		return "redirect:/";
    	}
		return "new.jsp";
	}
	
	//create process
	@PostMapping("/addBook")
	public String addBook(@Valid @ModelAttribute("newBook") Book newBook, 
			BindingResult result, Model model, HttpSession session) {
		if(session.getAttribute("userId") == null) {
    		return "redirect:/";
    	}
		if(result.hasErrors()) {
			return "new.jsp";
		} else {
			bookService.createBook(newBook);
			return "redirect:/books";
		}
	}
	
	//edit donation : get id, get book from service, form
	//edit display
	@GetMapping("/books/edit/{id}")
	public String displayEditForm(@PathVariable("id") Long id, Model model, HttpSession session) {
		if(session.getAttribute("userId") == null) {
    		return "redirect:/";
    	}
		
		Long bookId = bookService.oneBook(id).getUser().getId();
        if(!session.getAttribute("userId").equals(bookId)){
            return "redirect:/books";
        }
        model.addAttribute("book", bookService.oneBook(id));
        
		Book foundBook = bookService.oneBook(id);
		model.addAttribute("foundBook", foundBook);
		return "edit.jsp";
	}
	
	//edit process
	//model attribute first, binding result second
	@PutMapping("/books/edit/{id}")
	public String editBook(@Valid @ModelAttribute("foundBook")Book foundBook, BindingResult result, @PathVariable("id") Long id, 
			HttpSession session, Model model) {
		if(session.getAttribute("userId") == null) {
    		return "redirect:/";
    	}
		if(result.hasErrors()) {
			return "edit.jsp";
		} else {
			bookService.editBook(foundBook);
			return "redirect:/books";
		}
	}
	
	//delete
	@DeleteMapping("books/delete/{id}")
	public String delete(@PathVariable("id") Long id, HttpSession session) {
		if(session.getAttribute("userId") == null) {
    		return "redirect:/";
    	}
		bookService.deleteBook(id);
		return "redirect:/books";
	}
	
	//details
	@GetMapping("/books/{id}")
	public String displayBook(@PathVariable("id") Long id, Model model, HttpSession session) {
		if(session.getAttribute("userId") == null) {
    		return "redirect:/";
    	}
        
		Book book = bookService.oneBook(id);
		model.addAttribute("book", book);
		model.addAttribute("user", book.getUser());
		return "show.jsp";
	}
}
