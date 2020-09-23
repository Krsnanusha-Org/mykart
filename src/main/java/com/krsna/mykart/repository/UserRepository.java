package com.krsna.mykart.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.krsna.mykart.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

}
