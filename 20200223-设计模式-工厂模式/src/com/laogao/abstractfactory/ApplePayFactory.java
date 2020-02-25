package com.laogao.abstractfactory;

import com.laogao.common.ApplePay;
import com.laogao.common.IPay;

public class ApplePayFactory extends ForeignPay{

	@Override
	public IPay getPay() {
		return new ApplePay();
	}

	@Override
	public ICustomerService getCustomerService() {
		return new AppleCustomerService();
	}

	
}
