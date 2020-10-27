package com.css.bridge.login02;

/**
 * 人脸识别方式认证实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class FaceAuth implements IAuthMode {

	@Override
	public boolean checkAccount() {
		System.out.print("人脸识别方式: ");
		return User.getUser() == null;
	}
}
