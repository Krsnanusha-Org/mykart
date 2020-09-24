package com.krsna.mykart;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.krsna.mykart.model.Gender;
import com.krsna.mykart.model.Role;
import com.krsna.mykart.model.User;
import com.krsna.mykart.model.UserProfile;
import com.krsna.mykart.repository.RoleRepository;
import com.krsna.mykart.repository.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.krsna.mykart.*")
public class MyKartApplication implements ApplicationRunner {

	
	Logger logger = org.slf4j.LoggerFactory.getLogger(MyKartApplication.class);
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	RoleRepository roleRepository;

	public static void main(String[] args) {
		SpringApplication.run(MyKartApplication.class, args);
		
		
	}
	
//	 @Override
//	 public void run(String... arg0) throws Exception {
//	    System.out.println("Hello world from Command Line Runner");
//      	
//	 }

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Role adminRole = new Role();
		adminRole.setName("ROLE_ADMIN");
		if(!roleRepository.existsById(1l))
		roleRepository.save(adminRole);
		
		Role userRole = new Role();
		userRole.setName("ROLE_USER");
		if(!roleRepository.existsById(2l))
		roleRepository.save(userRole);
		
		

		User user = new User();
		user.setUsername("admin");
		user.setPassword(bCryptPasswordEncoder.encode("admin"));
		user.setPasswordConfirm("admin");
		
		Set<Role> userRoles = new HashSet<Role>();
		userRoles.add(adminRole);
		
		user.setRoles(userRoles);
		
		
		UserProfile up = new UserProfile();
		up.setAddress("USA");
		up.setGender(Gender.MALE);
		up.setPhoneNumber("9885773990");
		user.setUserProfile(up);
		
		if(!userRepository.existsById(1l))
		userRepository.save(user);
		
		
		
	}

}
