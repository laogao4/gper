package com.laogao.simplefactory;

import java.math.BigDecimal;

import com.laogao.common.AliPay;
import com.laogao.common.ApplePay;
import com.laogao.util.PayResult;

public class App {
	public static void main(String[] args) {
		BigDecimal money = new BigDecimal(Math.random() < 0.5 ? "-100" : "100");
		PayResult result = PayFactory.getPay(AliPay.class).pay(money);
		if ("0".equals(result.getCode())) {
			System.out.println(result.getMsg());
			result = PayFactory.getPay(ApplePay.class).pay(money);
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
