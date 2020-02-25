package com.laogao.abstractfactory;

import com.laogao.util.PayResult;

/**
 * 客服
 * @author 高栋梁
 *
 */
public interface ICustomerService {
	/**
	 * 根据订单号查询支付结果
	 * @param no
	 * @return
	 */
	public PayResult getPayResultByNo(String no);
}
