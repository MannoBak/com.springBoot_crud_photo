package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.persistence.Id;

public interface ProductRepository extends JpaRepository<Id, Object>{

}
