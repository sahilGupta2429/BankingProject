package com.testbank.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.testbank.model.Customer;
import com.testbank.model.Employee;
import com.testbank.service.CustomerService;
import com.testbank.service.EmployeeService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private EmployeeService employeeService;
	
	/*
	private boolean checkSession(HttpServletRequest request){
		HttpSession session=request.getSession(false);
		System.out.println("Test Check Session : "+ session);
        if(session!=null)
        	return true;
        else
        	return false;
	}
	*/
	
	
	@RequestMapping("/newUser")
	public String addCustomer(@Valid @ModelAttribute("customer") Customer customer, @ModelAttribute("employee") Employee employee, Model model, BindingResult result, HttpServletRequest request) 
	{
		if(!EmployeeController.loginCheck(request))
			return "Login";
		long empId = employeeService.usernameToId();
		customer.setGeneratorId(empId);
		model.addAttribute("genid", empId);
		return "CreateUserAccount";
	}
	
	@RequestMapping(value= "/CustomerRegister")
	public String registerCustomer(@Valid @ModelAttribute("customer") Customer customer,Model model,@ModelAttribute("employee") Employee employee, BindingResult result, HttpServletRequest request)
	{
		if(!EmployeeController.loginCheck(request))
			return "Login";
		if(result.hasErrors())
		{
			model.addAttribute("authenticationMessage", "Invalid details");
			return "CreateUserAccount";
		}
		boolean checkIntroducer = customerService.validateAccount(customer.getIntroducerId());
		if(!checkIntroducer){
			model.addAttribute("authenticationMessage", "Invalid Introducer ID");
			return "CreateUserAccount";
		}
		
		long accId = customerService.createCustomer(customer);
		model.addAttribute("accId","Generated Acccount Id is : "+accId);
		return "UserAccount";
	}
	
	
}