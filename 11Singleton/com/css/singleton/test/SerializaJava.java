package com.css.singleton.test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class SerializaJava {
	public static byte[] serialize(Object data) {
		ByteArrayOutputStream bos = null;
		byte[] out = null;
		try {
			bos = new ByteArrayOutputStream();
			(new ObjectOutputStream(bos)).writeObject(data);
			out = bos.toByteArray();
			bos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return out;
	}

	public static Object deserialize(byte[] data) {
		if (data == null)
			return null;
		Object obj = null;
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new ByteArrayInputStream(data));
			obj = ois.readObject();
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}

}
