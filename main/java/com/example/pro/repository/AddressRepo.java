package com.example.pro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pro.model.Address;

public interface AddressRepo extends JpaRepository<Address,Integer>{
    
}
