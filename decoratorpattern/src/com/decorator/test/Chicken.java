package com.decorator.test;

public class Chicken extends PizzaDecorator {

	public final Pizza pizza;

	public Chicken(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDesc() {
		return pizza.getDesc() + " chicken 40";
	}
	
	@Override
	public double getPrice() {
		return pizza.getPrice() + 40;
	}
}
