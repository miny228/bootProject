package com.springboot.mycgv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.mycgv.dto.BoardDto;
import com.springboot.mycgv.dto.PageDto;
import com.springboot.mycgv.service.BoardService;
import com.springboot.mycgv.service.FileService;
import com.springboot.mycgv.service.PageService;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@Autowired
	private PageService pageService;
	
	@Autowired
	private FileService fileService;
	
	
	/**
	 * 조회수 처리 -- 같은 /board_content/{bid}/{rpage} 주소가 있어서 content에 로직을 넣어줌
	 */
//	@GetMapping("/board_content/{bid}/{rpage}")
//	public String updateHits(@PathVariable String bid,
//							 @PathVariable String rpage) {
//		
//		boardService.getHits(bid);
//		
//		return "redirect:/board_list/"+rpage;
//	}
		
	
	/**
	 * "/{rpage}"로 나오면 board_list로 가게 하기
	 */
	@GetMapping("/{rpage}")
	public String root(@PathVariable String rpage) {
		return "redirect:/board_list/"+rpage;
	}
	
	
	/**
	 * board_delete : 게시판 삭제 처리
	 */
	@PostMapping("/board_delete")
	public String boardDeletePost(BoardDto boardDto, String rpage) throws Exception {
		
		int result = boardService.getDelete(boardDto);
		
		if(result == 1) {
			if(boardDto.getBsfile().equals("none")) {
				fileService.deleteFile(boardDto.getBsfile());												
			}
		}
		
		return "redirect:/"+rpage;
	}
	
	
	@RequestMapping(value= {"/board_delete/{bid}/{rpage}", 
							"/board_delete/{bid}/{rpage}/{bsfile}"})
	public String board_delete(@PathVariable(value="bid") String bid,
			@PathVariable(value="rpage") String rpage, 
			@PathVariable(value="bsfile",required = false) String bsfile,
			Model model) {
		if(bsfile == null) {
			bsfile = "none";
		}
		
		//System.out.println("bsfile ===>" +bsfile);
		
		return "/board/board_delete";
	}
		
	
	/**
	 * board_update : 게시판 수정 처리
	 */
	
	@PostMapping("/board_update")
	public String boardUpdatePost(BoardDto boardDto, String rpage) throws Exception {
		
		//init()기준으로 위에 있어야 함
		String oldFile = boardDto.getBsfile();
		
		if(fileService.fileCheck(boardDto.getFile1())) {
			boardDto = (BoardDto)fileService.init(boardDto,"board");
			
			int result = boardService.getUpdate(boardDto);
			if(result == 1) {
				fileService.saveFile(boardDto,"board"); //새로운파일 저장
				fileService.deleteFile(oldFile); //기존파일 삭제
			}
		}else {
			boardService.getUpdate(boardDto);
		}
		
		
		return "redirect:/"+rpage;
	}
	
	
	/**
	 * board_update: 게시판 수정 화면
	 */
	
	@GetMapping("/board_update/{bid}/{rpage}")
	public String board_update(@PathVariable String bid,
									@PathVariable String rpage, Model model) {
		//수정화면에 글 받아와야 해서 상세보기 부분을 가져온다.
		model.addAttribute("vo", boardService.getContent(bid));
		model.addAttribute("rpage", rpage);
		
		return "/board/board_update";
	}
	
	
	/**
	 * board_content : 게시판 상세 정보
	 */
	@GetMapping("/board_content/{bid}/{rpage}")
	public String board_content(@PathVariable String bid,
								@PathVariable String rpage, Model model) {
		
		
		boardService.getHits(bid);
		model.addAttribute("vo", boardService.getContent(bid));
		model.addAttribute("rpage", rpage);
		
		return "/board/board_content";
	}
	

	/**
	 * board_write : 게시판 글쓰기 화면
	 */
	@GetMapping("/board_write")
	public String board_write() {
		return "/board/board_write";
	}
	
	
	/**
	 * board_write: 게시판 글쓰기 처리
	 */
	@PostMapping("/board_write")
	public String boardWritePost(BoardDto boardDto) throws Exception {
		
		//파일이 있는지 없는지 체크
		if(fileService.fileCheck(boardDto.getFile1())) {
			//파일o : init메서드에서 이름 생성해서 dto에 넣어준다
			boardDto = (BoardDto)fileService.init(boardDto,"board");
			int result = boardService.getInsert(boardDto);
			if(result == 1) {
				fileService.saveFile(boardDto,"board");
			}
			
		}else {
			boardDto.setBfile("");
			boardDto.setBsfile("");
			boardService.getInsert(boardDto);			
		}
		
		return "redirect:/board_list/1";
	}
	
	
	/**
	 * board_list : 게시판 전체 리스트 
	 */
	@GetMapping("/board_list/{rpage}")
	public String boardList(@PathVariable String rpage, Model model) {
		PageDto pageDto = pageService.getPageCount(rpage);
		
		model.addAttribute("list", boardService.getList(pageDto));
		model.addAttribute("page", pageDto);
		
		return "/board/board_list";
	}

	
}











