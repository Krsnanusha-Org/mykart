package com.krsna.mykart.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.krsna.mykart.model.Category;
import com.krsna.mykart.model.Product;
import com.krsna.mykart.model.User;

public class ProductServiceImpl implements ProductService {

	@Override
	public Page<Product> getAllProducts(Pageable page) {
		return null;
	}

	@Override
	public Page<Product> getAllProducts(Category category, Pageable page) {
		return null;
	}

	@Override
	public Optional<Product> getProductById(Long id) {
		return null;
	}

	@Override
	public Product createProduct(String name, String currency, double price, User user) {
		return null;
	}

	@Override
	public void updateProduct(Product product, String name, String currency, double price) {
		
	}

	@Override
	public void deleteProduct(Product product) {
		
	}

	@Override
	public boolean hasCategory(Product product, Category category) {
		return false;
	}

	@Override
	public void addCategory(Product product, Category category) {
		
	}

	@Override
	public void removeCategory(Product product, Category category) {
		
	}

	@Override
	public boolean hasProductsAssociated(Category category) {
		return false;
	}

}
