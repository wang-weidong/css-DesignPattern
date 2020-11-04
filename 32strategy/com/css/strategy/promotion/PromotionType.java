package com.css.strategy.promotion;

/**
 * 促销类型服务辅助类
 */
public enum PromotionType {

	CASHNORMAL(1, CashNormal.class, "原价"), 
	CASHREBATE(2, CashRebate.class, "打折"), 
	CASHRETURN(3, CashReturn.class, "满减");

	private Integer code;

	private Class<?> clazz;

	private String description;

	PromotionType(Integer code, Class<?> clazz, String description) {
		this.code = code;
		this.clazz = clazz;
		this.description = description;
	}

	public Class<?> getClazz() {
		return clazz;
	}

	public Integer getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

}
