package com.txp.utils;

//import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.ByteArrayInputStream;
//import java.io.IOException;
//import java.io.OutputStream;
//import java.lang.reflect.Method;
import java.util.Date;
//import java.util.Enumeration;
//import java.util.HashMap;
//import java.util.Map;

/**
 * 
 * 
 * Module:
 * 
 * ControllerUtil.java
 * 
 * @author
 * @since JDK 1.8
 * @version 1.0
 * @description: <描述>
 */
public class ControllerUtil {
	private static Logger logger = LoggerFactory.getLogger(ControllerUtil.class);

	/**
	 * 锁定同步请求
	 * 
	 * @param lockKey
	 * @param lockSeconds
	 * @return false：异常或已有正在处理请求；true：添加锁定数据成功，继续下一步
	 */
	public static boolean lockRequest(String lockKey, int lockSeconds) {
		Long lockKeyResult = RedisUtils.setNxAndEx(lockKey,
				CommUtils.convertDateToString(new Date(), SystemConstant.YMD_HMS), lockSeconds);
		logger.info("【ControllerUtil.lockRequest】lockKey=" + lockKey + "重复提交,lockKeyResult:" + lockKeyResult);
		if (lockKeyResult == null || lockKeyResult <= 0L) {// redis异常或已有线程在处理
			return false;
		}
		return true;
	}

}