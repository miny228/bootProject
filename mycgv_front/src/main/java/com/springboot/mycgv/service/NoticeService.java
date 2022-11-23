package com.springboot.mycgv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.mycgv.dto.NoticeDto;
import com.springboot.mycgv.dto.PageDto;
import com.springboot.mycgv.mapper.NoticeMapper;

@Service
public class NoticeService {

	@Autowired
	private NoticeMapper noticeDao;
	
	
	public int getHits(String nid) {
		return noticeDao.getHits(nid);
	}
	
	public int getDelete(NoticeDto noticeDto) {
		return noticeDao.getDelete(noticeDto);
	}
	
	public int getUpdate(NoticeDto noticeDto) {
		return noticeDao.getUpdate(noticeDto);
	}
	
	public NoticeDto getContent(String nid) {
		return noticeDao.getContent(nid);
	}
	
	
	public int getWrite(NoticeDto noticeDto) {
		return noticeDao.getWrite(noticeDto);
	}
	
	public List<NoticeDto> getList(PageDto pageDto){
		return noticeDao.getList(pageDto);
	}
	
	
	
}
