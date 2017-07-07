package com.hanbit.controller;

import java.util.Scanner;

import com.hanbit.oop.domain.MemberBean;

import com.hanbit.oop.serviceImpl.MemberServiceImpl;

import javax.swing.*;

public class Membercontrol {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		MemberServiceImpl ms = new MemberServiceImpl();
		MemberBean member = new MemberBean();
		while (true) {
		//	System.out.println("0.end,  1.join  2.login 3.");
//			String flag=JOptionPane.showInputDialog("0.end,  
	//		
			
			
			switch (JOptionPane.showInputDialog("0.end,  1.join  2.loginessage")) {
			case "0":
				System.out.println("시스템종료");
				return;
			case "1":
				member.setName(JOptionPane.showInputDialog("NAME"));
				member.setId(JOptionPane.showInputDialog("id"));
				member.setpass(JOptionPane.showInputDialog("pass"));
				member.setSsn(JOptionPane.showInputDialog("SSN"));
				JOptionPane.showMessageDialog(null,ms.join(member));
		
				break;
			case "2":
				MemberBean temp=new MemberBean();
				temp.setId(JOptionPane.showInputDialog("id"));
				temp.setpass(JOptionPane.showInputDialog("pass"));
				JOptionPane.showMessageDialog(null,ms.Login(temp));
						
				break;
			
			}
		}
	}
}
