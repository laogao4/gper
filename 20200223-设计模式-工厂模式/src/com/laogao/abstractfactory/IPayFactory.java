package com.laogao.abstractfactory;

import com.laogao.common.IPay;

public interface IPayFactory {
	
	public IPay getPay();
	
	public ICustomerService getCustomerService();
}
