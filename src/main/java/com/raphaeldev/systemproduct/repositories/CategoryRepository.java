package com.raphaeldev.systemproduct.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raphaeldev.systemproduct.entities.Category;

import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public interface CategoryRepository extends JpaRepository <Category,Long>{ //registrar como componente do Spring

}
