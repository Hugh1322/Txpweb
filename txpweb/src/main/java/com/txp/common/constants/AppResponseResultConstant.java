package com.txp.common.constants;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回码统一定义
 * Created by th on 2017/8/10.
 */
public abstract class AppResponseResultConstant {

    public static Map<String, String> map = new HashMap<>();
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
    public final static String NOT_ONESELF_OPERATION = "148";
    public final static String NOT_ALI_PAY = "149";
    public final static String NOT_WEIXIN_PAY = "150";

    public final static String SMS_SEND_FAIL = "201";

    public final static String ACTIVITY_TYPE_NULL = "301";
    public final static String ACTIVITY_NOT_EXIST = "302";

    public final static String PHONE_NULL = "401";
    public final static String loginName_NULL = "409";
    public final static String PWD_NULL = "402";
    public final static String PWD_DIFFER = "403";
    public final static String PHONE_CODE_NULL = "404";
    public final static String VERIFY_CODE_NULL = "406";
    public final static String VERIFY_CODE_ERROR = "407";
    public final static String BORROWER_ID_NULL = "408";
    public final static String BORROWER_NULL = "410";
    public final static String PWD_OLD_EQUALS_NEW = "413";
    public final static String REGIST_FAIL = "414";
    public final static String INVITATION_ERROR = "415";
    public final static String TOKEN_NULL = "416";
    public final static String OLD_PWD_NULL = "417";
    public final static String NEW_PWD_NULL = "418";
    public final static String LOGIN_FAIL = "450";
    public final static String OLD_PRODUCT_NOT_PAY = "460";

    public final static String CHANNEL_CODE_NULL = "501";
    public final static String CHANNEL_CODE_BUSY = "502";
    public final static String CHANNEL_CODE_OVER = "503";
    public final static String PAGE_TOKEN_NULL = "504";
    public final static String PAGE_TOKEN_ERROR = "505";

    public final static String PHONE_ENCRYP_ERROR = "603";
    public final static String FEED_BACK_ADD_ERROR = "605";
    public final static String FEED_BACK_PHONE_NULL = "606";
    public final static String FEED_BACK_CONTENT_NULL = "607";
    public final static String FEED_BACK_ADD_SUCC = "608";

    public final static String PIC_CODE_NULL = "701";
    public final static String PIC_CODE_ERROR = "702";

    public final static String WX_CODE_NULL = "801";
    public final static String WX_OPENID_ERROR = "802";
    public final static String WX_URL_NULL = "803";
    public final static String WX_LOCATION_NULL = "804";

    public final static String SHEBAO_CREDIT_FAIL = "901";
    public final static String PROVINCE_NAME_NULL = "902";
    public final static String GJJ_CREDIT_FAIL = "903";

    static {
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
        map.put(BANK_CARD_SAME, "请绑定不同的银行号");
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
        map.put(NOT_ONESELF_OPERATION, "请本人操作！");
        map.put(NOT_ALI_PAY, "暂不能使用支付宝！");
        map.put(NOT_WEIXIN_PAY, "暂不能使用微信支付！");

        map.put(SMS_SEND_FAIL, "短信发送失败");

        map.put(ACTIVITY_TYPE_NULL, "活动类型不能为空!");
        map.put(ACTIVITY_NOT_EXIST, "活动不存在!");

        map.put(PHONE_NULL, "手机号为空");
        map.put(loginName_NULL, "用户名为空");
        map.put(PWD_NULL, "密码为空");
        map.put(PWD_DIFFER, "密码不一致");
        map.put(PHONE_CODE_NULL, "手机设备号为空");
        map.put(VERIFY_CODE_NULL, "验证码为空");
        map.put(VERIFY_CODE_ERROR, "验证码错误");
        map.put(BORROWER_ID_NULL, "借款人id为空");
        map.put(BORROWER_NULL, "账户不存在");
        map.put(PWD_OLD_EQUALS_NEW, "原密码不能与新密码相同");
        map.put(LOGIN_FAIL, "登陆失败");
        map.put(OLD_PRODUCT_NOT_PAY, "由于您的订单长期未还清，已交付青岛海树资产管理有限公司处理，详询4008807733或关注微信公众号：海树资产");
        map.put(REGIST_FAIL, "注册失败");
        map.put(INVITATION_ERROR, "邀请码错误");
        map.put(TOKEN_NULL, "令牌为空,请重新登录");
        map.put(OLD_PWD_NULL, "原密码不能为空");
        map.put(NEW_PWD_NULL, "新密码不能为空");

        map.put(CHANNEL_CODE_NULL, "渠道编码为空");
        map.put(CHANNEL_CODE_BUSY, "发送验证码请求过于频繁，请于1分钟后再次发送");
        map.put(CHANNEL_CODE_OVER, "今天发送验证码次数已使用完，请您明天再试！");
        map.put(PAGE_TOKEN_NULL, "参数页面令牌为空");
        map.put(PAGE_TOKEN_ERROR, "参数页面令牌为空");

        map.put(PHONE_ENCRYP_ERROR, "手机号解密错误");
        map.put(FEED_BACK_ADD_ERROR, "添加反馈失败");
        map.put(FEED_BACK_ADD_SUCC, "添加反馈成功");
        map.put(FEED_BACK_PHONE_NULL, "反馈联系方式不能为空");
        map.put(FEED_BACK_CONTENT_NULL, "反馈内容不能为空");

        map.put(PIC_CODE_NULL, "图片验证码不能为空");
        map.put(PIC_CODE_ERROR, "图片验证码输入错误");

        map.put(WX_CODE_NULL, "微信code为空");
        map.put(WX_OPENID_ERROR, "获取openid失败！");
        map.put(WX_URL_NULL, "URL参数为空！");
        map.put(WX_LOCATION_NULL, "URL参数为空！");

        map.put(SHEBAO_CREDIT_FAIL, "社保认证失败，请重新认证!");
        map.put(PROVINCE_NAME_NULL, "省名称不能为空!");
        map.put(GJJ_CREDIT_FAIL, "公积金认证失败，请重新认证!");
    }
}
