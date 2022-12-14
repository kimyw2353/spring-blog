package com.blog.yael.mvc.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.blog.yael.mvc.domain.Board;

//게시판 Repository
//@author 김예원
@Repository
public interface BoardRepository {
	
	List<Board> getList();
	
	Board get(int boardSeq);
	
	void save(Board board);
	
	void update(Board board);
	
	void delete(int boardSeq);

}
