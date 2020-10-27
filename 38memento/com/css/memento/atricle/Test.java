package com.css.memento.atricle;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Test {

	public static void main(String[] args) {
		// 创建备忘录管理
		ArticleMementoManager articleMementoManager = new ArticleMementoManager();

		Article article = new Article("design-pattern1", "memento1", "memento1");
		System.out.println(article.toString());

		ArticleMemento articleMemento = article.saveToMemento();
		articleMementoManager.addMemento(articleMemento);

		article.setTitle("design-pattern2");
		article.setContent("memento2");
		article.setImages("memento2");
		System.out.println(article);

		articleMemento = article.saveToMemento();
		articleMementoManager.addMemento(articleMemento);

		article.setTitle("design-pattern3");
		article.setContent("memento3");
		article.setImages("memento3");
		System.out.println(article.toString());

		// 未存备份

		System.out.println("pop stack 1.");
		articleMemento = articleMementoManager.getMemento();
		article.undoFromMemento(articleMemento);

		System.out.println(article.toString());

		System.out.println("pop stack 2.");
		articleMemento = articleMementoManager.getMemento();
		article.undoFromMemento(articleMemento);

		System.out.println(article.toString());
	}
}
