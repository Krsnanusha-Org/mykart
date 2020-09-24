package com.krsna.mykart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krsna.mykart.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByUsername(String username);

}
