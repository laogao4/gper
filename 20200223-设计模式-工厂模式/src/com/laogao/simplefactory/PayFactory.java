package com.laogao.simplefactory;

import com.laogao.common.IPay;

public class PayFactory {
	public static IPay getPay(Class<? extends IPay> clazz ) {
		try {
			return clazz.newInstance();
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}
