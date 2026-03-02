package com.capgemini.Employee_2nd.march;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;



@Service
public class EmployeeService {

	EmployeeJpaRepository jpa;

	public EmployeeService(EmployeeJpaRepository jpa) {
		this.jpa = jpa;
	}

	public String createEmployee(Employee e, Model m) {
		Optional<Employee> optional = jpa.findById(e.getEmail());

		//ModelAndView m = new ModelAndView();
	
		if (optional.isPresent()) {
			m.addAttribute("msg", e.getName());
			//m.setViewName("exist");
			return "exist";
		} else {
			m.addAttribute("msg", e.getName());
			//m.setViewName("successfull");
			Employee employee = jpa.save(e);
			return "successfull";
		}
	}
	
	public ModelAndView login(String email, String password) {
		Employee e = jpa.findByEmailAndPassword(email,password);
		ModelAndView m = new ModelAndView();
		if(e.getRole().equalsIgnoreCase("admin")) {
			List<Employee> emp = jpa.findAll();
			m.addObject("msg",emp);
			m.setViewName("admin");
			return m;
			
		} else {
			m.addObject("msg",e);
			m.setViewName("userdetails");
			return m;
		}
	}
	
	
	public ModelAndView deleteEmployee(String email) {

	    jpa.deleteById(email);

	    ModelAndView m = new ModelAndView();

	    // Get remaining employees
	    m.addObject("msg", jpa.findAll());
	    m.setViewName("admin");

	    return m;
	}
	
	
	public Employee getEmployeeByEmail(String email) {
	    return jpa.findById(email).orElse(null);
	}
	
	
	public ModelAndView updateEmployee(Employee e) {

	    jpa.save(e);  // save() updates if ID already exists

	    ModelAndView m = new ModelAndView();

	    m.addObject("msg", jpa.findAll());
	    m.setViewName("admin");

	    return m;
	}

}
