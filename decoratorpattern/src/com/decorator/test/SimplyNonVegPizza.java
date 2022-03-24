package com.decorator.test;

public class SimplyNonVegPizza implements Pizza{

	@Override
	public String getDesc() {
		return "Simple non verg Pizza (350)";
	}

	@Override
	public double getPrice() {
		return 350;
	}

}
