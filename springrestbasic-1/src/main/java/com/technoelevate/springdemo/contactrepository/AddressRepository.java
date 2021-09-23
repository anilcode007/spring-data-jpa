package com.technoelevate.springdemo.contactrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.technoelevate.springdemo.entity.Address;

public interface AddressRepository extends JpaRepository<Address,Integer> {

}
