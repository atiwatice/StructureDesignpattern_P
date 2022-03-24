package com.decorator.test;

public class Cheese extends PizzaDecorator{

	private final Pizza pizza;

	public Cheese(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDesc() {
		return pizza.getDesc() + " Cheese 20";
	}
	
	@Override
	public double getPrice() {
		return pizza.getPrice() + 20;
	}
}
