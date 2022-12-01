package com.springboot.mycgv.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.mycgv.dto.MemberDto;
import com.springboot.mycgv.service.MemberService;

@Controller
public class JoinController {
	
	@Autowired
	private MemberService memberService;
	
	/**
	 * idCheck : 아이디체크
	 */
	@ResponseBody
	@GetMapping("/idcheck/{id}")
	public String idcheck(@PathVariable(value="id") String id, HttpSession session, Model model) {
			
		return String.valueOf(memberService.idcheck(id));
	}
	
	
	/**
	 * join.do : 회원가입 폼
	 */
	@GetMapping("/join")
	public String join() {
		return "/join/join";
	}
	
	/**
	 * 회원가입 처리
	 */
	@PostMapping("/join")
	public String joinPost(MemberDto memberDto, Model model) {
		
		int result = memberService.getInsert(memberDto);
		if(result == 1) {
			model.addAttribute("join_result", "ok");
		}
		
		return "/login/login";
	}
	
}
