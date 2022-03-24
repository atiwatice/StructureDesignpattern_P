package com.flyweight.test;

import java.util.HashMap;
import java.util.Map;

public final class PlatformFactory {

	private static Map<String, Platform> map = new HashMap<>();

	private PlatformFactory() {
		throw new AssertionError("Cannot instantiate the object of factory");
	}

	public static Platform getPlatformInstance(String platforType) {
		Platform platform = map.get(platforType);
		if (platform == null) {
			System.out.println("inside the switch case");
			switch (platforType) {

			case "JAVA":
				platform = new JavaPlatform();
				break;
			case "CPP":
				platform = new CPPPlatform();
				break;
			}
			map.put(platforType, platform);

		}
		return platform;

	}

}
