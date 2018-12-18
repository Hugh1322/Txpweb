package com.txp.common.constants;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回码统一定义 Created by th on 2017/8/10.
 */
public abstract class AppResultConstant {


    public static Map<String, String> map = new HashMap<>();

	public final static String NOT_LOGIN = "-111";

	public final static String SUCCESS = "000";
	public final static String FAIL = "111";
	public final static String CATCH = "101";
	public final static String PHONE_TIME_PER = "102";
	public final static String PHONE_TIME_COUNT = "103";
	public final static String ORDER_PROCESS = "106";
	public final static String PHONE_VOICE_ERROR = "108";
	public final static String BORROWER_NOT_LOGIN = "109";
	public final static String RELOGIN = "110";
	public final static String BANK_NULL = "112";
	public final static String IDCARD_INVALID = "113";
	public final static String BANK_CARD_INVALID = "114";
	public final static String REAL_NAME_INVALID = "115";
	public final static String BANK_CARD_SAME = "116";
	public final static String IDCARD_EXIST = "117";
	public final static String BANK_CARD_NOT_SUPPORT = "118";
	public final static String BANK_CARD_CHANGE_LIMIT = "119";
	public final static String ORDER_NOT_EXIST = "120";
	public final static String ORDER_NOT_REPAYMENT = "121";
	public final static String BANK_CARD_NOT_SIGN = "122";
	public final static String PAY_THREE_FAIL = "123";
	public final static String PHONE_EXIST = "124";
	public final static String SERVER_EXCEPTION = "125";
	public final static String BANK_CARD_NOT_BIND = "126";
	public final static String ORDER_AUDIT = "127";
	public final static String ORDER_REJECT_RECORD_NULL = "128";
	public final static String ORDER_RONG_NULL = "129";
	public final static String ORDER_OVERDUE_NULL = "130";
	public final static String ORDER_REPAYMENT_PLAN_NULL = "131";
	public final static String ORDER_NULL = "132";
	public final static String ORDER_BATCH_NOT_EXTEND = "133";
	public final static String LOAN_DAY_NOT_EXTEND = "134";
	public final static String OVERDUE_DAY_NOT_EXTEND = "135";
	public final static String REPAYMENT_GT_LEFT = "136";
	public final static String NEED_REPAYMENT_LEFT = "137";
	public final static String REPAYMENT_GT_MIN = "138";
	public final static String ORDER_UN_SINGLE_NOT_EXTEND = "139";
	public final static String ID_CARD_HAS_USED = "140";
	public final static String SERVER_NOT_FOUND = "141";
	public final static String ORDER_NOT_SINGLE = "142";
	public final static String ORDER_NOT_INSTALLMENT = "143";
	public final static String SIGN_FAIL = "144";
	public final static String REPEAT_NOTIFY = "145";
	public final static String BANK_CARD_ONESELF = "146";
	public final static String BANK_AUDIT_CANNOT_REBIND = "147";
	public final static String NOT_ONESELF_OPERATION = "148";
	public final static String NOT_ALI_PAY = "149";
	public final static String NOT_WEIXIN_PAY = "150";
	public final static String NOT_SUPPORT_EXTEND = "151";
	public final static String PARAM_MISSING = "152";
	public final static String PARAM_ERROR = "153";
	public final static String DATA_PARSE_FAIL = "154";
	public final static String REPEAT_OPERATOR = "155";
	public final static String IP_LIMIT = "156";
	public final static String PHONE_FORMAT_WRONG = "157";
	public final static String ORDER_STATUS_ERROR = "158";
	public final static String SHOPPING_CART_NULL = "159";
	public final static String SHOPPING_CART_ADD_FAIL = "160";
	public final static String SHOPPING_CART_DEL_FAIL = "161";
	public final static String SHOPPING_CART_EMPTY_FAIL = "162";
	public final static String UPDATE_DATABASE_FAIL = "163";
	public final static String CANT_AUDIT = "164";
	public final static String SHOPPING_CART_CHANGE_FAIL = "165";
	public final static String SHOPPING_CART_DEL_LIST_NULL = "166";
	public final static String SIGN_NULL = "167";
	public final static String MD5_EXCEPTION = "168";

	public final static String SMS_SEND_FAIL = "201";

