package com.css.memento.atricle;

/**
 * 文章类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Article {

	// 标题
	private String title;

	// 内容
	private String content;

	// 图片
	private String images;

	public Article(String title, String content, String images) {
		this.title = title;
		this.content = content;
		this.images = images;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public ArticleMemento saveToMemento() {
		return new ArticleMementoImpl(this);
	}

	public void undoFromMemento(ArticleMemento articleMemento) {
		ArticleMementoImpl memento = (ArticleMementoImpl) articleMemento;
		this.title = memento.getTitle();
		this.content = memento.getContent();
		this.images = memento.getImages();
	}

	@Override
	public String toString() {
		return "Article{" + "title='" + title + '\'' + ", content='" + content + '\'' + ", images='" + images + '\''
				+ '}';
	}
}
