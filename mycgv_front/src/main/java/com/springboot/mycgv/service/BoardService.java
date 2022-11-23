package com.springboot.mycgv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.mycgv.dto.BoardDto;
import com.springboot.mycgv.dto.PageDto;
import com.springboot.mycgv.mapper.BoardMapper;

@Service
public class BoardService {

	@Autowired
	private BoardMapper boardDao;
	
	
	public int getHits(String bid) {
		return boardDao.getHits(bid);
	}
	
	public int getDelete(BoardDto boardDto) {
		return boardDao.getDelete(boardDto);
	}
	
	
	public int getUpdate(BoardDto boardDto) {
		return boardDao.getUpdate(boardDto);
	}
	
	
	public BoardDto getContent(String bid) {
		return boardDao.getContent(bid);
	}
	
	
	public int getInsert(BoardDto boardDto) {
		return boardDao.getInsert(boardDto);
	}
	
	
	public List<BoardDto> getList(PageDto pageDto){
		return boardDao.getList(pageDto);
	}
		
}
