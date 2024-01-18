package com.hj.pjt.entity;

import java.io.Serializable;

import com.hj.pjt.domain.OauthId;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(OauthId.class)
public class User implements Serializable {
	
	@Transient
	private static final long serialVersionUID = 1L;

	@Id
	private String oauthtype;
	@Id
	private String oauthtoken;
	
	private String username;
	private String useremail;
}
