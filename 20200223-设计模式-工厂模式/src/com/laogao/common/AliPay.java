package com.laogao.common;

import java.math.BigDecimal;
import java.util.Date;

import com.laogao.util.PayResult;

public class AliPay implements IPay {

	static long count = 1;
	
	@Override
	public synchronized PayResult pay(BigDecimal money) {
		if(money.compareTo(new BigDecimal(0))<0) {
			return new PayResult("0","阿里支付失败：金额不能小于0","ali"+(count++),new Date());
		}else {
			return new PayResult("1","阿里支付成功,支付金额:"+money.toPlainString()+"元","ali"+(count++),new Date());
		}
	}
}
