package com.capgemini.Employee_2nd.march.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.Employee_2nd.march.Employee;
import com.capgemini.Employee_2nd.march.EmployeeService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class EmployeeController {
	
	private EmployeeService service;
	
	
	public EmployeeController(EmployeeService service) {
		super();
		this.service = service;
	}

	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@PostMapping("/create")
	public String create(@ModelAttribute Employee e,Model m) {
		return service.createEmployee(e,m);
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/logincheck")
	public ModelAndView getDetails(HttpServletRequest request) {
		return service.login(request.getParameter("email"), request.getParameter("password"));
	}
	
	
	@GetMapping("/delete")
	public ModelAndView deleteEmployee(HttpServletRequest request) {

	    String email = request.getParameter("email");

	    return service.deleteEmployee(email);
	}
	
	
	@GetMapping("/update")
	public ModelAndView updatePage(HttpServletRequest request) {

	    String email = request.getParameter("email");

	    ModelAndView m = new ModelAndView();

	    Employee emp = service.getEmployeeByEmail(email);

	    m.addObject("employee", emp);
	    m.setViewName("update");

	    return m;
	}
	
	
	@PostMapping("/update-employee")
	public ModelAndView updateEmployee(@ModelAttribute Employee e) {

	    return service.updateEmployee(e);
	}

}
