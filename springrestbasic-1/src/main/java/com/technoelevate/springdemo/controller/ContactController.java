package com.technoelevate.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.technoelevate.springdemo.contactrepository.AddressRepository;
import com.technoelevate.springdemo.contactrepository.ContactRepository;
import com.technoelevate.springdemo.dto.ContactRequest;
import com.technoelevate.springdemo.entity.Contact;

@RestController
public class ContactController {

	@Autowired
	private ContactRepository contactRepository;

	@Autowired
	private AddressRepository addressRepository;

	@PostMapping("/contact")
	public Contact addcon(@RequestBody ContactRequest request) {
		return contactRepository.save(request.getContact());

	}
	
	@GetMapping("/findAllContacts")
	public List<Contact> findAllContacts(){
		return contactRepository.findAll();
		
	}
}
