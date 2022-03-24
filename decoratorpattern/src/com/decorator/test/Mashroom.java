package com.decorator.test;

public class Mashroom extends PizzaDecorator{

	public final Pizza pizza;

	public Mashroom(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDesc() {
		return pizza.getDesc() + " Mashroom 90";
	}
	
	@Override
	public double getPrice() {
		return pizza.getPrice() + 90;
	}
}
