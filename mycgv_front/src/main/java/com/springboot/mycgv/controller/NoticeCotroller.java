package com.springboot.mycgv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NoticeCotroller {

	@GetMapping("/notice_list")
	public String notice_list() {
		return"/notice/notice_list";
	}
	
}
