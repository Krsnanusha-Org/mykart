package com.krsna.mykart.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.krsna.mykart.model.MyKartUser;
import com.krsna.mykart.model.User;
import com.krsna.mykart.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	Logger logger = LoggerFactory.getLogger(UserDetailsService.class);

	@Autowired
	UserRepository userRepository;

	@Transactional(readOnly = true)
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		logger.info("UserDetailsServiceImpl.loadUserByUsername()");
		User user = userRepository.findByUsername(username);
		if (user == null) {
			logger.info("User Not Found.....");
			throw new UsernameNotFoundException("User not found.");
		}

		logger.info("loadUserByUsername() : {}", username);

		return new MyKartUser(user);
	}

}
