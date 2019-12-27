package com.ggoreb.basic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ggoreb.basic.model.Product;

// @ Controller @Service @Repository @Component
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
	public Product findByName(String name);
	public List <Product> findAllByName(String name);
}