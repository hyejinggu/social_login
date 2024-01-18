package com.hj.pjt.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OauthId implements Serializable {

	private static final long serialVersionUID = 1L;

	private String oauthtype;
	private String oauthtoken;

}
