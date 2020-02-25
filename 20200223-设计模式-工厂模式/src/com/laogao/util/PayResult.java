package com.laogao.util;

import java.util.Date;

public class PayResult {
	String code;// 支付结果：0-失败，1-成功
	String msg;// 信息提示，如失败原因等
	String no;// 支付流水号
	Date date;// 支付日期

	public PayResult() {
		
	}
	public PayResult(String code, String msg, String no, Date date) {
		super();
		this.code = code;
		this.msg = msg;
		this.no = no;
		this.date = date;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
