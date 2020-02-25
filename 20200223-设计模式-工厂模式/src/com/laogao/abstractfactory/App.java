package com.laogao.abstractfactory;

import java.math.BigDecimal;

import com.laogao.common.IPay;
import com.laogao.util.PayResult;

public class App {
	public static void main(String[] args) {
		BigDecimal money = new BigDecimal(Math.random() < 0.5 ? "-100" : "100");
		IPayFactory alipayFactory = new AliPayFactory();
		IPay pay = alipayFactory.getPay();
		ICustomerService cs = alipayFactory.getCustomerService();
		PayResult result = pay.pay(money);
		if ("0".equals(result.getCode())) {
			System.out.println(result.getMsg());
		} else {
			System.out.println(result.getMsg());
		}
		System.out.println("支付结束");
		//查询支付结果
		cs.getPayResultByNo(result.getCode());
	}
}
