package com.testbank.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.testbank.model.Employee;
import com.testbank.service.EmployeeService;

@Controller
@Scope("session")
public class EmployeeController {

	static boolean loginCheck(HttpServletRequest request){
		System.out.println("Inside Check");
		if(request.getSession().getAttribute("loginStatus") == null)
			return false;
		if(request.getSession().getAttribute("loginStatus").equals("loggedIn"))
			return true;
		return false;
	}
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value="/useraccount")
	public String Home(@Valid @ModelAttribute("employee") Employee employee, BindingResult result, HttpServletRequest request)	{
		if(!loginCheck(request))
			return "Login";
		return "UserAccount";
	}
	
	@RequestMapping(value="/index")
	public String FirstPage()
	{
		return "index";
	}
	
	@RequestMapping(value="/login")
	public String loginDirect(@Valid @ModelAttribute("employee") Employee employee, BindingResult result)
	{
		
		return "Login";
	}
	
	@RequestMapping(value="/logout")
	public String logout(HttpSession session,HttpServletRequest request)
	{
		System.out.println(request.getSession().getAttribute("loginStatus"));
		request.getSession().setAttribute("loginStatus", "loggedOut");
		System.out.println(request.getSession().getAttribute("loginStatus"));
		return "index";
	}
	
	@RequestMapping(value="/loginRedirect")
	public String loginAuthenticate(@Valid @ModelAttribute("employee") Employee employee,HttpServletRequest request, Model model, BindingResult result)
	{
		String name = employeeService.authenticate(employee.getUsername(),employee.getPassword());
		if(name==null || result.hasErrors())
		{
			model.addAttribute("authenticationMessage","Invalid Username or Password");
			return "Login";
		}
	
		//session.setAttribute("name", name);
		/* SESSION */
		request.getSession().setAttribute("loginStatus", "loggedIn");
		model.addAttribute("employeeName",name);
		return "UserAccount";
	}
	
	@RequestMapping(value="/EmployeeSignup")
	public String employeeSignUp(@Valid @ModelAttribute("employee") Employee employee, BindingResult result)
	{
		return "EmployeeSignup";
	}
	
	@RequestMapping(value="/EmployeeRegister")
	public String employeeRegister(@Valid @ModelAttribute("employee") Employee employee, Model model, BindingResult result)
	{
		if(result.hasErrors())
		{
			model.addAttribute("employeeSignupError","Invalid details");
			return "EmployeeSignup";
		}
		long empId= employeeService.createEmployee(employee);
		model.addAttribute("employeeId","GENERATED EMPLOYEE ID: "+empId);
		return "index";
	}
	
	
}
