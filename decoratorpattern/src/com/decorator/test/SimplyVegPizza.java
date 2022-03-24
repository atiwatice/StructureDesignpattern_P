package com.decorator.test;

public class SimplyVegPizza implements Pizza{

	@Override
	public String getDesc() {
		return "Simplyveg pizza (230)";
	}

	@Override
	public double getPrice() {
		return 230;
	}

}
