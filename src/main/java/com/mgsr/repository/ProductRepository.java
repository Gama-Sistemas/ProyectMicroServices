package com.mgsr.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mgsr.entity.Category;
import com.mgsr.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	public List<Product> findByCategory(Category category);

}
