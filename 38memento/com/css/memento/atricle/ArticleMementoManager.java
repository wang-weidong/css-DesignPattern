package com.css.memento.atricle;

import java.util.Stack;

/**
 * 备忘录管理类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class ArticleMementoManager {

	private final Stack<ArticleMemento> ARTICLE_MEMENTO_STACK = new Stack<>();

	public ArticleMemento getMemento() {
		return ARTICLE_MEMENTO_STACK.pop();
	}

	public void addMemento(ArticleMemento articleMemento) {
		ARTICLE_MEMENTO_STACK.push(articleMemento);
	}

}
