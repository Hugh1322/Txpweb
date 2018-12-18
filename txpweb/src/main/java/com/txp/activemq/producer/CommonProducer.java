package com.txp.activemq.producer;

import com.txp.activemq.base.ProducerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.jms.*;

/**
 * 状态查询---生产者
 */
@Slf4j
public class CommonProducer implements ProducerService {
	private JmsTemplate jmsTemplate;
	private Destination destination;

	/**
	 * 向默认队列发送消息
	 */
	public void sendMessage() {
		String destination = getDestination().toString();
		jmsTemplate.send(new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage("");
			}
		});
	}

	/**
	 * 向默认队列发送消息
	 */
	public void sendMessage(final String msg) {
		String destination = getDestination().toString();
		log.info("向队列" + destination + "发送了消息：\t" + msg);
		jmsTemplate.send(new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(msg);
			}
		});
	}

	/**
	 * 向指定队列发送消息
	 */
	public void sendMessage(Destination destination, final String msg) {
		log.info("向队列" + destination.toString()+ "发送了消息：\t" + msg);
		jmsTemplate.send(destination, new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(msg);
			}
		});
	}

	public void sendMessage(Destination destination, final String msg, final Destination response) {
		log.info("向队列" + destination + "发送了消息：\t" + msg);
		jmsTemplate.send(destination, new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				TextMessage textMessage = session.createTextMessage(msg);
				textMessage.setJMSReplyTo(response);
				return textMessage;
			}
		});
	}

	public void sendMessage(Destination destination, final Integer bizType, final String bizId) {
		log.info("向队列" + destination.toString() + "发送了消息：\t" + bizId + "bizType==>" + bizType);
		jmsTemplate.send(destination, new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				MapMessage mapMessage = session.createMapMessage();
				mapMessage.setJMSMessageID(System.currentTimeMillis()+"");
				mapMessage.setInt("bizType", bizType);
				mapMessage.setString("bizId", bizId);

				return mapMessage;
			}
		});
	}

	public JmsTemplate getJmsTemplate() {
		return jmsTemplate;
	}

	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	public Destination getDestination() {
		if(jmsTemplate != null){
			return jmsTemplate.getDefaultDestination();
		}

		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}
}
