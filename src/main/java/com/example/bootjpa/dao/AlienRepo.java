package com.example.bootjpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.bootjpa.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer> {

}
