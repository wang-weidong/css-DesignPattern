package com.css.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 序列化深拷贝demo
 * 
 * @author CSS. WangWeidong
 */
public class DeepCloneUtil {
	@SuppressWarnings("unchecked")
	public static <T> T deepClone(T objct) {
		try {
			// 将对象写入流中
			ByteArrayOutputStream bao = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(bao);
			oos.writeObject(objct);

			// 将对象从流中取出
			ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bis);
			return (T) ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
