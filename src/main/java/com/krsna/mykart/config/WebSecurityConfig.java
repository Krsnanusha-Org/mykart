package com.krsna.mykart.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/resources/**");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests().antMatchers("/").permitAll().antMatchers("/welcome").hasAnyRole("USER", "ADMIN")
//		.antMatchers("/getEmployees").hasAnyRole("USER", "ADMIN").antMatchers("/addNewEmployee")
//		.hasAnyRole("ADMIN").anyRequest().authenticated()
//		.and().formLogin().loginPage("/login").permitAll()
//		.and().logout().permitAll();
//		
		
		 http.authorizeRequests().antMatchers("/").permitAll()
		 .anyRequest().authenticated()
		 .and().formLogin().loginPage("/login").permitAll().defaultSuccessUrl("/index", true)
		 .and().logout().permitAll();
		
	}

}
