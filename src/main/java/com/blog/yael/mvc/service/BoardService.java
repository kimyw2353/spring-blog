package com.blog.yael.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.yael.mvc.domain.Board;
import com.blog.yael.mvc.repository.BoardRepository;

//게시판 서비스
//@author 김예원
@Service
public class BoardService{
	
	@Autowired
	private BoardRepository repository;
	
    /*
     * 목록 리턴
     * @return
     * */
	public List<Board> getList(){
		return repository.getList();
	}
	
	/*
     * 상세 정보 리턴
     * @param boardSeq
     * @return
     * */
	public Board get(int boardSeq) {
		return repository.get(boardSeq);
	}
	
	/*
     * 등록 처리
     * @param board
     * */
	public void save(Board board) {
		repository.save(board);
	}
	
	/*
     * 업데이트 처리
     * @param board
     * */
	public void update(Board board) {
		repository.update(board);
	}
	
	/*
     * 삭제 처리
     * @param boardSeq
     * */
	public void delete(int boardSeq) {
		repository.delete(boardSeq);
	}

}
