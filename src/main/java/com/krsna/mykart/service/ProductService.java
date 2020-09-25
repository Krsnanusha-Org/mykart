package com.krsna.mykart.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.krsna.mykart.model.Category;
import com.krsna.mykart.model.Product;
import com.krsna.mykart.model.User;

public interface ProductService {

	
	Page<Product> getAllProducts(Pageable page);
	
	Page<Product> getAllProducts(Category category, Pageable page);
	
    Optional<Product> getProductById(Long id);

    Product createProduct(String name, String currency, double price, User user);

    void updateProduct(Product product, String name, String currency, double price);

    void deleteProduct(Product product);

    boolean hasCategory(Product product, Category category);

    void addCategory(Product product, Category category);

    void removeCategory(Product product, Category category);

    boolean hasProductsAssociated(Category category);


}
