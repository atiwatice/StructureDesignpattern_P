package com.decorator.test;

public class Broccoly extends PizzaDecorator {

	private final Pizza pizza;

	public Broccoly(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDesc() {

		return pizza.getDesc() + " Brocolli (10)";
	}

	@Override
	public double getPrice() {

		return pizza.getPrice() + 10;
	}
}
