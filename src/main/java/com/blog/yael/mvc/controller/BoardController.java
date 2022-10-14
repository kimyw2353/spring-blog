package com.blog.yael.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.yael.mvc.domain.Board;
import com.blog.yael.mvc.service.BoardService;

//게시판 컨트롤러
//@author 김예원
@RestController
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
    /*
     * 목록 리턴
     * @return
     * */
	@GetMapping
	List<Board> getList(){
		return boardService.getList();
	}
	
	/*
     * 상세 정보 리턴
     * @param boardSeq
     * @return
     * */
	@GetMapping("/{boardSeq}")
	Board get(@PathVariable int boardSeq) {
		return boardService.get(boardSeq);
	}
	
	/*
     * 등록, 수정 처리
     * @param board
     * */
//	@PutMapping
//	@PostMapping
	@GetMapping("/save")
	void save(Board board) {
		boardService.save(board);
	}
	
	/*
     * 삭제 처리
     * @param boardSeq
     * */
	@GetMapping("/delete/{boardSeq}")
	void delete(@PathVariable int boardSeq) {
		boardService.delete(boardSeq);
	}

}
