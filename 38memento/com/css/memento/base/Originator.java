package com.css.memento.base;

/**
 * 发起人类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Originator {
	/**
	 * 状态编码
	 */
	private String status;
	private Memento memento;

	public Originator(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * 创建备忘录
	 * 
	 * @return
	 */
	public Memento createMemento() {
		memento = new MementoImpl(this);
		return memento;
	}

	/**
	 * 回滚
	 * 
	 * @param memento
	 */
	public void restoreMemento(Memento memento) {
		MementoImpl mementoImpl = (MementoImpl) memento;
		this.status = mementoImpl.getStatus();
	}
}
