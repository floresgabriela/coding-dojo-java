package com.nightcrew.travels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nightcrew.travels.models.Expense;
import com.nightcrew.travels.repositories.ExpenseRepository;

@Service
public class ExpenseService {

	@Autowired
	private ExpenseRepository expenseRepo;
	
	// get all expenses
	public List<Expense> allExpenses() {
		return expenseRepo.findAll();
	}
	
	// create
	public Expense addExpense(Expense newExpense) {
		return expenseRepo.save(newExpense);
	}
	
	// find one
	public Expense oneExpense(Long id) {
		Optional<Expense> optionalExpense = expenseRepo.findById(id);
		if(optionalExpense.isPresent()) {
			return optionalExpense.get();
		}
		else {
			return null;
		}
	}
	
	// update
	public Expense updateExpense(Expense foundExpense) {
		return expenseRepo.save(foundExpense);
	}
	
	//delete
	public void deleteExpense(Long id) {
		expenseRepo.deleteById(id);
	}
}
