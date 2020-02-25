package com.laogao.factorymethod;

import com.laogao.common.AliPay;
import com.laogao.common.IPay;

public class AliPayFactory implements IPayFactory {

	@Override
	public IPay getPay() {
		return new AliPay();
	}

}
