package com.css.memento.base;

/**
 * 真正的备忘录对象，实现备忘录窄接口 实现成私有的内部类，不让外部访问 本例实现包内访问
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
class MementoImpl implements Memento {
	private String status;

	public MementoImpl(Originator originator) {
		this.status = originator.getStatus();
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
