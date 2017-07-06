package com.hanbit.oop.serviceImpl;


public class ClockService {
	public String execute4(int time) {

		int hour = 0, min = 0, sec = 0;
		hour = time / 3600;

		min = (time - (hour * 3600)) / 60;

		sec = (time - (hour * 3600)) - (min * 60);

		String re= (hour + "시간" + min + "분" + sec + "초\n");

		return re;
	}
}