package com.asia.ProductShipment.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.asia.ProductShipment.board.Board;
import com.asia.ProductShipment.board.service.BoardService;

@RestController
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/board.do")
	public ModelAndView boardList(Board board) throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("board");
		
		String s = boardService.pageNum(board);
		
		List<Board> list = boardService.boardList(board);
		
		modelAndView.addObject("data", list);
		
		return modelAndView;
	}
	
	@PostMapping("/viewDetail_board.do")
	public ResponseEntity<?> boardDetail(@Validated Board board, Errors errors) {
		List<Board> list = boardService.boardDetail(board);
		return ResponseEntity.ok(list);
	}
	
	@RequestMapping("/boardWriteForm.do")
	public ModelAndView boardWriteForm(Board board) throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("boardWrite");
		return modelAndView;
	}
	
	@RequestMapping("/boardWrite.do")
	public ModelAndView boardWrite(Board board) throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("board");
		
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		UserDetails userDetails = (UserDetails)principal;
		
		board.setNoticeID(boardService.boardMaxID(board));
		board.setWriter(userDetails.getUsername());
		
		boardService.boardInsert(board);
		
		return boardList(board);
	}
	
	@RequestMapping("/boardUpdateForm.do")
	public ModelAndView boardUpdateForm(Board board) throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("boardUpdate");
		List<Board> list = boardService.boardDetail(board);
		modelAndView.addObject("noticeID",list.get(0).getNoticeID());
		modelAndView.addObject("title",list.get(0).getTitle());
		modelAndView.addObject("body",list.get(0).getBody());
		return modelAndView;
	}
	
	@RequestMapping("/boardUpdate.do")
	public ModelAndView boardUpdate(Board board) throws Exception{
		System.out.println("board.getNoticeID() : " + board.getNoticeID());
		boardService.boardUpdate(board);
		
		return boardList(board);
	}
	
	@RequestMapping("/boardDelete.do")
	public ModelAndView boardDelete(Board board) throws Exception{
		boardService.boardDelete(board);
		return boardList(board);
	}
	
}
