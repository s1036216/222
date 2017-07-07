package com.hanbit.Member.Service;

import com.hanbit.Member.Domain.MemberBean;

public interface MemberService {
	public void add(MemberBean bean);
	public MemberBean[] list();
	public MemberBean[] findByName(String name);
	public MemberBean findById(String id);
	public int count();
	public void update(MemberBean bean);
	public void delete(String id);
}
