package com.txp.activemq;


import lombok.Data;

import java.io.Serializable;

/**
 * 生产者 测试对象
 */
@Data
public class Person implements Serializable {

	public Person(String name,Integer age) {
		this.name = name;
		this.age = age;
	}

	private String name;
	private Integer age;
}