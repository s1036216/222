package com.hanbit.board.service;

import com.hanbit.board.domain.BoardBean;

public interface BoardService {
	public void writeBoard(BoardBean bean);
	public int countArticles();
	public BoardBean[] list();
	public BoardBean findBySeq(int seq);
	public BoardBean[] findByWriter(String name);
	public void updateBoard(BoardBean bean);
	public void deleteBoard(int seq);

}
