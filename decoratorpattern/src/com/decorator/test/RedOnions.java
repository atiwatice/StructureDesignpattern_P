package com.decorator.test;

public class RedOnions extends PizzaDecorator{

	public final Pizza pizza;

	public RedOnions(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDesc() {
		return pizza.getDesc() + " RedOnions 60";
	}
	
	@Override
	public double getPrice() {
		return pizza.getPrice() + 60;
	}
}
