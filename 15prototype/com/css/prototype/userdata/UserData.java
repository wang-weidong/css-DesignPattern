package com.css.prototype.userdata;

import java.io.Serializable;
import java.util.ArrayList;

import com.css.prototype.DeepCloneUtil;

@SuppressWarnings("serial")
public class UserData implements Serializable, Cloneable {
	// 定义一个私有变量
	private ArrayList<String> arrayList = new ArrayList<String>();

	@Override
	public UserData clone() {
		UserData thing = null;
		try {
			thing = (UserData) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return thing;
	}

	public UserData deepClone1() {
		return DeepCloneUtil.deepClone(this);
	}

	@SuppressWarnings("unchecked")
	public UserData deepClone2() {
		UserData data = null;
		try {
			data = (UserData) super.clone();
			data.arrayList = (ArrayList<String>) this.arrayList.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return data;
	}

	// 设置HashMap的值
	public void setValue(String value) {
		this.arrayList.add(value);
	}

	// 取得arrayList的值
	public ArrayList<String> getValue() {
		return this.arrayList;
	}

}
