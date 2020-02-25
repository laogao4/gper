package com.laogao.common;

import java.math.BigDecimal;

import com.laogao.util.PayResult;

public interface IPay {
	
	/**
	 * 支付一个金额
	 * @param money
	 * @return
	 */
	public PayResult pay(BigDecimal money);
}
