package com.krsna.mykart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krsna.mykart.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
