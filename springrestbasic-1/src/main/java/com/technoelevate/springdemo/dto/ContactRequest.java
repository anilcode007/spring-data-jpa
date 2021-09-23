package com.technoelevate.springdemo.dto;

import com.technoelevate.springdemo.entity.Contact;

public class ContactRequest {
	
	
	private Contact contact;

	public ContactRequest(Contact contact) {
		super();
		this.contact = contact;
	}

	public ContactRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "ContactRequest [contact=" + contact + "]";
	}
	

}
