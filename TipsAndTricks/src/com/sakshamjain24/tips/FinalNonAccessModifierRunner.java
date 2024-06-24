package com.sakshamjain24.tips;

// final class cannot be extended
final class FinalClass {

}

class SomeClass {
	// final method can not be overridden
	final public void doSomething() {

	}
}

public class FinalNonAccessModifierRunner {

	public static void main(String[] args) {
		// value can not be assigned again
		final int i = 5;
	}

}
