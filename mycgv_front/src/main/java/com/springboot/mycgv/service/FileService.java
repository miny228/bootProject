package com.springboot.mycgv.service;

import java.io.File;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.springboot.mycgv.dto.BoardDto;
import com.springboot.mycgv.dto.NoticeDto;


@Service
public class FileService {
	
	@Value("${spring.servlet.multipart.location}")
	private String uploadPath;

	public boolean fileCheck(MultipartFile file) {
		if(file.getOriginalFilename().equals("")) {
			return false;
		}else {
			return true;
		}		
	}
	
	/**
	 * BoardDto, NoticeDto, MemberDto 객체의 공통적인 부모찾기 --> Object
	 */
	public Object init(Object object, String objName) {
		Object objectDto = null;
		
		//objName으로 BoardDto, NoticeDto, MemberDto 맵핑한다.
		if(objName.equals("board")) {
			BoardDto dto = (BoardDto)object;
			MultipartFile file = dto.getFile1();
			
			if(file != null) {
				if(!file.getOriginalFilename().equals("")) {
					UUID uuid = UUID.randomUUID();
					dto.setBfile(file.getOriginalFilename());
					dto.setBsfile(uuid+"_"+file.getOriginalFilename());			
				}
			}
			objectDto = dto;
		}else if(objName.equals("notice")) {
			NoticeDto dto = (NoticeDto)object;
			MultipartFile file = dto.getFile1();
			
			if(file != null) {
				if(!file.getOriginalFilename().equals("")) {
					UUID uuid = UUID.randomUUID();
					dto.setNfile(file.getOriginalFilename());
					dto.setNsfile(uuid+"_"+file.getOriginalFilename());			
				}
			}
			objectDto = dto;
		}//else if(objName.equals("member")) {
		//	MemberDto dto = (MemberDto)object;
		//	MultipartFile file = dto.getFile1();
			
		//	if(file != null) {
		//		if(!file.getOriginalFilename().equals("")) {
		//			UUID uuid = UUID.randomUUID();
		//			dto.setBfile(file.getOriginalFilename());
		//			dto.setBsfile(uuid+"_"+file.getOriginalFilename());			
		//		}
		//	}
		//  objectDto = dto;
		
		return objectDto;
	}
	
// 	한개만 할 경우엔, 이렇게 작성
//	public BoardDto init(BoardDto dto) {
//		MultipartFile file = dto.getFile1();
//		
//		if(file != null) {
//			if(!file.getOriginalFilename().equals("")) {
//				UUID uuid = UUID.randomUUID();
//				dto.setBfile(file.getOriginalFilename());
//				dto.setBsfile(uuid+"_"+file.getOriginalFilename());			
//			}
//		}
//		
//		return dto;
//	}
//

	public void saveFile(Object object, String objName) throws Exception {
		Object objectDto = null;
		
		//objName으로 BoardDto, NoticeDto, MemberDto 맵핑한다.
		if(objName.equals("board")) {
			BoardDto dto = (BoardDto)object;
			File file = new File(uploadPath + dto.getBsfile());
			dto.getFile1().transferTo(file);

			objectDto = dto;
		}else if(objName.equals("notice")) {
			NoticeDto dto = (NoticeDto)object;
			File file = new File(uploadPath + dto.getNsfile());
			dto.getFile1().transferTo(file);
			objectDto = dto;
		}
		
	}	
	
//	public void saveFile(BoardDto dto) throws Exception {
//		File file = new File(uploadPath + dto.getBsfile());
//		dto.getFile1().transferTo(file);
//	}	
	

	//uploadPath 부분이 같으면 다른 곳에서도 사용이 가능
	public void deleteFile(String fileName) throws Exception{
		File file = new File(uploadPath + fileName);
		if(file.exists()) {
			file.delete();
		}
	}
	
	
}