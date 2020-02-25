package com.laogao.common;

import java.math.BigDecimal;
import java.util.Date;

import com.laogao.util.PayResult;

public class ApplePay implements IPay {

	static long count = 0;

	@Override
	public synchronized PayResult pay(BigDecimal money) {
		if (money.compareTo(new BigDecimal(0)) < 0) {
			return new PayResult("0", "苹果支付失败：金额不能小于0", "apple" + (count++), new Date());
		} else {
			return new PayResult("1", "苹果支付成功,支付金额:" + money.toPlainString() + "元", "apple" + (count++), new Date());
		}

	}

}
