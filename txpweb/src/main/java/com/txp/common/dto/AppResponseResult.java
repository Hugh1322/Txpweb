package com.txp.common.dto;

import com.wordnik.swagger.annotations.ApiModel;

/**
 * Api操作结果
 * 
 * 
 * Module:
 * 
 * AppResponseResult.java
 * 
 * @author th
 * @since JDK 1.8
 * @version 1.0
 * @description: <描述>
 */
@ApiModel(value = "接口操作结果")
public class AppResponseResult {

	/**
	 * 服务器响应编号
	 */
	private String code;
	/**
	 * 服务器响应消息
	 */
	private String msg;
	/**
	 * 服务器响应结果对象
	 */
	private Object result;

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

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

}
