package com.hanbit.controller;

import javax.swing.*;

import com.hanbit.oop.inheritance.AndroidPhone;
import com.hanbit.oop.inheritance.CellPhone;
import com.hanbit.oop.inheritance.Iphone;
import com.hanbit.oop.inheritance.Kaka;
import com.hanbit.oop.inheritance.Phone;

public class PhoneController {
	public static void main(String[]args){
	
		Phone p1=new Phone();
		CellPhone nokia=new CellPhone();
		Iphone iphone=new Iphone();
		AndroidPhone gel=new AndroidPhone();
		
		while(true){
			switch (JOptionPane.showInputDialog("0.end,  1.집전화 2.휴대폰3.아이폰 4.")) {
			case "0":
				JOptionPane.showMessageDialog(null,"종료");
				return;
			case "1":
				p1.setName(JOptionPane.showInputDialog("이름"));
				p1.setPhoneNo(JOptionPane.showInputDialog("전화번호"));
				p1.setBrand(JOptionPane.showInputDialog("전화기브랜드"));
				p1.setCall(JOptionPane.showInputDialog("통화내용"));
				
				JOptionPane.showMessageDialog(null,p1.toString());
				break;
			case "2":
				nokia.setName(JOptionPane.showInputDialog("이름"));
				nokia.setPhoneNo(JOptionPane.showInputDialog("전화번호"));
				nokia.setBrand(JOptionPane.showInputDialog("전화기브랜드"));
				nokia.setCall(JOptionPane.showInputDialog("통화내용"));
				nokia.setPortable(true);
				JOptionPane.showMessageDialog(null,nokia.toString());
				break;
			case "3":
				iphone.setName(JOptionPane.showInputDialog("이름"));
				iphone.setPhoneNo(JOptionPane.showInputDialog("전화번호"));
				iphone.setDate(JOptionPane.showInputDialog("통화내용"));
				JOptionPane.showMessageDialog(null,iphone.toString());
				break;
			case "4":
				gel.setName(JOptionPane.showInputDialog("이름"));
				gel.setPhoneNo(JOptionPane.showInputDialog("전화번호"));
				gel.setDate(JOptionPane.showInputDialog("통화내용"));
				gel.setSize(JOptionPane.showInputDialog("사이즈"));
				gel.setApp(JOptionPane.showInputDialog("어플종류"));
				JOptionPane.showMessageDialog(null,gel.toString());
				break;
			}
		}
	
}
}