package com.css.strategy.promotion;

import java.math.BigDecimal;

/**
 * 促销抽象策略类
 */
public interface IPromotionStrategy {

	/**
	 * 计算逻辑
	 */
	public BigDecimal promotionAlgorithm();

	/**
	 * 存入价钱
	 * 
	 * @param price
	 */
	public void setPrice(BigDecimal price);
}
