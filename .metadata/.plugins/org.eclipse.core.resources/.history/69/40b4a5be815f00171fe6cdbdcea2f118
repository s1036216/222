package com.hanbit.oop.sevice;

public class GradeService {

	private int kor, eng, math, total, avg;
	private String grade, re, name2, major;

		
	public void getTotal() {
		this.total = kor + eng + math;
	}

	public int getTotal() {
		return total;
	}

	public void setAvg() {
		this.avg = total / 3;
	}

	public void Grade() {
		setTotal();  //setgrade안에들어옴댐
		setAvg();    //
		switch (avg / 10) {
		case 10:
		case 9:
			this.grade = "A";
			this.re = "장학금 대상입니다";
			break;
		case 8:
			this.grade = "B";
			this.re = "3학점 이수";
			break;
		case 7:
			this.grade = "C";
			this.re = "2학점 이수";
			break;
		case 6:
			this.grade = "D";
			this.re = "재수강";
			break;
		case 5:
			this.grade = "e";
			this.re = "학사경고";
			break;
		default:
			this.grade = "f";
			this.re = "학사경고";
			break;
		}

	}
	
	public String getGrade() {
		return grade + re;
	}


	
	
	
	public String toString(){ //결과만
	return name2+"님의전공은"+major+"\t"+grade+"\t"+re;
		        
}
	}