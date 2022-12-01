package com.springboot.mycgv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.mycgv.dto.MemberDto;
import com.springboot.mycgv.mapper.MemberMapper;

@Service
public class MemberService {

	@Autowired
	private MemberMapper memberDao;
	
	
	public int idcheck(String id) {
		return memberDao.idcheck(id);
	}
	
	
	public int getLogin(MemberDto memberDto) {
		return memberDao.getLogin(memberDto);
	}
	
	
	public int getInsert(MemberDto memberDto) {
		return memberDao.getInsert(memberDto);
	}
	
	
}

