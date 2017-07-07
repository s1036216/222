package com.hanbit.board.serviceImpl;

import com.hanbit.board.domain.BoardBean;
import com.hanbit.board.service.BoardService;

public class BoardServiceImpl implements BoardService {
	BoardBean board;
	int count;
	BoardBean[] list;

	public BoardServiceImpl() {
		count = 0;
		board = new BoardBean();
		list = new BoardBean[count];
	}
	@Override
	public void BoardServiceImpl(BoardBean bean) {
		int seqCount = count + 1;
		bean.setSeq(seqCount);
		if (count == list.length) {
			BoardBean[] temp = new BoardBean[count + 1];
			System.arraycopy(list, 0, temp, 0, count);
			list = temp;
			seqCount++;
		}
		list[count++] = bean;
		System.out.println("serviceImpl writeBoard:" + bean.toString());
	}

	@Override
	public BoardBean[] list() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public BoardBean findWriter(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardBean[] findByseq(int seq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		
		return count;
	}

	@Override
	public void update(BoardBean bean) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int seq) {
		// TODO Auto-generated method stub

	}

	@Override
	public void add(BoardBean bean) {
		// TODO Auto-generated method stub
		
	}

}