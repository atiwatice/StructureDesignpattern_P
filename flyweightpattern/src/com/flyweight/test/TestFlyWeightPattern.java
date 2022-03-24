package com.flyweight.test;

public class TestFlyWeightPattern {

	public static void main(String[] args) {
		Code code = new Code();
		code.setCode("Javacode .....");
		Platform platform= PlatformFactory.getPlatformInstance("JAVA");
		platform.execute(code);
		
		Code code1 = new Code();
		code.setCode("Javacode 1 .....");
		platform= PlatformFactory.getPlatformInstance("JAVA");
		platform.execute(code1);
	}
}
