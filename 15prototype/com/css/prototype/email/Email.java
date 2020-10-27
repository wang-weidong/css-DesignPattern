package com.css.prototype.email;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import com.css.prototype.DeepCloneUtil;

/**
 * 邮件类，注意要实现 Serializable接口序列化， 实现Cloneable接口
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
@SuppressWarnings("serial")
public class Email implements Serializable, Cloneable {
	private String title;
	private Date date;
	private ArrayList<String> userList = new ArrayList<String>();
	private Attachment attachment = null;

	public Email(String title) {
		this.title = title;
		this.attachment = new Attachment();
	}

	public String toString() {
		return "Title:\t" + title + "\nDate:\t" + date + "\nUser:\t" + userList + "\nAttach:\t"
				+ attachment.getAttachTitle();
	}

	public void addUser(String user) {
		userList.add(user);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public ArrayList<String> getUserList() {
		return userList;
	}

	public Attachment getAttachment() {
		return this.attachment;
	}

	public void display() {
		System.out.println("查看邮件");
	}

	public Email clone() {
		Email clone = null;
		try {
			clone = (Email) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Clone failure!");
		}
		return clone;
	}

	public Email deepClone() {
		return DeepCloneUtil.deepClone(this);
	}

}