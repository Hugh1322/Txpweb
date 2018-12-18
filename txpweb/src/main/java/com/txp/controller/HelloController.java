package com.txp.controller;

import com.txp.common.constants.AppResultConstant;
import com.txp.common.dto.AppResult;
import com.txp.common.dto.UserDto;
import com.txp.utils.AppResultUtil;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(value = "hello-v1", description = "Swagger测试")
@Controller
@RequestMapping("/hello/v1/")
@Slf4j
public class HelloController {

	/**
	 * test
	 *
	 * @param request
	 * @param response
	 * @param modelMap
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "testSwagger", produces = "application/json; charset=utf-8")
	@RequestMapping(value = "testSwagger.do",method = RequestMethod.POST)
	@ResponseBody
	public AppResult<UserDto> testSwagger(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap,
										  @ApiParam(name = "phone", value = "用户名") @RequestParam(required = true) String phone,
										  @ApiParam(name = "password", value = "密码") @RequestParam(required = false) String password)
			throws Exception {
		modelMap.put("page", "后台返回的数据");
		log.info("phone:{},password:{}",phone,password);
		AppResult<UserDto> result = new AppResult<>();
		AppResultUtil.setResult(result, AppResultConstant.SERVER_EXCEPTION);
		return result;
	}

	@RequestMapping(value = "test1.do",method = {RequestMethod.POST,RequestMethod.GET})
	public String test1(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap
						)
			throws Exception {
		modelMap.put("page", "后台返回的数据");
		log.info("test1 .. start");
		return "test/test1";
	}

	/**
	 * 跳转到上传页面
	 * @param request
	 * @param response
	 * @param modelMap
	 * @return
     * @throws Exception
     */
	@RequestMapping(value = "toUpload.do",method = {RequestMethod.POST,RequestMethod.GET})
	public String toUpload(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap)
			throws Exception {
		return "test/upload";
	}


}
