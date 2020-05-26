package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Operation;

public interface OperationRepository 
extends JpaRepository<Operation,Long> {

}
