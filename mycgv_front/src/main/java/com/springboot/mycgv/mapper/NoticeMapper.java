package com.springboot.mycgv.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.springboot.mycgv.dto.NoticeDto;
import com.springboot.mycgv.dto.PageDto;

@Mapper
public interface NoticeMapper {
	
	int getHits(String nid);
	int getDelete(NoticeDto noticeDto);
	int getUpdate(NoticeDto noticeDto);
	NoticeDto getContent(String nid);
	int getWrite(NoticeDto noticeDto);
	List<NoticeDto> getList(PageDto pageDto);
		
}
