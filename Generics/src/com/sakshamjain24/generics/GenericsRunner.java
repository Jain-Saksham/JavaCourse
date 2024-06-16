package com.sakshamjain24.generics;

import java.util.ArrayList;

public class GenericsRunner {

	static <X> X doubleValue(X value) {
		return value;
	}

	public static void main(String[] args) {

		String value1 = doubleValue(new String());
		Integer number1 = doubleValue(Integer.valueOf(5));
		ArrayList list1 = doubleValue(new ArrayList());

		MyCustomList<String> list = new MyCustomList<>();
		list.addElement("Element 1");
		list.addElement("Element 2");
		String value = list.get(0);

		System.out.println(list);
		System.out.println(value);

		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(7));
		Integer number = list2.get(0);

		System.out.println(list2);
		System.out.println(number);

	}

}
