package com.springboot.mycgv.dto;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class BoardDto {

	private int rno;
	private int bhits;
	private String bid;
	private String btitle;
	private String bcontent;
	private String bfile;
	private String bsfile;
	private String bdate;
	//private CommonsMultipartFile file1; -- 3버전 레거시
	private MultipartFile file1; //4버전 부트
	
}
