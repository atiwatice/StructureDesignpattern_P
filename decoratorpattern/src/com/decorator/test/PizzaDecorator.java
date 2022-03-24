package com.decorator.test;

class PizzaDecorator implements Pizza {

	@Override
	public String getDesc() {
		
		return "Toppings ";
	}

	@Override
	public double getPrice() {
		return 0;
	}



}
