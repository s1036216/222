package com.hanbit.oop.serviceImpl;
public class GradeS {
	public String[] exe(String name, int kor, int eng,int math){
		
	//변수 선언
	int	avg=0,total=0;
	String re="";
	//name, kor, eng, math
	//total, avg(평균)
	// 이름: 학점
	
	// operation
	total=kor+eng+math;
	avg=total/3;
	
	if (avg >=90){  //avg >=90
		re="A";
	}else if (avg >=80){ //avg >=80
		re="B";
	}else if (avg >=70){
		re="C";
	}else if (avg >=60){
		re="D";
	}else if (avg >=50){
		re="F";
	}
	String arr1=total+"";
	String arr2=avg+"";
	String[] arr3={name,arr1,arr2,re};
	
	//
	return arr3;	
	}
	}