	public final static String REQUEST_LOCK = "300";
	public final static String ACTIVITY_TYPE_NULL = "301";
	public final static String ACTIVITY_NOT_EXIST = "302";
	public final static String ACTIVITY_SHARE_ERROR = "303";
	public final static String ACTIVITY_NOT_START = "304";
	public final static String ACTIVITY_HAS_END = "305";
	public final static String ACTIVITY_NO_CHANCE = "306";
	public final static String ACTIVITY_COUNT_LIMIT = "307";
	public final static String ACTIVITY_PARAM_ERROR = "308";
	public final static String ACTIVITY_UPDATE_STATUS_FAIL = "309";
	public final static String ACTIVITY_DISCOUNT_DISTRIBUTE_NOT_EXIST = "310";
	public final static String ACTIVITY_DISCOUNT_INFO_NOT_EXIST = "311";
	public final static String ACTIVITY_PRODUCT_NUM_ERROR = "312";
    public final static String  ACTIVITY_PARAMS_NULL  = "313";
	public final static String  ACTIVITY_TIME_NULL  = "314";
	public final static String  ACTIVITY_TIME_CONFLICT  = "315";
	public final static String ACTIVITY_TYPE_ERROR = "316";
	public final static String ACTIVITY_TIME_ERROR = "317";
	public final static String ACTIVITY_ID_NONE = "318";
	public final static String ACTIVITY_NEWUSER_NONE = "319";
	public final static String ACTIVITY_PRODUCT_EXIST = "320";
	public final static String ACTIVITY_PRODUCT_NUM_STOCK_ERROR = "321";
	public static final String ACTIVITY_SKU_LOCK_ERROR = "322";
	public static final String ACTIVITY_WC_USER_EXIST = "323";
	public static final String ACTIVITY_WC_USER_SENSITIVE = "324";
	public static final String ACTIVITY_WC_TIME_ERROR = "325";


	public final static String PHONE_NULL = "401";
	public final static String LOGINNAME_NULL = "409";
	public final static String PWD_NULL = "402";
	public final static String PWD_DIFFER = "403";
	public final static String PHONE_CODE_NULL = "404";
	public final static String PHONE_CODE_BINDING = "405";
	public final static String VERIFY_CODE_NULL = "406";
	public final static String VERIFY_CODE_ERROR = "407";
	public final static String BORROWER_ID_NULL = "408";
	public final static String BORROWER_NULL = "410";
	public final static String PWD_OLD_EQUALS_NEW = "413";
	public final static String REGIST_FAIL = "414";
	public final static String INVITATION_ERROR = "415";
	public final static String PHONE_HAS_REGIST = "416";
	public final static String PWD_ERROR = "417";
	public final static String PWD_UPDATE_FAIL = "418";
	public final static String PWD_RESET_FAIL = "419";
	public final static String STATUS_FORBIDDEN = "420";
	public final static String TOKEN_NULL = "421";
	public final static String OLD_PWD_NULL = "422";
	public final static String NEW_PWD_NULL = "423";
	public final static String TOKEN_EXPIRED = "424";
	public final static String LOGIN_FAIL = "450";
	public final static String LOGIN_NAME_NULL = "451";
	public final static String MERCHANT_NULL = "452";
	public final static String PWD_LENGTH_ERROR = "453";
	public final static String PHONE_NOT_REGIST = "454";
	public final static String IDCARD_CODE_BINDING = "455";
	public final static String ORGANIZATION_NULL = "456";
	public final static String VERIFY_CODE_EXPIRE = "457";
	public final static String VERIFY_CODE_SEND_AGAIN = "458";
	public final static String BIND_CARD_FAIL = "459";
	public final static String OLD_PRODUCT_NOT_PAY = "460";
	public final static String PERSION_QQ_NOT_VALID = "461";

	public final static String CHANNEL_CODE_NULL = "501";
	public final static String CHANNEL_CODE_BUSY = "502";
	public final static String CHANNEL_CODE_OVER = "503";
	public final static String PAGE_TOKEN_NULL = "504";
	public final static String PAGE_TOKEN_ERROR = "505";
	public final static String CHANNEL_NULL = "506";
	public final static String CHANNEL_VALID_ERROR = "507";
	public final static String TOKEN_VALID_ERROR = "508";

	public final static String PHONE_ENCRYP_ERROR = "603";
	public final static String FEED_BACK_ADD_ERROR = "605";
	public final static String FEED_BACK_PHONE_NULL = "606";
	public final static String FEED_BACK_CONTENT_NULL = "607";
	public final static String FEED_BACK_ADD_SUCC = "608";
	public final static String FEED_BACK_TYPE_NULL = "609";
	public final static String FEED_BACK_FULL_TIMES = "610";

	public final static String PIC_CODE_NULL = "701";
	public final static String PIC_CODE_ERROR = "702";

	public final static String WX_CODE_NULL = "801";
	public final static String WX_OPENID_ERROR = "802";
	public final static String WX_URL_NULL = "803";
	public final static String WX_LOCATION_NULL = "804";

	public final static String SHEBAO_CREDIT_FAIL = "901";
	public final static String PROVINCE_NAME_NULL = "902";
	public final static String GJJ_CREDIT_FAIL = "903";

