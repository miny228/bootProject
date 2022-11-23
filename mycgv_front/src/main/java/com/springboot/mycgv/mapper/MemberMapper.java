package com.springboot.mycgv.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.springboot.mycgv.dto.MemberDto;

@Mapper
public interface MemberMapper {
	
	
	int getLogin(MemberDto memberDto);
	int getInsert(MemberDto memberDto);
	
	
}

