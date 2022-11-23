package com.springboot.mycgv.controller;

import java.nio.file.Files;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.mycgv.dto.NoticeDto;
import com.springboot.mycgv.dto.PageDto;
import com.springboot.mycgv.service.FileService;
import com.springboot.mycgv.service.NoticeService;
import com.springboot.mycgv.service.PageService;


@Controller
public class AdminController {

	@Autowired
	private PageService pageService;
	
	@Autowired
	private NoticeService noticeSerivce;
	
	@Autowired
	private FileService fileService;
	
	
	
	@PostMapping("/admin_notice_delete")
	public String admin_notice_delete_post(NoticeDto noticeDto, String rpage) throws Exception{
		
		String oldFile = noticeSerivce.getContent(noticeDto.getNid()).getNsfile();
		
		int result = noticeSerivce.getDelete(noticeDto);
		if(result == 1) {
			fileService.deleteFile(oldFile);
		}
	
		
		return "redirect:/admin_notice_list/"+rpage;
	}
	
	
	@GetMapping("/admin_notice_delete/{nid}/{rpage}")
	public String admin_notice_delete(@PathVariable String nid,
			@PathVariable String rpage, Model model) {
		
		model.addAttribute("nid", nid);
		model.addAttribute("rpage", rpage);
		
		return "/admin/admin_notice/admin_notice_delete";
		
	}
	
	
	@PostMapping("/admin_notice_update")
	public String admin_notice_update_post(NoticeDto noticeDto, String rpage) throws Exception {
		
		if(fileService.fileCheck(noticeDto.getFile1())) {
			String oldFile = noticeDto.getNsfile();
			noticeDto = (NoticeDto)fileService.init(noticeDto, "notice");
			int result = noticeSerivce.getUpdate(noticeDto);
			if(result == 1) {
				fileService.saveFile(noticeDto, "notice");
				fileService.deleteFile(oldFile);
			}
		}else {
			noticeSerivce.getUpdate(noticeDto);
		}
		
		
		return "redirect:/admin_notice_list/"+rpage;
	}
	
	
	@GetMapping("/admin_notice_update/{nid}/{rpage}")
	public String admin_notice_update(@PathVariable String nid, 
						@PathVariable String rpage, Model model) {
		
		model.addAttribute("vo", noticeSerivce.getContent(nid));
		model.addAttribute("rpage", rpage);
		
		return "/admin/admin_notice/admin_notice_update";
	}
	
	
	@GetMapping("/admin_notice_content/{nid}/{rpage}")
	public String admin_notice_content(@PathVariable String nid, 
						@PathVariable String rpage, Model model) {
		
		
		noticeSerivce.getHits(nid);
		model.addAttribute("vo", noticeSerivce.getContent(nid));
		model.addAttribute("rpage", rpage);
				
		return "/admin/admin_notice/admin_notice_content";
	}
	
	
	@PostMapping("/admin_notice_write")
	public String admin_notice_write_post(NoticeDto noticeDto) throws Exception {
		
		if(fileService.fileCheck(noticeDto.getFile1())) {
			noticeDto = (NoticeDto)fileService.init(noticeDto,"notice");
			int result = noticeSerivce.getWrite(noticeDto);
			if(result == 1) {
				fileService.saveFile(noticeDto,"notice");
			}
		}else {
			noticeDto.setNfile("");
			noticeDto.setNsfile("");
			noticeSerivce.getWrite(noticeDto);
		}
		
		
		return "redirect:/admin_notice_list/1";
	}
	
	
	@GetMapping("/admin_notice_write")
	public String admin_notice_write() {
		return "/admin/admin_notice/admin_notice_write";
	}
	
	@GetMapping("/admin_notice_list/{rpage}")
	public String admin_notice_list(@PathVariable String rpage, Model model) {
		
		PageDto pageDto = pageService.getPageCount(rpage);
		
		model.addAttribute("list", noticeSerivce.getList(pageDto));
		model.addAttribute("page", pageDto);
		
		return "/admin/admin_notice/admin_notice_list";
	}
	
	@GetMapping("/admin")
	public String admin() {
		
		return "/admin/admin";
	}
	
}
