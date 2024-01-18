package com.hj.pjt.controller; 

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hj.pjt.service.KakaoAPI;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor
@RequestMapping(value = "/social")
@Controller
public class LoginController {

	private final KakaoAPI kakao;

	@GetMapping("/loginpage")
	public void getLoginPage() {
	}

	@GetMapping("/login")
	public String login(@RequestParam("code") String code) {
		System.out.println(code);
		String access_token = kakao.getAccessToken(code);
		System.out.println("controller access_token : " + access_token);

		String userInfo = kakao.getUserInfo(access_token);
		if (userInfo.equals("success")) {
			return "redirect:/";
		} else {
			return "redirect:/social/loginpage";
		}

		
	}

}
