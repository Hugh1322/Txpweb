package com.txp.constants;

/**
 * Redis保存数据的key
 * 
 * Module:
 * 
 * RedisKeyConstant.java
 * 
 * @author
 * @since JDK 1.8
 * @version 1.0
 * @description: <描述>
 */
public class RedisKeyConstant {
	/**
	 * 富友银行编码
	 */
	public static final String FUIOU_BANK = "fuiou:bank";
	/**
	 * 支付明细，支付成功将支付明细放入redis，回调时保存记录BwPaymentDetail时用到，然后删除redis对应数据
	 */
	public static final String PAYMENT_DETAIL = "payment_detail:repay_id";

	/**
	 * 不允许续贷借款人，保存在redis(预留)
	 */
	public static final String NOT_CAN_XUDAI = "not_can_xudai:borrower_id";

	/**
	 * 分批还款明细
	 */
	public static final String BATCH_REPAYMENT_DETAIL = "batch_repayment_detail:order_id";

	/**
	 * 语音验证次数，每天清除
	 */
	public static final String VOICE_PHONE_COUNT = "voicePhone:count";

	/**
	 * 语音验证多少时间后能发送
	 */
	public static final String VOICE_PHONE_TIME_PRE = "voicePhone:";

	/**
	 * 语音验证码，10分钟失效
	 */
	public static final String VOICE_CODE_PRE = "voiceCode:";

	/**
	 * redis实现同步锁的key，支付时防止并发提交
	 */
	public static final String LOCK_KEY_PAY_PRE = "lock_key_pay:";

	/**
	 * redis实现同步锁的key，提交时防止并发提交
	 */
	public static final String LOCK_KEY_PRE = "lock_key:";

	/**
	 * 展期工单
	 */
	public static final String EXTEND_ORDER = "xudai:order_id";

	/**
	 * 支付信息，回调时取
	 */
	public static String PAY_INFO = "pay_info";

	/**
	 * 重新绑卡到redis
	 */
	public static String BANK_CARD_REBINDING = "BANK_CARD_REBINDING";

	/**
	 * 重新绑卡到redis
	 */
	public static String PAY_SIGN = "PAY_SIGN";

	/**
	 * 银行code和银行名称键值对redis
	 */
	public static String BANK_CODE_NAME = "fuiou:bank";

	/**
	 * 保存BwPayLog失败存redis
	 */
	public static final String PAY_LOG_FAIL = "PAY_LOG_FAIL";

	/**
	 * 口袋处理中
	 */
	public static final String KOUDAI_PROCESS = "koudai_process";

	/**
	 * 易宝处理中
	 */
	public static final String YEEPAY_PROCESS = "yeepay_process";

	/**
	 * 还款完成修改用户状态
	 */
	public final static String USER_TYPE_CHANGE_KEY = "userService:userTypeChangeKey:";

	/**
	 * 处理中前缀
	 */
	public final static String PAY_PROCESS_PRE = "pay_process:";

	/**
	 * 支付处理中
	 */
	public final static String PAY_PROCESS = "pay_process";

	/**
	 * 代扣队列，定时器查询
	 */
	public final static String WITHHOLD_ID_QUEUE = "withhold_id_queue";

	/**
	 * 代扣HASH，定时器查询
	 */
	public final static String WITHHOLD_ID_QUERY = "withhold_id_query";

	/**
	 * 宝付代扣商户订单，定时器查询
	 */
	public final static String BAOFOO_WITHHOLD_QUERY = "baofoo_withhold_query";

	/**
	 * 代扣验证码，开户，绑卡相关字段
	 */

	/**
	 * 代扣类型和需要开户的回参信息
	 */
	public final static String CODE_MESSAGE = "CODE_MESSAGE";

	public final static String PRECODE = "PRECODE";// 前置码

	public final static String ELECTRONIC_ACCOUNT = "ELECTRONIC_ACCOUNT";// 用户工单的资金方账号

	public final static String AVAILABLE_CAPITAL = "AVAILABLE_CAPITAL";// 可用的资金方

	/**
	 * 支付宝支付订单，定时器查询
	 */
	public final static String ALI_PAY_QUERY = "ali_pay_query";

	/**
	 * 微信支付订单，定时器查询
	 */
	public final static String WECHAT_PAY_QUERY = "wechat_pay_query";

	/**
	 * 三方提供的签约调用地址key
	 */
	public final static String API_RETURN_URL = "API_RETURN_URL";

	public final static String BIND_BANK_UNIQUE_CODE_PRE = "bind_bank_unique_code:";

	/**
	 * 宝付代扣支持银行
	 */
	public final static String BAOFOO_WITHHOLD_SUPPORT_BANK = "baofoo_withhold_support_bank";

}