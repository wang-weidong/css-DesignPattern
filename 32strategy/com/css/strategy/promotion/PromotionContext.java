package com.css.strategy.promotion;

import java.math.BigDecimal;

/**
 * 环境类
 */
public class PromotionContext {
	/**
	 * 组合策略类
	 */
	private IPromotionStrategy promotionStrategy;

	/**
	 * 获取促销后价钱
	 * 
	 * @return
	 */
	public BigDecimal getPrice() {
		return this.promotionStrategy.promotionAlgorithm();
	}

	/**
	 * 设置打折前的价格
	 * 
	 * @param price
	 */
	public void setPrice(BigDecimal price) {
		this.promotionStrategy.setPrice(price);
	}

	/**
	 * 创建促销手段
	 * 
	 * @param code 对应促销模式编码
	 * @param args 对应促销参数
	 */
	public void newPromotion(PromotionType type, Object... args) {
		try {
			// 根据促销模式编码获取促销模式对应类名称
			Class<?> clazz = type.getClazz();
			// 通过反射获取促销模式的对象
			this.promotionStrategy = (IPromotionStrategy) clazz.getDeclaredConstructor(getClasses(args))
					.newInstance(args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 获取Class
	 * 
	 * @param args
	 * @return
	 */
	private Class<?>[] getClasses(Object... args) {
		Class<?>[] classes = new Class[args.length];
		for (int i = 0; i < args.length; i++) {
			classes[i] = args[i].getClass();
		}
		return classes;
	}

}
