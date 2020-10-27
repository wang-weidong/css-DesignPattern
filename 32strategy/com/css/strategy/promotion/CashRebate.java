package com.css.strategy.promotion;

import java.math.BigDecimal;

/**
 * 打折策略实现类
 */
public class CashRebate implements IPromotionStrategy {

	private BigDecimal price;

	private BigDecimal rate;

	public CashRebate(BigDecimal rate) {
		this.rate = rate;
	}

	@Override
	public BigDecimal promotionAlgorithm() {
		return this.price.multiply(this.rate);
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}
