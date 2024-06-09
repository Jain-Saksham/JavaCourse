package com.sakshamjain24.primitiveDataTypes;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

	private BigDecimal principal;
	private BigDecimal rate;

	public SimpleInterestCalculator(String principal, String rate) {
		this.principal = new BigDecimal(principal);
		this.rate = new BigDecimal(rate).divide(new BigDecimal(100));
	}

	public BigDecimal calculateTotalValue(int time) {

		BigDecimal amount = principal.add(principal.multiply(rate.multiply(new BigDecimal(time))));
		return amount;
	}

}
