package com.hj.pjt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private int userid;

	   private String username;
	   private String userbirthday;
	   private String userphone;
	   private String oauthtype;
	   private String oauthtoken;
	   private String useremail;
}
