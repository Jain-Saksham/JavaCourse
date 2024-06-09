package com.sakshamjain24.loops;

public class MyNumber {

	private int number;

	public MyNumber(int number) {
		this.number = number;
	}

	public boolean isPrime() {
		int countDiv = 0;

		for (int i = 2; i <= number; i++) {
			if (number % i == 0)
				countDiv++;
		}
		if (countDiv == 1)
			return true;
		return false;
	}

	public int sumUptoN() {

		return number * (number + 1) / 2;
	}

	public int sumOfDivisors() {
		int sum = 0;
		for (int i = 2; i < number; i++) {
			if (number % i == 0)
				sum += i;
		}
		return sum;
	}

	public void printANumberTriangle() {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
