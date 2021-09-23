package com.technoelevate.springdemo.contactrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.technoelevate.springdemo.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact,Integer> {

}
