package com.laogao.abstractfactory;

import com.laogao.common.AliPay;
import com.laogao.common.IPay;

public class AliPayFactory extends ChinaPayFactory {

	@Override
	public IPay getPay() {
		if(isInChina()) {
			return new AliPay();
		}else {
			return null;
		}
	}

	@Override
	public ICustomerService getCustomerService() {
		return new AliCustomerService();
	}

}
