package com.sakshamjain24.consumer;

import java.util.List;
import java.util.logging.Logger;

import com.sakshamjain24.sorting.algorithm.BubbleSort;

public class DirectConsumer {

	private static Logger logger = Logger.getLogger(DirectConsumer.class.getName());

	public static void main(String[] args) {
		BubbleSort util = new BubbleSort();
		List<String> sorted = util.sort(List.of("Saksham", "Vashu", "Aman"));
		logger.info(sorted.toString());
	}

}
