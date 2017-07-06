package com.hanbit.oop.sevice;

import com.hanbit.oop.domain.Gradebean;

public class GradeService {

	
		
	public int getTotal(Gradebean gbean) {
		return gbean.getKor() + gbean.getEng() + gbean.getMath();
	}

	
	
	public int setAvg(int total) {
		return total / 3;
	}

	public String Grade(int avg) {
		String grade="";
		switch (avg / 10) {
		case 10:
		case 9:
			grade = "A";
		
			break;
		case 8:
			grade = "B";
		
			break;
		case 7:
			grade = "C";
		
			break;
		case 6:
			grade = "D";
		
			break;
		case 5:
			grade = "e";
		
			break;
		default:
			grade = "f";
		
			break;
		}

	return grade;
	}
}

	
	
/*	
	public String toString(){ //결과만
	return name2+"님의전공은"+major+"\t"+grade+"\t"+re;
		        
}
	}*/