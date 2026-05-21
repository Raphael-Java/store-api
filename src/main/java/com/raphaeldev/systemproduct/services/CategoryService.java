package com.raphaeldev.systemproduct.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raphaeldev.systemproduct.entities.Category;
import com.raphaeldev.systemproduct.repositories.CategoryRepository;

@Service
public class CategoryService  {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
