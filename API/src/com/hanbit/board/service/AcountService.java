package com.hanbit.board.service;

import java.util.Vector;

import com.hanbit.board.domain.AcountBean;

public interface AcountService {

	public void AcountCreate(AcountBean bean);
	public Vector<AcountBean>  list();
	public Vector<AcountBean> findByName(String name);
	public AcountBean findByNum(int acountNo);
	public int Count();
	public void updatePass(AcountBean bean);
	public void updateIb(AcountBean bean);
	public void updatecul(AcountBean bean);
	public void Delete(String acountNo);
}
