package com.laogao.factorymethod;

import com.laogao.common.ApplePay;
import com.laogao.common.IPay;

public class ApplePayFactory implements IPayFactory {

	@Override
	public IPay getPay() {
		return new ApplePay();
	}

}
