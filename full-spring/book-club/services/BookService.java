package com.nightcrew.auth.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nightcrew.auth.models.Book;
import com.nightcrew.auth.repositories.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepo;
	
	//all
	public List<Book> allBooks() {
		return bookRepo.findAll();
	}
	
	//one
	public Book oneBook(Long id) {
		Optional<Book> optionalBook = bookRepo.findById(id);
		if(optionalBook.isPresent() ) {
			return optionalBook.get();
		} else {
			return null;
		}
	}
	
	//create
	public Book createBook(Book book) {
		return bookRepo.save(book);
	}
	
	//update
	public Book editBook(Book book) {
		return bookRepo.save(book);
	}
	//delete
	public void deleteBook(Long id) {
		bookRepo.deleteById(id);
	}
}
