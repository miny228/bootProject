package com.springboot.mycgv.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.mycgv.dto.MemberDto;
import com.springboot.mycgv.service.MemberService;

@Controller
public class LoginController {
	
	@Autowired
	private MemberService memberService;
	
	
	/**
	 * logout : 로그아웃
	 */
	
	@GetMapping("/logout")
	public String logout(HttpSession session, Model model) {
	
		String sid =(String)session.getAttribute("sid");
		
		if(sid != null) {
			session.invalidate();
		}
		
		model.addAttribute("logout_result", "ok");
				
		return "/index";
	}
		
	
	/**
	 * login : 로그인 화면
	 */
	@GetMapping("/login")
	public String login() {
				
		return "/login/login";
	}
	
	
	/**
	 * 로그인 처리
	 */
	@PostMapping("/login")
	public String loginPost(MemberDto memberDto, 
			 HttpSession session, Model model) {
		
		int result = memberService.getLogin(memberDto);
		
		if(result == 1) {
			//세션객체에 sid 추가
			session.setAttribute("sid", memberDto.getId());
			model.addAttribute("login_result", "ok");
		}else {
			model.addAttribute("login_result", "fail");
		}
		
		return "/index";
	}
	
	
}





