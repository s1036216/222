package com.hanbit.oop.serviceImpl;

public class BMIsevisce {

	private double height, weight, bmi;
	private String result;

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public void setB() {
		this.bmi = weight / (height * height);
	}

	public double getB() {
		return bmi;
	}

	public void setBmi() {

		if (30.0 < bmi) {
			result = "비만";
		} else if (25.0 <= bmi) {
			result = "과체중";
		} else if (18.5 <= bmi) {
			result = "정상";
		} else {
			result = "저체중";
		}
	}

	public String getBmi() {
		return result;
	}

}
