package com.hanbit.oop.board.controller;

import javax.swing.JOptionPane;

import com.hanbit.board.domain.BoardBean;
import com.hanbit.board.service.BoardService;
import com.hanbit.board.serviceImpl.BoardServiceImpl;


public class BoardController {
		public static void main(String[] args) {
			BoardService service=new BoardServiceImpl();
			BoardBean bean=new BoardBean();
			BoardBean[] list;
			while(true){
				switch(JOptionPane.showInputDialog(null,"0.종료 1.게시글등록 2.게시글갯수(count) 3.게시글번호로찾기 4.이름으로찾기5.게시글수정 6.리스트(list) 7.게시글삭제")){
				case "0":
					JOptionPane.showMessageDialog(null, "종료합니다");
				case "1":
					bean.setWriter(JOptionPane.showInputDialog(null,"이름"));
					bean.setTitle(JOptionPane.showInputDialog(null,"제목"));
					bean.setContent(JOptionPane.showInputDialog(null,"내용"));
					bean.setRegCate(JOptionPane.showInputDialog(null,"날짜"));
					service.add(bean);
									
					JOptionPane.showMessageDialog(null, "등록완료");
					break;
				case "2":
				
					JOptionPane.showMessageDialog(null, "게시글수"+service.count());
					break;
				case "3":
					JOptionPane.showMessageDialog(null, service.findByseq(Integer.parseInt(JOptionPane.showInputDialog("번호"))).toString());
		            break;

					
				/*	JOptionPane.showInputDialog(null,"번호입력").toString();
					int seq=0;
					service.findByseq(seq);
					JOptionPane.showMessageDialog(null, "이름/제목/글내용/등록");				
					break; */
				case "4":
					JOptionPane.showInputDialog(null,"이름입력");
					String name="";
					service.findWriter(name);
					JOptionPane.showMessageDialog(null, "이름/제목/글내용/등록");
					break;
				case "5":
					JOptionPane.showInputDialog(null,"번호/내용");
					service.update(bean);
					JOptionPane.showMessageDialog(null, "수정완료");
					break;
				case "6":
					service.list();
					JOptionPane.showMessageDialog(null, "리스트");
					break;
				case "7":
					JOptionPane.showInputDialog(null,"번호/삭제");
					int seq2=0;
					service.delete(seq2);
					JOptionPane.showMessageDialog(null, "삭제성공");
					break;
				
				}
			}
		}

		private static void split(String string) {
			// TODO Auto-generated method stub
			
		}
}