package com.decorator.test;

public class TestDecorator {

	public static void main(String[] args) {
		
		Pizza pizza = new SimplyVegPizza();
		pizza= new Mashroom(pizza);
		pizza= new Chicken(pizza);
		pizza= new Cheese(pizza);
		
		System.out.println("Desc of the Pizza--> "+pizza.getDesc());
		System.out.println("Price of the Pizza--> "+pizza.getPrice());
	}
}
