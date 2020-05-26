package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Compte;

public interface CompteRepository 
extends JpaRepository<Compte,String> {

}
