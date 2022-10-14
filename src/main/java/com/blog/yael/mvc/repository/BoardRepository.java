package com.blog.yael.mvc.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.blog.yael.mvc.domain.BoardDTO;

//게시판 Repository
//@author 김예원
@Repository
public interface BoardRepository {
	
	List<BoardDTO> getList();
	
	BoardDTO get(int boardSeq);
	
	void save(BoardDTO board);
	
	void update(BoardDTO board);
	
	void delete(int boardSeq);

}
