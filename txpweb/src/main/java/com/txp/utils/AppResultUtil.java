package com.txp.utils;


import com.txp.common.constants.AppResultConstant;
import com.txp.common.dto.AppResponseResult;
import com.txp.common.dto.AppResult;

/**
 * 返回值操作
 * Created by th on 2017/8/10.
 */
public class AppResultUtil {

    /**
     * 通过编码获取详细说明
     * @param code
     * @return
     */
    public static String getMsg(String code){
        return AppResultConstant.map.get(code);
    }

    public static void setResult(AppResult<?> result, String code){
        result.setCode(code);
        result.setMsg(getMsg(code));
    }

    public static void setResultMsg(AppResult<?> result, String code, String message){
        result.setCode(code);
        result.setMsg(message);
    }
    
    public static boolean isSuccess(AppResponseResult result) {
    		boolean isSuccess = false;
    		if (result != null && AppResultConstant.SUCCESS.equals(result.getCode())) {
    			isSuccess = true;
    		}
    		return isSuccess;
    }
    
    public static boolean isSuccess(AppResult<?> result) {
    	boolean isSuccess = false;
    	if (result != null && AppResultConstant.SUCCESS.equals(result.getCode())) {
    		isSuccess = true;
    	}
    	return isSuccess;
    }

    public static <T>  AppResult<T> instance(){
        AppResult result=  new AppResult();
        return result;
    }
}
