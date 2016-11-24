package com.testbank.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.testbank.model.Employee;
import com.testbank.model.Transaction;
import com.testbank.service.TransactionService;


@Controller
public class TransactionController {
	
	
	@Autowired
	TransactionService transactionService;
	
	@RequestMapping("/deposit")
	public String addDeposit(@Valid @ModelAttribute("transaction") Transaction transaction, HttpServletRequest request, @ModelAttribute("employee") Employee employee, BindingResult result)
	{
		if(!EmployeeController.loginCheck(request))
			return "Login";
		return "Deposit";
	}
	
	@RequestMapping(value="/withdraw",method=RequestMethod.GET)
	public String addWithdraw(@Valid @ModelAttribute("transaction") Transaction transaction, HttpServletRequest request, @ModelAttribute("employee") Employee employee, BindingResult result)
	{
		if(!EmployeeController.loginCheck(request))
			return "Login";
		return "Withdraw";
	}
	
	@RequestMapping(value="/balanceEnquiry",method=RequestMethod.GET)
	public  String addBalance(@Valid @ModelAttribute("transaction") Transaction transaction, HttpServletRequest request, @ModelAttribute("employee") Employee employee, BindingResult result)
	{
		if(!EmployeeController.loginCheck(request))
			return "Login";
		return "BalanceEnquiry";
	}
	
	@RequestMapping("/report")
	public String Report(@Valid @ModelAttribute("transaction") Transaction transaction, HttpServletRequest request, @ModelAttribute("employee") Employee employee, BindingResult result)
	{
		if(!EmployeeController.loginCheck(request))
			return "Login";
		return "Report";
	}
	
	@RequestMapping("/reportShow")
	public String ReportShow(@Valid @ModelAttribute("transaction") Transaction transaction,HttpServletRequest request, @ModelAttribute("employee") Employee employee, Model model, BindingResult result)
	{
		
		//int pages = 1;
		//int recordsPerPage = 5;
		//if((page) != null){
			//pages = Integer.parseInt(page);
		//}
		
		if(!EmployeeController.loginCheck(request))
			return "Login";
		
		List<Transaction> reportList=transactionService.generateStatement(transaction.getAccountId());
		if(reportList.isEmpty()){
			model.addAttribute("authenticationMessage", "Invalid Account ID");
			return "Report";
		}
		//int noOfRecords = reportList.size();//dao.getNoOfRecords();
		//int noOfPages = (int) Math.ceil(noOfRecords * 1.0 / recordsPerPage);
		model.addAttribute("reportList",reportList);
		//model.addAttribute("noOfPages", noOfPages);
		//model.addAttribute("currentPage", pages);
		return "ReportShow";
		
	
	}
	
	@RequestMapping(value="/balanceEnquiryRequest",method=RequestMethod.GET)
	
	public  String addBalance(@Valid @ModelAttribute("transaction") Transaction transaction, HttpServletRequest request, @ModelAttribute("employee") Employee employee, Model model, BindingResult result)
	{
		if(!EmployeeController.loginCheck(request))
			return "Login";
		long balance=transactionService.balanceEnquiry(transaction.getAccountId());
		if(balance<0){
			model.addAttribute("authenticationMessage", "Invalid Account ID");
			return "BalanceEnquiry";
		}
		model.addAttribute("balance","Balance is "+balance);
		return "BalanceEnquiry";
	}
	
	@RequestMapping(value="/depositRequest",method=RequestMethod.GET)
	public String Deposit(@Valid @ModelAttribute("transaction") Transaction transaction,Model model,@ModelAttribute("employee") Employee employee, HttpServletRequest request, BindingResult result)
	{
		if(!EmployeeController.loginCheck(request))
			return "Login";
		long balance=transactionService.deposit(transaction.getAccountId(),transaction.getAmount());
		if(balance<0){
			model.addAttribute("authenticationMessage", "Invalid Account ID");
			return "Deposit";
		}
		model.addAttribute("balance","Final balance is "+balance);
		return "Deposit";
	}
	
	@RequestMapping(value="/withdrawRequest",method=RequestMethod.GET)
	public String Withdraw(@Valid @ModelAttribute("transaction") Transaction transaction,Model model, @ModelAttribute("employee") Employee employee, HttpServletRequest request, BindingResult result)
	{
		if(!EmployeeController.loginCheck(request))
			return "Login";
		long balance=transactionService.withdraw(transaction.getAccountId(),transaction.getAmount());
		if(balance==-1){
			model.addAttribute("authenticationMessage", "Invalid Account ID");
			return "Withdraw";
		}
		if(balance==-10){
			model.addAttribute("authenticationMessage", "Insufficient Balance");
			return "Withdraw";
		}
		model.addAttribute("balance","Final balance is "+balance);
		return "Withdraw";
	}
	
}

