package com.css.strategy.promotion;

import java.math.BigDecimal;

/**
 * 满减策略实现类
 */
public class CashReturn implements IPromotionStrategy {

	private BigDecimal price;

	private BigDecimal minPrice;

	private BigDecimal subPrice;

	public CashReturn(BigDecimal minPrice, BigDecimal subPrice) {
		this.minPrice = minPrice;
		this.subPrice = subPrice;
	}

	@Override
	public BigDecimal promotionAlgorithm() {
		if (price.compareTo(minPrice) > -1) {
			return this.price.subtract(this.subPrice);
		}
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}
