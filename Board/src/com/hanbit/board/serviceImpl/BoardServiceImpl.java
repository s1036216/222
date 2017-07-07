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
	public void writeBoard(BoardBean bean) {
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
	public int countArticles() {
		return count;
	}

	@Override
	public BoardBean[] list() {
		System.out.println("list" + list.toString());
		return list;
	}

	@Override
	public BoardBean findBySeq(int seq) {
		board = new BoardBean();
		for (int i = 0; i < list.length; i++) {
			if (seq == list[i].getSeq()) {
				board = list[i];
				break;
			}
		}
		System.out.println("result: " + board.toString());
		return board;
	}

	@Override
	public BoardBean[] findByWriter(String writer) {
		int a = 0;
		for (int i = 0; i < list.length; i++) {
			if (writer.equals(list[i].getWriter())) {
				a++;
			}
		}
		BoardBean[] resultList = new BoardBean[a];
		int j = 0;
		for (int i = 0; i < list.length; i++) {
			if (writer.equals(list[i].getWriter())) {
				resultList[j] = list[i];
				j++;
			}

			if (a == j) {
				break;
			}
		}
		System.out.println("findByName: " + resultList.toString());
		return resultList;
	}

	@Override
	public void updateBoard(BoardBean bean) {
		board = findBySeq(bean.getSeq());
		board.setTitle(bean.getTitle());
		board.setContent(bean.getContent());
		board.setRegDate(bean.getRegDate());
		System.out.println("수정된 info: " + board.toString());
	}

	@Override
	public void deleteBoard(int seq) {
		for (int i = 0; i < count; i++) {
			if (seq == list[i].getSeq()) {
				list[i] = list[count-1];
				break;
			}
		}
		list[count-1]=null;
		count--;
	}

}
