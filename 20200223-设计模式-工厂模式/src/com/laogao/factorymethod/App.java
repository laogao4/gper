package com.laogao.factorymethod;

import java.math.BigDecimal;

import com.laogao.util.PayResult;

public class App {
	public static void main(String[] args) {
		BigDecimal money = new BigDecimal(Math.random() < 0.5 ? "-100" : "100");
		PayResult result = new AliPayFactory().getPay().pay(money);
		if ("0".equals(result.getCode())) {
			System.out.println(result.getMsg());
			result = new ApplePayFactory().getPay().pay(money);
			if ("0".equals(result.getCode())) {
				System.out.println(result.getMsg());
			} else {
				System.out.println(result.getMsg());
			}
		} else {
			System.out.println(result.getMsg());
		}
		System.out.println("支付结束");
	}
}
