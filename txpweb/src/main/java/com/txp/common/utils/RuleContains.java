package com.txp.common.utils;

import java.util.Set;

/**
 * 权限自定义标签
 * 
 * @author hugh
 */
public class RuleContains {
	public static boolean contains(Set<String> rules, String ruleCode) {
		if (rules!=null && rules.size()>0){
			return rules.contains(ruleCode);
		}
		return  false;
	}
}
