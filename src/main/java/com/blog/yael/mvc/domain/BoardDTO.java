package com.blog.yael.mvc.domain;

import java.util.Date;

import lombok.Data;

@Data
public class BoardDTO {
	
	private int boardSeq;
	private String titleString;
	private String contentString;
	private Date regDate;
}
