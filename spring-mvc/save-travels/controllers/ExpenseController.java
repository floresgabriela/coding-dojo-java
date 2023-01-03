package com.nightcrew.travels.controllers;

import java.util.List;

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

import com.nightcrew.travels.models.Expense;
import com.nightcrew.travels.services.ExpenseService;

@Controller
public class ExpenseController {

		@Autowired
		private ExpenseService expenseService;
		
		@GetMapping("/") // display index
		public String index(@ModelAttribute("expense") Expense expense, Model model) {
			List<Expense> expenses = expenseService.allExpenses();
			model.addAttribute("expenses", expenses);
			return "index.jsp";
		}
	
		@PostMapping("/add")
		public String add(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
			if(result.hasErrors()) {
				return "index.jsp";
			}
			expenseService.addExpense(expense);
			return "redirect:/";
		}
		
		@GetMapping("/expenses/{id}") //display edit page
		public String editExpense(@PathVariable("id")Long id, Model model) {
			Expense expense = expenseService.oneExpense(id);
			model.addAttribute("expense", expense);
			return "edit.jsp";
		}
		
		@PutMapping("/edit/{id}")
		public String processEdit(@Valid @ModelAttribute("expense") Expense expense, BindingResult result) {
			if(result.hasErrors()) {
				return "edit.jsp";
			}
			expenseService.updateExpense(expense);
			return "redirect:/";
		}
		
		// delete
		@DeleteMapping("/expense/delete/{id}")
		public String delete(@PathVariable("id") Long id) {
			expenseService.deleteExpense(id);
			return "redirect:/";
		}
		
		// show
		@GetMapping("/expense/{id}")
		public String showExpense(@PathVariable("id")Long id, Model model) {
			Expense expense = expenseService.oneExpense(id);
			model.addAttribute("expense", expense);
			return "show.jsp";
		}
}