	public final static String BORROWERID_NULL = "1001";
	public final static String ORDERID_NULL = "1002";
	public final static String PRODUCT_TYPE_NULL = "1003";
	public final static String BORROWER_NUMBER_NULL = "1004";
	public final static String BORROWER_MONEY_ERROR = "1005";
	public final static String MORE_PRODUCT = "1006";
	public final static String MUST_CREDIT = "1007";
	public final static String MUST_CREDIT_1 = "1007_1";
	public final static String MUST_CREDIT_2 = "1007_2";
	public final static String MUST_CREDIT_3 = "1007_3";
	public final static String MUST_CREDIT_4 = "1007_4";
	public final static String MUST_CREDIT_5 = "1007_5";
	public final static String MUST_CREDIT_6 = "1007_6";

	public final static String MUST_CREDIT_7 = "1007_7";

	public final static String WECHAT_FLAG_NULL = "1008";
	public final static String TOKENKEY_NULL = "1009";
	public final static String VOICE_CODE_ERROR = "1010";
	public final static String VOICE_CODE_NULL = "1011";
	public final static String CHANNEL_ID_NULL = "1012";
	public final static String EXPECT_MONEY_NULL = "1013";
	public final static String NOTICEID_NULL = "1014";
	public final static String APPTYPE_NULL = "1015";
	public final static String VERSION_NULL = "1016";
	public final static String CID_NULL = "1017";
	public final static String POSITION_X_NULL = "1018";
	public final static String POSITION_Y_NULL = "1019";
	public final static String ADDRESS_NULL = "1020";
	public final static String STATUS_ERROR = "1022";
	public final static String PRODUCT_ID_NULL = "1023";
	public final static String MERCHANT_ID_NULL = "1024";
	public final static String REMARK_NULL = "1025";
	public final static String COUPON_NOT_BUY = "1026";
	public final static String PRODUCT_NULL = "1027";
	public final static String CANT_APPLY_MALL_PRODUCT = "1028";

	public final static String CAN_BOUND_CARD = "1201";
	public final static String CAN_NOT_BOUND_CARD = "1202";

	public final static String COUPONS_ADD_SUCC = "1301";
	public final static String COUPONS_UPDATE_SUCC = "1302";
	public final static String COUPONS_TIMEOUT = "1303";
	public final static String COUPONS_NOT_USE = "1304";
	public final static String ACTIVITY_ERROR_TIME = "1305";
	public final static String ALLOW_UPDATE_ACTIVITY = "1306";

	public final static String BILL_NOT_BELOND_BORROWER = "1401";
	public final static String BILL_CANNOT_CANCEL = "1402";
	public final static String BILL_AFTER_SALE_COUNT_LIMIT = "1403";
	public final static String BILL_AFTER_SALE_NULL = "1404";
	public final static String BILL_AFTER_SALE_CANNOT_CANCEL = "1405";
	public final static String BILL_CANNOT_AFTER_SALE = "1406";
	public final static String BILL_NOT_FOUND = "1407";
	public final static String BILL_ADDRESS_NOT_EXIST = "1408";
	public final static String BILL_PRODUCT_CANT_BUY = "1409";
	public final static String BILL_PRODUCT_NULL = "1410";
	public final static String BILL_JD_EXCEPTION = "1411";
	public final static String BILL_STATE_ERROR = "1412";
	public final static String BILL_GET_FREIGHT_ERROR = "1414";
	public final static String BILL_COUPON_AMOUNT_LIMIT = "1415";
	public final static String AFTER_AUDIT = "1416";
	public final static String BILL_COUPON_LOCK_FAIL = "1417";
	public final static String BILL_COUPON_NONE_DATA = "1418";
	public final static String BILL_COUPON_USE_FAIL = "1419";
	public final static String BILL_REFUND_ERROR = "1420";
	public final static String BILL_CANNOT_REFUND = "1421";
	public final static String BILL_REFUND_STATE_ERROR = "1422";
	public final static String BILL_EXIS_INVOICE = "1423";
	public final static String BILL_REFUND_INVOICE = "1424";
	public final static String BILL_CANNOT_TRANSFER = "1425";
	public final static String BILL_PRODUCT_NOT_SUPPORT_PERIOD = "1426";
	public final static String BILL_CREATE_ORDER_ERROR = "1427";
	public final static String BILL_HAS_PROCESSING = "1428";
	public final static String BILL_PERIOD_PRODUCT_NUM_NOT_ONE = "1429";
	public final static String BILL_STAGER_CANNOT_CANCEL = "1430";
	public final static String BILL_ORDER_NEED_AUDIT = "1431";
	public final static String BILL_ORDER_PROCESSING = "1432";
	public final static String BILL_AWAITDELIVER_UNDERWAY = "1433";
	public final static String BILL_DELIVER_UNDERWAY = "1434";
	public final static String BILL_ORDER_FINISH = "1435";
	public final static String BILL_ORDER_REFUSE = "1436";
	public final static String BILL_ORDER_STATUS_ERROR = "1437";
	public final static String BILL_AFTER_SALE_EXCESS = "1438";
	public final static String BILL_JD_TYPE_ERROR = "1439";
	public final static String BILL_SHOPPING_CART_NUM_LIMIT = "1440";
	public final static String BILL_AFTER_TYPE_NULL = "1441";
	public final static String ADDRESS_LIMIT = "1442";
	public final static String BILL_NO_NULL = "1443";
	public final static String BILL_CONVERT_EXCEPTION = "1444";
	public final static String BILL_MERCHANT_PRODUCT_NULL = "1445";
	public final static String ADDADDRES_PARAM_ERROR = "1446";
	public final static String DELIVERY_COMPANY_NOT_FOUND = "1447";
	public final static String  BILL_COUPON_EXPIRE = "1448";

