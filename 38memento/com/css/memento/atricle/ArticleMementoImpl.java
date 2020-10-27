package com.css.memento.atricle;

/**
 * 备忘录类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
class ArticleMementoImpl implements ArticleMemento {

	private String title;

	private String content;

	private String images;

	public ArticleMementoImpl(Article article) {
		this.title = article.getTitle();
		this.content = article.getContent();
		this.images = article.getImages();
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public String getImages() {
		return images;
	}

	@Override
	public String toString() {
		return "ArticleMemento{" + "title='" + title + '\'' + ", content='" + content + '\'' + ", images='" + images
				+ '\'' + '}';
	}
}
