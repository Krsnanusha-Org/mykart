package com.krsna.mykart.service;

import java.util.List;
import java.util.Optional;

import com.krsna.mykart.model.Category;

public class CategoryServiceImpl implements CategoryService {

	@Override
	public List<Category> getAllCategories() {
		return null;
	}

	@Override
	public Optional<Category> getCategoryById(Long id) {
		return null;
	}

	@Override
	public Category createCategory(String name) {
		return null;
	}

	@Override
	public void updateCategory(Category category, String name) {
		
	}

	@Override
	public void deleteCategory(Category category) {
		
	}

	@Override
	public boolean isChildCategory(Category child, Category parent) {
		return false;
	}

	@Override
	public void addChildCategory(Category child, Category parent) {
		
	}

	@Override
	public void removeChildCategory(Category child, Category parent) {
		
	}

}
