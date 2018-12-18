package com.txp.common.dto;

import com.txp.common.constants.AppResponseResultConstant;
import com.txp.common.constants.AppResultConstant;
import com.wordnik.swagger.annotations.ApiModel;

import java.io.Serializable;

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
public class AppResult<T> implements Serializable{

	private static final long serialVersionUID = -261459335181267758L;

	public AppResult(){
		this.code = AppResultConstant.SUCCESS;
		this.msg = "";
	}

	/**
	 * 服务器响应编号
	 */
	private String code;
	/**
	 * 服务器响应消息
	 */
	private String msg;

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}

	/**
	 * 服务器响应结果对象
	 */

	private T result;

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

	public boolean isSuccess(){
		return AppResponseResultConstant.SUCCESS.equals(code);
	}

}
