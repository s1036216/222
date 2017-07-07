package com.hanbit.board.controller;

import javax.swing.JOptionPane;

import com.hanbit.board.domain.BoardBean;
import com.hanbit.board.service.BoardService;
import com.hanbit.board.serviceImpl.BoardServiceImpl;

public class BoardController {
	public static void main(String[] args) {
		BoardBean board=null;
		BoardService service= new BoardServiceImpl();
		BoardBean[] list; 
		while (true) {
			switch(JOptionPane.showInputDialog("0.close 1.게시글 추가 2.게시글 갯수확인 3.리스트 확인 4.seq로 글찾기  5.이름으로 글찾기 6.게시글 업데이트 7.게시글 삭제")){
			case"0":
				JOptionPane.showMessageDialog(null, "System close");
				return;
			case"1":
				board=new BoardBean();
				board.setWriter(JOptionPane.showInputDialog("writer "));
				board.setTitle(JOptionPane.showInputDialog("title"));
				board.setContent(JOptionPane.showInputDialog("content"));
				board.setRegDate(JOptionPane.showInputDialog("regiDate"));
				service.writeBoard(board);
				JOptionPane.showMessageDialog(null, "등록 되었습니다");
				break;
			case"2":
				JOptionPane.showMessageDialog(null, "등록된 게시글수: "+service.countArticles());
				break;
			case"3":
				String sList="";
				list =service.list();
				for(int i=0;i<service.countArticles();i++){
					sList+=list[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, sList);
				break;
			case"4":
				int seqNo=Integer.parseInt(JOptionPane.showInputDialog("찾으실 seqNo 입력"));
				System.out.println(seqNo);
				JOptionPane.showMessageDialog(null, service.findBySeq(seqNo).toString());
				break;
			case"5":
				//findByName
				String bList="";
				list=service.findByWriter(JOptionPane.showInputDialog("찾으실 이름으로 검색하세요"));
				for(int i=0;i<list.length;i++){
					bList+=list[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, bList);
				break;
			case "6"://update
				board= new BoardBean();
				board.setSeq(Integer.parseInt(JOptionPane.showInputDialog("update할 seq를 입력하세요")));
				board.setTitle(JOptionPane.showInputDialog("변경할 제목 입력"));
				board.setContent(JOptionPane.showInputDialog("새로운 내용 입력"));
				board.setRegDate(JOptionPane.showInputDialog("수정된 날짜 입력"));
				service.updateBoard(board);
				JOptionPane.showMessageDialog(null,"수정이 완료되었습니다.");
				break;	
			case "7"://delete
				int subjectSeq=Integer.parseInt(JOptionPane.showInputDialog("지울 seqNO를 입력하세요"));
				if(subjectSeq==board.getSeq()){
					service.deleteBoard(subjectSeq);
					JOptionPane.showMessageDialog(null, "삭제되었습니다.");
				}else{
					JOptionPane.showMessageDialog(null, "존재하지 않는 게시글 입니다.");
				}
				break;	
			}
		}
	}
}
