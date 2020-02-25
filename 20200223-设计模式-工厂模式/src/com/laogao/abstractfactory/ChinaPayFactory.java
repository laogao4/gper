package com.laogao.abstractfactory;

public abstract class ChinaPayFactory implements IPayFactory{

	/**
	 * 判断支付环境，如果在国内，则可以获取pay对象，否则无法获取
	 * @return
	 */
	public boolean isInChina() {
		return true;
	}
		
}
