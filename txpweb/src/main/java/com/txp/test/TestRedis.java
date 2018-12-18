package com.txp.test;

import com.txp.constants.RedisKeyConstant;
import com.txp.utils.ControllerUtil;
import com.txp.utils.RedisUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
public class TestRedis {

	public static void main(String[] args) {
		log.info("start");
		String lockKey = StringUtils.join(RedisKeyConstant.LOCK_KEY_PAY_PRE, "sv:", "abc");
		boolean lockBool = ControllerUtil.lockRequest(lockKey, 40);
		log.info("lockBool:{}",lockBool);

		//设置hash
//		Long hsetnxResult = RedisUtils.hsetnx("hashKeyL1:hashKeyL2","fieldL1:fieldL2","value1modify");
		Long hsetnxResult = RedisUtils.hsetnx("hashKeyL1:hashKeyL2","fieldL1:fieldL3","value1modify");
		log.info("hsetnxResult:{}",hsetnxResult);

		String hsetnxResultGet = RedisUtils.hget("hashKeyL1:hashKeyL2","fieldL1:fieldL3");
		log.info(hsetnxResultGet);

		Map<String, String> hash = new HashMap<>();
		hash.put("sfrz1","0modify");
		hash.put("sfrz2","1modify");
		hash.put("sfrz3","2modify");
		String hmsetResult = RedisUtils.hmset("hashKeyL1:hashKeyL2:mult",hash);
		log.info("hmsetResult:{}",hmsetResult);

		String get = RedisUtils.get(lockKey);
		log.info(get);

		List<String> valuesList = RedisUtils.hvals("hashKeyL1:hashKeyL2:mult");
		for(String s : valuesList) {
			log.info(s);
		}

		RedisUtils.lpush("listkey1","v1","v2","v3");
		log.info(RedisUtils.lpop("listkey1"));

		Long re = RedisUtils.hset("system:sfrz_source","1","1");
		log.info("re:{}",re);
	}
	
}
