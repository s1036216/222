package com.hanbit.board.serviceImpl;

import java.util.Calendar;
import java.util.Vector;

import com.hanbit.board.domain.AcountBean;
import com.hanbit.board.service.AcountService;

public class AcountServiceImp implements AcountService  {
	Vector<AcountBean> vec;
	AcountBean account;
	public AcountServiceImp(){ 
		vec=new Vector<>(10,10);
		account=new AcountBean();
	}
	@Override
	public void AcountCreate(AcountBean bean) {
		// 계좌계설
	 	int random=(int)(Math.random()*99999999+10000000);
		bean.setAcountNo(random);
		
		Calendar now=Calendar.getInstance();
		
		int yy=now.get(now.YEAR);
		int mm=now.get(now.MONTH)+1;
		int dd=now.get(now.DAY_OF_MONTH);
		
		String todaytime=yy+"년"+mm+"월"+dd+"일";
		bean.setDate(todaytime);
		vec.add(bean);
				
	}

	@Override
	public Vector<AcountBean> list() {
		//계좌 전체목록
		System.out.println("====list: "+vec.toString());
		return vec;
	}

	@Override
	public Vector<AcountBean> findByName(String name) {
		// 이름으로 검색(동명이인허용)
		name="";
/*		Vector<AcountBean> temp=new Vector<AcountBean>(10,10);
		for(int i=0;i<123123123;i++){
			if (get(i)==arr[i]){
				
			}
		}*/
		return null;
	}

	@Override
	public AcountBean findByNum(int acountNo) {
		// 계좌번호로 조회
		return null;
	}

	@Override
	public int Count() {
		// 전체계좌수
		return vec.size();
	}

	@Override
	public void updatePass(AcountBean bean) {
		// 비번변경
		
	}

	@Override
	public void updateIb(AcountBean bean) {
		// 예금입금
		
	}

	@Override
	public void updatecul(AcountBean bean) {
		// 출금
		
	}

	@Override
	public void Delete(String acountNo) {
		// 계좌혜지
		
	}

	
	
}
