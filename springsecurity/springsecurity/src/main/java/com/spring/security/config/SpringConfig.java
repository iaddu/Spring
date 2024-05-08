package com.spring.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.RequestMatcher;

import com.spring.security.service.MyUserDetailService;

@Configuration
public class SpringConfig {
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	@Autowired
	public MyUserDetailService myUserDetailService;
	
	@Bean
	public AuthenticationProvider authenticationprovider() {
		DaoAuthenticationProvider provider =new DaoAuthenticationProvider();
		provider.setUserDetailsService(myUserDetailService);
		provider.setPasswordEncoder(passwordEncoder());
		return provider;
	}
	
	
	@Bean
	public UserDetailsService userDetailsService() {
		return myUserDetailService;
	}
	
	/*
	
	@Bean
	public UserDetailsService userDetailsService() {
		UserDetails admin=User.builder()
				.username("adi")
				.password(passwordEncoder().encode("1234"))
				.roles("ADMIN")
				.build();
		UserDetails user=User.builder()
				.username("ida")
				.password(passwordEncoder().encode("1234"))
				.roles("USER")
				.build();
		return new InMemoryUserDetailsManager(user,admin);
	}
	
	*/
	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
	    return httpSecurity
	        .csrf(csrf->csrf.disable())
	        .authorizeHttpRequests(auth -> auth
	        .requestMatchers("/home").permitAll()
	        .requestMatchers("/register").permitAll()
	            .requestMatchers("/home/**").permitAll()
	            .requestMatchers("/admin/**").hasRole("ADMIN")
	            .requestMatchers("/user/**").hasRole("USER")
	            .anyRequest().authenticated())
	        .formLogin(form -> form
	        		//.loginPage("/login")
	                .permitAll())
	        .logout(logout -> logout
	                .logoutUrl("/logout") // Logout endpoint
	                .logoutSuccessUrl("/home") // Redirect to /home after logout
	                .permitAll()) // Allow public access to logout
	        .build();
	}
	
}
