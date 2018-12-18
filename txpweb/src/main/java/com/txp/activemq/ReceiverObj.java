package com.txp.activemq;


import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQTextMessage;

import javax.jms.*;

/***
 * 消费者
 * 接收对象
 */
public class ReceiverObj {
	public static void main(String[] args) {
		// ConnectionFactory ：连接工厂，JMS 用它创建连接
		ConnectionFactory connectionFactory;
		// Connection ：JMS 客户端到JMS Provider 的连接
		Connection connection = null;
		// Session： 一个发送或接收消息的线程
		Session session;
		// Destination ：消息的目的地;消息发送给谁.
		Destination destination;
		// 消费者，消息接收者
		MessageConsumer consumer;
		connectionFactory = new ActiveMQConnectionFactory(
				ActiveMQConnection.DEFAULT_USER,
				ActiveMQConnection.DEFAULT_PASSWORD, "tcp://localhost:61616");
		try {
			// 构造从工厂得到连接对象
			connection = connectionFactory.createConnection();
			// 启动
			connection.start();
			// 获取操作连接
//			session = connection.createSession(Boolean.FALSE,Session.AUTO_ACKNOWLEDGE);
			session = connection.createSession(Boolean.TRUE,Session.CLIENT_ACKNOWLEDGE);
			// 获取session注意参数值xingbo.xu-queue是一个服务器的queue，须在在ActiveMq的console配置
			destination = session.createQueue("FirstQueueObj");
			consumer = session.createConsumer(destination);
			while (true) {
				// 设置接收者接收消息的时间，为了便于测试，这里谁定为100s
				ObjectMessage message = (ObjectMessage) consumer.receive(20000);
				if (null != message) {
					Person person = (Person)message.getObject();
					if(person.getAge().intValue()==6||person.getAge().intValue()==8) {
						System.out.println("消息回滚"+ "\t" + person.getAge());
						session.rollback();
					}else {
						message.acknowledge();
						session.commit();
						System.out.println("收到消息：" + person.getName() + "\t" + person.getAge());
					}
				} else {
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != connection)
					connection.close();
			} catch (Throwable ignore) {
			}
		}
	}
}