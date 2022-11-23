package com.springboot.mycgv.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.springboot.mycgv.dto.BoardDto;
import com.springboot.mycgv.dto.PageDto;

@Mapper
public interface BoardMapper {
	
	int getHits(String bid);
	int getDelete(BoardDto boardDto);
	int getUpdate(BoardDto boardDto);
	BoardDto getContent(String bid);
	int getInsert(BoardDto boardDto);
	List<BoardDto> getList(PageDto pageDto);
	
}

