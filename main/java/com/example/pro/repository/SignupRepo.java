package com.example.pro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pro.model.Signup;

public interface SignupRepo extends JpaRepository<Signup,Integer>{
    
}
