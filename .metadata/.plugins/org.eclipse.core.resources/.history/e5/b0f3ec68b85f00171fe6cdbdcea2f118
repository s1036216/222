package com.hanbit.oop.sevice;

import com.hanbit.oop.domain.MemberBean;

public class MemberService {
	MemberBean session;

	public MemberService() { // 임시저장공간
		session = new MemberBean();
	}

	public String getGender(MemberBean member) {
		String gender = "";
		switch (member.getSsn().charAt(6)) {
		case '1':
		case '3': {
			gender = "남자입니다";
		}
			break;
		case '2': {
			gender = "여자입니다";
		}
			break;

		case '4': {
			gender = "여자입니다";
		}
			break;
		case '5': {
			gender = "외국인입니다";
		}
			break;
		case '6': {
			gender = "외국인입니다";
		}
			break;
		case '7': {
			gender = "잘못입력했습니다";
		}
			break;
		case '8': {
			gender = "잘못입력했습니다";
		}
			break;
		case '9': {
			gender = "잘못입력했습니다";
		}
			break;
		default:
			gender = "잘못입력했습니다";
		}
		return gender;
	}

	public String getAge(MemberBean member) {
		int age = 0;
		int year = Integer.parseInt(member.getSsn().substring(0, 2));
		age = ((17 - year) >= 0) ? 2017 - (year + 2000) + 1 : 2017 - (year + 1900) + 1;
		return String.valueOf(age);
	}

	public String join(MemberBean member) {

		/*
		 * System.out.println("회원가입시 사용한 ID"+member.getId());
		 * System.out.println("회원가입시 사용한 비번"+member.getpass());
		 * System.out.println("회원가입시 사용한 이름"+member.getName());
		 * System.out.println("회원가입시 사용한 SSN:"+member.getSsn());
		 * 
		 */ // session 에다가 회원가입시 입력한 정보 저장하는 소스
		session=member;
		return "환영합니다" + session.getName();

	}

	public String Login(MemberBean member) {
			return (session.getId().equals(member.getId())&&session.getpass().equals(member.getpass()))?
				"성공":"실패..";
	}
	
	
	}


