package com.hj.pjt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor
@RequestMapping(value = "/socialLogin")
@Controller
public class LoginController {
	int test = 0;
	int test2 = 0;
	String test3 = "test";
}