	public final static String PAY_ORDER_ERROR = "1413";
	public final static String PAY_TRANS_FINISHED = "1501";
	public final static String PAY_TRANS_STARTING = "1502";
	public final static String PAY_TRANS_FAILED = "1503";
	public final static String PAY_TRANS_OVERTIME = "1504";
	public final static String PAY_TRANS_IN_PROCESS = "1505";
	public final static String PAY_TRANS_CANCEL = "1506";

	public final static String BALANCEDETAIL_LOAD_EXCEPTION = "1600";

	public final static String NONE_DATA = "4444";

	public final static String COUPON_NONE = "1101";
	public final static String COUPON_TYPE_ERROR = "1102";
	public final static String WITHHOLD_NULL = "2000";

	public final static String NO_SALESTATE = "2001";
	public final static String NO_CANVAT = "2002";
	public final static String NO_7TORETURN = "2003";
	public final static String DIFFJDPRICE = "2004";
	public final static String NO_STOCK = "2005";
	public final static String SOLD_OUT = "2006";
	public final static String COUPON_INVAILD = "2007";



	static {
		map.put(NO_SALESTATE, "商品不可售！");
		map.put(NO_CANVAT, "商品不支持开增票！");
		map.put(NO_7TORETURN, "不支持7天退货！");
		map.put(DIFFJDPRICE, "商城协议价和京东协议价不一致！");
		map.put(NO_STOCK, "购买的商品无货！");
		map.put(SOLD_OUT, "购买的商品已下架！");

		map.put(NOT_LOGIN, "请先登录！");
		map.put(SUCCESS, "操作成功！");
		map.put(FAIL, "操作失败，请重试操作或联系客服人员！");
		map.put(CATCH, "您输入的数据不完整！");
		map.put(PHONE_TIME_PER, "您的操作过于频繁，请于1分钟后再次发送");
		map.put(PHONE_TIME_COUNT, "您的操作过于频繁，请您明天再试！");
		map.put(ORDER_PROCESS, "工单处理中");
		map.put(PHONE_VOICE_ERROR, "语音验证码发送失败");
		map.put(BORROWER_NOT_LOGIN, "用户未登录");
		map.put(RELOGIN, "请重新登录");
		map.put(BANK_NULL, "银行卡未找到");
		map.put(IDCARD_INVALID, "身份证不合法");
		map.put(BANK_CARD_INVALID, "银行卡不合法");
		map.put(REAL_NAME_INVALID, "姓名不合法");
		map.put(BANK_CARD_SAME, "请绑定不同的储蓄卡号");
		map.put(IDCARD_EXIST, "该身份证已绑定");
		map.put(BANK_CARD_NOT_SUPPORT, "该银行卡不支持");
		map.put(BANK_CARD_CHANGE_LIMIT, "每月只能重新绑定%N%次银行卡 ！");
		map.put(ORDER_NOT_EXIST, "工单不存在");
		map.put(ORDER_NOT_REPAYMENT, "工单不是还款中状态");
		map.put(BANK_CARD_NOT_SIGN, "银行卡未签约");
		map.put(PAY_THREE_FAIL, "支付失败");
		map.put(PHONE_EXIST, "手机号已注册!");
		map.put(SERVER_EXCEPTION, "服务异常!");
		map.put(BANK_CARD_NOT_BIND, "银行卡未绑定!");
		map.put(ORDER_AUDIT, "工单审核中!");
		map.put(ORDER_REJECT_RECORD_NULL, "被拒记录为空!");
		map.put(ORDER_RONG_NULL, "第三方记录为空!");
		map.put(ORDER_OVERDUE_NULL, "逾期记录为空!");
		map.put(ORDER_REPAYMENT_PLAN_NULL, "还款计划记录为空!");
		map.put(ORDER_NULL, "工单记录为空!");
		map.put(ORDER_BATCH_NOT_EXTEND, "已分批还款不能展期");
		map.put(LOAN_DAY_NOT_EXTEND, "放款%N%天后方可进行展期！");
		map.put(OVERDUE_DAY_NOT_EXTEND, "逾期超过%N%天以上不允许展期！");
		map.put(REPAYMENT_GT_LEFT, "还款金额不能大于剩余还款金额！");
		map.put(NEED_REPAYMENT_LEFT, "需一次还完剩下的欠款！");
		map.put(REPAYMENT_GT_MIN, "每次还款金额不能低于%N%元！");
		map.put(ORDER_UN_SINGLE_NOT_EXTEND, "分期不能展期！");
		map.put(ID_CARD_HAS_USED, "该身份证已经申请借款！");
		map.put(SERVER_NOT_FOUND, "服务没找到！");
		map.put(ORDER_NOT_SINGLE, "不是单期工单！");
		map.put(ORDER_NOT_INSTALLMENT, "不是分期工单！");
		map.put(SIGN_FAIL, "验签失败！");
		map.put(REPEAT_NOTIFY, "重复回调！");

		map.put(BANK_CARD_ONESELF, "请绑定本人身份证！");
		map.put(BANK_AUDIT_CANNOT_REBIND, "您的借款正在核实中，不能重新绑定银行卡！");
		map.put(NOT_ONESELF_OPERATION, "请本人操作！");
		map.put(NOT_ALI_PAY, "暂不能使用支付宝！");
		map.put(NOT_WEIXIN_PAY, "暂不能使用微信支付！");
		map.put(NOT_SUPPORT_EXTEND, "该产品不支持展期！");
		map.put(PARAM_MISSING, "缺少参数！");
		map.put(PARAM_ERROR, "参数错误！");
		map.put(DATA_PARSE_FAIL, "数据解析失败！");
		map.put(REPEAT_OPERATOR, "不可重复操作！");
		map.put(IP_LIMIT, "短信验证码次数已达到上限，请明日再试");
		map.put(PHONE_FORMAT_WRONG, "手机号格式错误");
		map.put(ORDER_STATUS_ERROR, "工单状态错误");
		map.put(SHOPPING_CART_NULL, "没有获取到购物车信息");
		map.put(SHOPPING_CART_ADD_FAIL, "购物车添加商品失败");
		map.put(SHOPPING_CART_DEL_FAIL, "购物车删除商品失败");
		map.put(SHOPPING_CART_EMPTY_FAIL, "购物车清空失败");
		map.put(UPDATE_DATABASE_FAIL, "数据库更新失败");
		map.put(CANT_AUDIT, "暂时不能提交审核");
		map.put(SHOPPING_CART_CHANGE_FAIL, "购物车修改商品失败");
		map.put(SHOPPING_CART_DEL_LIST_NULL, "请选择您要删除的商品");
		map.put(SIGN_NULL, "签名不能为空");
		map.put(MD5_EXCEPTION, "MD5加密异常");

		map.put(SMS_SEND_FAIL, "短信发送失败");
		map.put(IDCARD_CODE_BINDING, "身份证号已被绑定");
		map.put(ORGANIZATION_NULL, "没找到对应的机构");

		map.put(REQUEST_LOCK, "请稍后再试");
		map.put(ACTIVITY_TYPE_NULL, "活动类型不能为空!");
		map.put(ACTIVITY_NOT_EXIST, "活动不存在!");
		map.put(ACTIVITY_SHARE_ERROR, "活动共享出错!");
		map.put(ACTIVITY_NOT_START, "活动还没开始,请稍后再来!");
		map.put(ACTIVITY_HAS_END, "活动已经结束,请下次再来!");
		map.put(ACTIVITY_NO_CHANCE, "活动机会已用完!");
		map.put(ACTIVITY_COUNT_LIMIT, "您今天的翻牌机会已达上限~请明日再来哦!");
		map.put(ACTIVITY_PARAM_ERROR, "填写参数有误!");
		map.put(ACTIVITY_UPDATE_STATUS_FAIL, "修改收货状态失败!");
		map.put(ACTIVITY_DISCOUNT_DISTRIBUTE_NOT_EXIST, "活动优惠派发信息不存在!");
		map.put(ACTIVITY_DISCOUNT_INFO_NOT_EXIST, "活动奖品信息不存在!");
		map.put(ACTIVITY_PRODUCT_NUM_ERROR, "商品的售出数量与配置数量之和不能大于配置数量");
        map.put(ACTIVITY_PARAMS_NULL, "参数为空");
		map.put(ACTIVITY_TIME_NULL, "活动开始时间或结束时间为空");
		map.put(ACTIVITY_TIME_CONFLICT, "活动与其他活动时间有冲突");
		map.put(ACTIVITY_TYPE_ERROR, "活动类型错误");
		map.put(ACTIVITY_TIME_ERROR, "当前数据为最新活动，限制开始时间不能修改");
		map.put(ACTIVITY_PRODUCT_EXIST, "商品已经存在当前活动中或有重复，请勿重复添加");
		map.put(ACTIVITY_PRODUCT_NUM_STOCK_ERROR, "活动数量不能大于商品库存");
		map.put(ACTIVITY_SKU_LOCK_ERROR,"锁定活动库存错误");
		map.put(ACTIVITY_WC_USER_EXIST,"用户已存在");
		map.put(ACTIVITY_WC_USER_SENSITIVE,"用户名含有敏感词");
		map.put(ACTIVITY_WC_TIME_ERROR,"比赛已经开始，不能进行竞猜");





		map.put(PHONE_NULL, "请输入手机号");

		map.put(LOGINNAME_NULL, "用户名为空");

		map.put(LOGIN_NAME_NULL, "请输入帐号");
		map.put(MERCHANT_NULL, "账户不存在");

		map.put(PWD_NULL, "密码为空");
		map.put(PWD_DIFFER, "密码不一致");
		map.put(PHONE_CODE_NULL, "手机设备号为空");
		map.put(PHONE_CODE_BINDING, "手机设备号已绑定");
		map.put(VERIFY_CODE_NULL, "验证码为空");
		map.put(VERIFY_CODE_ERROR, "验证码有误，请重新输入");
		map.put(BORROWER_ID_NULL, "借款人id为空");

		map.put(BORROWER_NULL, "账户不存在");
		map.put(PWD_OLD_EQUALS_NEW, "原密码不能与新密码相同");
		map.put(LOGIN_FAIL, "登陆失败");
		map.put(REGIST_FAIL, "注册失败");
		map.put(INVITATION_ERROR, "邀请码错误");
		map.put(PHONE_HAS_REGIST, "手机号已注册");
		map.put(PHONE_NOT_REGIST, "手机号未注册,请先注册");
		map.put(PWD_ERROR, "密码有误，请重新输入");
		map.put(PWD_UPDATE_FAIL, "密码修改失败");
		map.put(PWD_RESET_FAIL, "密码重置失败");
		map.put(STATUS_FORBIDDEN, "用户被禁用");
		map.put(TOKEN_NULL, "令牌为空,请重新登录");
		map.put(OLD_PWD_NULL, "原密码不能为空");
		map.put(NEW_PWD_NULL, "新密码不能为空");
		map.put(TOKEN_EXPIRED, "登录超时,请重新登录");
		map.put(PWD_LENGTH_ERROR, "密码长度不在6-16范围内");
		map.put(VERIFY_CODE_EXPIRE, "验证码已过期，请重新发送验证码");
		map.put(VERIFY_CODE_SEND_AGAIN, "请重新发送验证码");
		map.put(BIND_CARD_FAIL, "绑卡失败");
		map.put(OLD_PRODUCT_NOT_PAY, "由于您的订单长期未还清，已交付青岛海树资产管理有限公司处理，详询4008807733或关注微信公众号：海树资产");
		map.put(PERSION_QQ_NOT_VALID, "请输入有效的QQ号码");


		map.put(CHANNEL_CODE_NULL, "渠道编码为空");
		map.put(CHANNEL_CODE_BUSY, "发送验证码请求过于频繁，请于1分钟后再次发送");
		map.put(CHANNEL_CODE_OVER, "今天发送验证码次数已使用完，请您明天再试！");
		map.put(PAGE_TOKEN_NULL, "参数页面令牌为空");
		map.put(PAGE_TOKEN_ERROR, "参数页面令牌为空");
		map.put(CHANNEL_NULL, "没找到对应的渠道");
		map.put(CHANNEL_VALID_ERROR, "渠道验证未通过!");
		map.put(TOKEN_VALID_ERROR, "TOKEN验证未通过!");

		map.put(PHONE_ENCRYP_ERROR, "手机号解密错误");
		map.put(FEED_BACK_ADD_ERROR, "添加反馈失败");
		map.put(FEED_BACK_TYPE_NULL, "反馈类型不能为空");
		map.put(FEED_BACK_PHONE_NULL, "反馈联系方式不能为空");
		map.put(FEED_BACK_CONTENT_NULL, "反馈内容不能为空");
		map.put(FEED_BACK_ADD_SUCC, "添加反馈成功");
		map.put(FEED_BACK_FULL_TIMES, "今天反馈次数已用完");

		map.put(PIC_CODE_NULL, "图片验证码不能为空");
		map.put(PIC_CODE_ERROR, "图片验证码输入错误");

		map.put(WX_CODE_NULL, "微信code为空");
		map.put(WX_OPENID_ERROR, "获取openid失败！");
		map.put(WX_URL_NULL, "URL参数为空！");
		map.put(WX_LOCATION_NULL, "URL参数为空！");

		map.put(SHEBAO_CREDIT_FAIL, "社保认证失败，请重新认证!");
		map.put(PROVINCE_NAME_NULL, "省名称不能为空!");
		map.put(GJJ_CREDIT_FAIL, "公积金认证失败，请重新认证!");

		map.put(BORROWERID_NULL, "用户Id不能为空！");
		map.put(ORDERID_NULL, "工单Id不能为空！");
		map.put(PRODUCT_TYPE_NULL, "产品类型不能为空！");
		map.put(BORROWER_NUMBER_NULL, "分期产品借款期数不能为空！");
		map.put(BORROWER_MONEY_ERROR, "请输入正确的借款金额！");
		map.put(MORE_PRODUCT, "请选择更多产品！");
		map.put(MUST_CREDIT, "请完成必要认证！");
		map.put(MUST_CREDIT_1, "请先完成身份认证！");
		map.put(MUST_CREDIT_2, "请先绑定银行卡！");
		map.put(MUST_CREDIT_3, "请先填写联系信息！");
		map.put(MUST_CREDIT_4, "请先填写单位信息");
		map.put(MUST_CREDIT_5, "请先完成运营商认证！");
		map.put(MUST_CREDIT_6, "请先完成芝麻信用认证!");
		map.put(MUST_CREDIT_7, "请先完成淘宝或者京东认证!");

		map.put(WECHAT_FLAG_NULL, "是否h5提交标识！");
		map.put(TOKENKEY_NULL, "白骑士tokenKey不能为空！");
		map.put(VOICE_CODE_ERROR, "语音验证码错误！");
		map.put(VOICE_CODE_NULL, "语音验证码不能为空！");
		map.put(CHANNEL_ID_NULL, "渠道Id不能为空！");
		map.put(EXPECT_MONEY_NULL, "借款金额不能为空！");
		map.put(NOTICEID_NULL, "公告Id不能为空！");
		map.put(APPTYPE_NULL, "App类型不能为空！");
		map.put(VERSION_NULL, "App版本号不能为空！");
		map.put(CID_NULL, "渠道cid不能为空！");
		map.put(POSITION_X_NULL, "经度不能为空！");
		map.put(POSITION_Y_NULL, "纬度不能为空！");
		map.put(ADDRESS_NULL, "详细地址不能为空！");

		map.put(STATUS_ERROR, "工单状态错误！");

		map.put(PRODUCT_ID_NULL, "产品Id不能为空！");
		map.put(MERCHANT_ID_NULL, "商家Id不能为空！");
		map.put(REMARK_NULL, "备注不能为空！");
		map.put(COUPON_NOT_BUY, "未购买优惠券，不能进行签约！");
		map.put(PRODUCT_NULL, "产品不能为空！");
		map.put(CANT_APPLY_MALL_PRODUCT, "您暂时无法申请商品分期");

		map.put(CAN_BOUND_CARD, "可以进行银行卡重绑！");
		map.put(CAN_NOT_BOUND_CARD, "不能进行银行卡重绑！");

		map.put(COUPONS_ADD_SUCC, "免息券新增成功！");
		map.put(COUPONS_UPDATE_SUCC, "免息券更新成功！");
		map.put(COUPONS_TIMEOUT, "免息券领取过时！");
		map.put(COUPONS_NOT_USE, "当前券不符合使用规则");

		map.put(BILL_NOT_BELOND_BORROWER, "订单不属于该用户");
		map.put(BILL_CANNOT_CANCEL, "订单不能取消");
		map.put(BILL_AFTER_SALE_COUNT_LIMIT, "订单售后记录数不足");
		map.put(BILL_AFTER_SALE_NULL, "订单售后记录为空");
		map.put(BILL_AFTER_SALE_CANNOT_CANCEL, "订单售后记录无法撤销");
		map.put(BILL_CANNOT_AFTER_SALE, "该订单无法申请售后");
		map.put(BILL_NOT_FOUND, "没找到符合条件的订单");
		map.put(BILL_ADDRESS_NOT_EXIST, "没找到收货地址");
		map.put(BILL_PRODUCT_CANT_BUY, "该商品暂时无法购买,请选择其他商品");
		map.put(BILL_PRODUCT_NULL, "没找到对应的商品信息");
		map.put(BILL_JD_EXCEPTION, "京东下单接口异常");
		map.put(BILL_STATE_ERROR, "订单状态错误");
		map.put(BILL_GET_FREIGHT_ERROR, "订单获取商品运费出错");
		map.put(BILL_COUPON_AMOUNT_LIMIT, "优惠券金额超限");
		map.put(BILL_COUPON_LOCK_FAIL, "优惠券锁定失败");
		map.put(BILL_COUPON_NONE_DATA, "未查到有效的优惠券");
		map.put(BILL_COUPON_USE_FAIL, "优惠券使用失败");
		map.put(BILL_COUPON_EXPIRE, "优惠券已过期");
		map.put(BILL_CANNOT_REFUND, "订单无法退款");
		map.put(BILL_REFUND_ERROR, "订单调用退款出错");
		map.put(BILL_REFUND_STATE_ERROR, "订单退款状态错误");
		map.put(BILL_EXIS_INVOICE, "订单已开发票");
		map.put(BILL_REFUND_INVOICE, "订单已退款不能申请发票");
		map.put(BILL_CANNOT_TRANSFER, "订单已转让不能再次转让");
		map.put(BILL_PRODUCT_NOT_SUPPORT_PERIOD, "订单商品不支持分期");
		map.put(BILL_CREATE_ORDER_ERROR, "订单创建工单失败");
		map.put(BILL_HAS_PROCESSING, "您正在申请商品分期，请前往【个人中心--商城分期订单】中去认证");
		map.put(BILL_PERIOD_PRODUCT_NUM_NOT_ONE, "商品分期限购1件，请修改商品数量");
		map.put(BILL_STAGER_CANNOT_CANCEL, "分期订单状态为(申请中/已通过)时，才能取消订单");
		map.put(BILL_ORDER_NEED_AUDIT, "工单需要认证");
		map.put(BILL_ORDER_PROCESSING, "您已有正在进行的商品分期订单订单结束后才能再次申请");
		map.put(BILL_DELIVER_UNDERWAY, "订单已处于发货中，请耐心等待");
		map.put(BILL_ORDER_FINISH, "订单已完成不能再转让");
		map.put(BILL_AWAITDELIVER_UNDERWAY, "订单已处于等待发货中，请耐心等待");
		map.put(BILL_ORDER_REFUSE, "您暂时无法申请商品分期");
		map.put(BILL_ORDER_STATUS_ERROR, "工单状态错误，无法转让");
		map.put(BILL_AFTER_SALE_EXCESS, "订单售后申请数量超过可申请数量");
		map.put(BILL_JD_TYPE_ERROR, "京东订单返回类型错误");
		map.put(BILL_SHOPPING_CART_NUM_LIMIT, "购物车最多只能添加100种商品");
		map.put(BILL_AFTER_TYPE_NULL, "请选择售后类型");
		map.put(ADDRESS_LIMIT, "收货地址最多只能添加20个哦~");
		map.put(BILL_NO_NULL, "订单编号不能为空");
		map.put(BILL_CONVERT_EXCEPTION, "订单信息转换异常");
		map.put(BILL_MERCHANT_PRODUCT_NULL, "商城商户产品不能为空");
		map.put(ADDADDRES_PARAM_ERROR, "请选择完整的收货地址");
		map.put(DELIVERY_COMPANY_NOT_FOUND, "未找到对应快递公司信息");

		map.put(COUPON_NONE, "未查询到任何优惠券记录！");
		map.put(COUPON_TYPE_ERROR, "优惠券类型有误！");

		map.put(NONE_DATA, "没有查询到任何数据！");

		// 订单金额错误
		map.put(PAY_ORDER_ERROR, "支付订单错误");
		// 交易状态
		map.put(PAY_TRANS_FINISHED, "支付完成");
		map.put(PAY_TRANS_STARTING, "支付开始");
		map.put(PAY_TRANS_FAILED, "支付失败");
		map.put(PAY_TRANS_OVERTIME, "支付超时");
		map.put(PAY_TRANS_IN_PROCESS, "支付处理中");
		map.put(PAY_TRANS_CANCEL, "支付取消");
		map.put(AFTER_AUDIT, "售后进行中，不能重复提交申请");

		map.put(BALANCEDETAIL_LOAD_EXCEPTION, "拉取余额明细出错");
		map.put(WITHHOLD_NULL, "代扣验证码不能为空");
		map.put(COUPON_INVAILD, "券不符合使用规则");
		map.put(ACTIVITY_ERROR_TIME, "活动时间错误");
		map.put(ALLOW_UPDATE_ACTIVITY, "只修改活动信息");
		map.put(ACTIVITY_ID_NONE, "没有找到活动ID");
		map.put(ACTIVITY_NEWUSER_NONE, "没有新人活动");



	}

}
