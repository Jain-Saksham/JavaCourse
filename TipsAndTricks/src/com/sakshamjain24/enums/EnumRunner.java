package com.sakshamjain24.enums;

import java.util.Arrays;

enum Season {
//	WINTER, SPRING, SUMMER, FALL;
	// 0,1,2,3

	WINTER(1), SPRING(2), SUMMER(3), FALL(4);

	private int value;

	private Season(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}

public class EnumRunner {

	public static void main(String[] args) {
//		String season = "Garbage";
		Season season = Season.FALL;
		System.out.println(season);
		Season season1 = Season.valueOf("WINTER");
		System.out.println(season1);
		System.out.println(season1.ordinal());
		System.out.println(season1.getValue());
		System.out.println(Arrays.toString(Season.values()));
	}

}
