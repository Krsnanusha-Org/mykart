package com.krsna.mykart.model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MyKartUser implements UserDetails {

	private User user;

	public MyKartUser(User user) {
		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		 Set grantedAuthorities = new HashSet<>();
		    for (Role role : user.getRoles()){
		        grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
		    }
		    
//		return user.getRoles().stream().map(authority -> new SimpleGrantedAuthority(authority.getName().toString()))
//				.collect(Collectors.toList());
		    
		    return grantedAuthorities;
	}

	public Long getId() {
		return user.getId();

	}

	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	public User getUserDetails() {
		return user;
	}
}
