package com.krsna.mykart.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "tbl_user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_generator")
	@SequenceGenerator(name="user_generator", sequenceName = "user_seq", allocationSize=1)
    private Long id;
		
	private String username;
	private String password;
	private String passwordConfirm;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "tbl_user_role", 
	joinColumns = @JoinColumn(name = "user_id"), 
				  inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles;
	
	@OneToOne(cascade = CascadeType.ALL)
    private UserProfile userProfile;

	
	
	public Set<Role> getRoles() {
		return roles;
	}
	
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	public UserProfile getUserProfile() {
		return userProfile;
	}
	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Transient
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordConfirm() {
		return passwordConfirm;
	}
	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}
	
	
	
	

}
