package com.capgemini.springsecuritydbconnection.controller;

import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springsecuritydbconnection.dto.AccountRequestDTO;
import com.capgemini.springsecuritydbconnection.dto.AccountResponseDTO;
import com.capgemini.springsecuritydbconnection.service.AccountService;

@RestController
public class AccountController {
	
	private AccountService service;
	
	public AccountController(AccountService service) {
		super();
		this.service = service;
	}
	
	@PostMapping("/public")
	public AccountResponseDTO create(@RequestBody AccountRequestDTO dto) {
		return service.createAccount(dto);
	}
	
	@GetMapping("/find-id/{id}")
	public AccountResponseDTO getById(@PathVariable long id) {
		return service.getById(id);
	}
	
	@GetMapping("/admin/all")
	public List<AccountResponseDTO> getAll(){
		return service.getAllAccount();
	}
	
	@GetMapping("/public/profile")
	public String profile(Authentication authentication) {
		return authentication.getName()+" "+authentication.getAuthorities();
	}
	
	//---delete by admin----
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable long id) {
		return service.deleteById(id);
	}
	
	
	

}
