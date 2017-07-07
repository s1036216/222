package com.hanbit.oop.serviceImpl;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.MemberService;

public class MemberServiceImpl implements MemberService {
	MemberBean session;

	public MemberServiceImpl() { // 임시저장공간
		session = new MemberBean();
	}
	@Override
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
	@Override
	public String getAge(MemberBean member) {
		int age = 0;
		int year = Integer.parseInt(member.getSsn().substring(0, 2));
		age = ((17 - year) >= 0) ? 2017 - (year + 2000) + 1 : 2017 - (year + 1900) + 1;
		return String.valueOf(age);
	}

	@Override
	public String join(MemberBean member) {
		session=member;
		return "환영합니다" + session.getName();
	}

	@Override
	public String Login(MemberBean member) {
		return (session.getId().equals(member.getId())&&session.getpass().equals(member.getpass()))?
				"성공":"실패..";
	}

}
