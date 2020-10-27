package com.css.strategy.promotion;

import java.math.BigDecimal;

/**
 * 测试
 */
public class Test {

	public static void main(String[] args) {
		// 初始化上下文
		PromotionContext context = new PromotionContext();

		// 测试无促销
		context.newPromotion(PromotionType.CASHNORMAL);
		context.setPrice(new BigDecimal("200"));
		BigDecimal price = context.getPrice();
		System.out.println(price);

		// 测试打折
		context.newPromotion(PromotionType.CASHREBATE, new BigDecimal("0.8"));
		context.setPrice(new BigDecimal("200"));
		price = context.getPrice();
		System.out.println(price);

		// 测试满减
		context.newPromotion(PromotionType.CASHRETURN, new BigDecimal("400"), new BigDecimal("100"));
		context.setPrice(new BigDecimal("500"));
		price = context.getPrice();
		System.out.println(price);

		context.setPrice(new BigDecimal("399"));
		price = context.getPrice();
		System.out.println(price);

	}
}
