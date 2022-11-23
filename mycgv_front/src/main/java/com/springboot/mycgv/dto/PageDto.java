package com.springboot.mycgv.dto;

import lombok.Data;

@Data
public class PageDto {

	//변수
	private int startCount;
	private int endCount;
	private int dbCount;
	private int pageSize;
	private int reqPage;
	private int pageCount;
	
}

