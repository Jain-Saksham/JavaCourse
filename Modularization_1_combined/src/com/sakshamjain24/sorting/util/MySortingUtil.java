package com.sakshamjain24.sorting.util;

import java.util.List;

import com.sakshamjain24.sorting.algorithm.BubbleSort;

public class MySortingUtil {
	public List<String> sort(List<String> names) {
		BubbleSort bubbleSort = new BubbleSort();
		return bubbleSort.sort(names);
	}
}
