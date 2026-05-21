package com.raphaeldev.systemproduct.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raphaeldev.systemproduct.entities.Product;

public interface ProductRepository extends JpaRepository <Product,Long>{ //registrar como componente do Spring

}
