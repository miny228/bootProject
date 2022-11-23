package com.springboot.mycgv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.mycgv.dto.MemberDto;
import com.springboot.mycgv.service.MemberService;

@Controller
public class JoinController {
	
	@Autowired
	private MemberService memberService;
	
	/**
	 * joinCheck.do : 회원가입 처리
	 */
//	
//	@RequestMapping(value="/joinCheck.do", method=RequestMethod.POST)
//	public ModelAndView joinCheck(CgvMemberVO vo) {
//		ModelAndView mv = new ModelAndView();
//		
//		int result = memberService.getJoinResult(vo);
//		
//		if(result == 1){
//			mv.addObject("join_result","ok");
//			mv.setViewName("/login/login");
//		}else{
//			mv.setViewName("error_page");
//		}
//		
//		return mv;
//	}
//	
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
