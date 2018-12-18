package com.txp.common.dto;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "UserDto", description = "用户对象封装")
public class UserDto implements Serializable {
	private static final long serialVersionUID = 845858644789842373L;

	@ApiModelProperty(value = "用户ID")
	private Long id;
	@ApiModelProperty(value = "手机号")
	private String phone;
	@ApiModelProperty(value = "密码")
	private String password;
	@ApiModelProperty(value = "设备号")
	private String mobileSeq;
	@ApiModelProperty(value = "验证码")
	private String phoneCode;
	@ApiModelProperty(value = "邀请码")
	private String inviteCode;
	@ApiModelProperty(value = "借款人Id")
	private Long borrowerId;
	@ApiModelProperty(value = "是否支持分期")
	private boolean installment;

}
