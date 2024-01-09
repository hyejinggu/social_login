package com.hj.pjt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class Hyejin_project1Config {
	   @Bean
	   public PasswordEncoder getPasswordEncord() {
	      return new BCryptPasswordEncoder();
	   }   
}
