package com.css.strategy.promotion;

import java.math.BigDecimal;

/**
 * 原价策略实现类
 */
public class CashNormal implements IPromotionStrategy {

	private BigDecimal price;

	@Override
	public BigDecimal promotionAlgorithm() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}
