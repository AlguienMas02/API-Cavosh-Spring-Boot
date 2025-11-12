package com.example.cavosh.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cavosh.Models.Productos;

public interface ProductosRepository extends JpaRepository<Productos , Long> {

    
} 
