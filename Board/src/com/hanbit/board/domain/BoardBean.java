package com.hanbit.board.domain;

public class BoardBean {
	 //번호
	private int seq;
	private String   writer,title,content,regCate; //글쓴이,제목,내용,날짜
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegCate() {
		return regCate;
	}
	public void setRegCate(String regCate) {
//		this.regCate = regCate;
	}
	@Override
	public String toString() {
		return "BoardBean [seq=" + seq + ", writer=" + writer + ", title=" + title + ", content=" + content
				+ ", regCate=" + regCate + "]";
	}
	
	
}
