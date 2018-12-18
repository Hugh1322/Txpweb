package com.txp.test;

//import static org.junit.Assert.*;

//import org.junit.Before;
//import org.junit.Test;

import com.txp.utils.RedisUtils;
import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;

@Slf4j
public class Test001Test {
	
	private static Test001 test001 = new Test001();

//	@Before
//	public void setUp() throws Exception {
//	}
//
//	@Test
//	public void testPrepare() {
//		int a = 4;
//		int b = 3;
//		assertEquals(1,test001.prepare(a, b));
//
//	}

	public static void main(String[] agrs) {
//		String s1 = "a";
//		String s2 = "a";
//		String s21 = "b";
//
//		String s3 = "http://www.baidu.com";
////		System.out.println(s1.hashCode() + "\t" + toHash(s1));
////		System.out.println(toHash(s2));
////		System.out.println(toHash(s21));
//		System.out.println(toHash("a11113a"));
//		System.out.println(toHash(s3));
//		HashSet hashSet = new HashSet();
//		HashSet hashSet2 = new HashSet();
//		hashSet.add(s1);
//		hashSet2.add(s21);
//		System.out.println(hashSet.contains(s3));
//		System.out.println(hashSet.hashCode());
//		System.out.println(hashSet2.hashCode());

		//20180806 contact list test
		Long re = RedisUtils.hset("mongodb_contact:status","1","1");
		log.info("re:{}",re);
//		boolean b = RedisUtils.exists("mongodb_contact:status");
//		if(b) {
//			Long de = RedisUtils.hdel("mongodb_contact:status","1");
//			log.info("re:{}",de);

//		}

		//20180831 取最新N个数据的操作
		for(int i=1;i<=15;i++) {
//			RedisUtils.rpush("ttop10","a" +i);
		}
//		log.info("top10:" + RedisUtils.llen("top10"));

		String r0 = RedisUtils.ltrim("top10",0,10);
		String rr0 = RedisUtils.ltrim("ttop10",0,10);
		log.info(r0);
		log.info(rr0);

	}

	// 将字符串转成hash值
	public static int toHash(String key) {
		int arraySize = 11113; // 数组大小一般取质数
		int hashCode = 0;
		for (int i = 0; i < key.length(); i++) { // 从字符串的左边开始计算
			int letterValue = key.charAt(i) - 96;// 将获取到的字符串转换成数字，比如a的码值是97，则97-96=1
			// 就代表a的值，同理b=2；
			hashCode = ((hashCode << 5) + letterValue) % arraySize;// 防止编码溢出，对每步结果都进行取模运算
		}
		return hashCode;
	}

}
