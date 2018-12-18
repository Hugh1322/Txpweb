package com.txp.test;


import com.txp.activemq.util.SimpleJmsTemplate;
import lombok.extern.slf4j.Slf4j;
import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.jms.JMSException;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;


/**
 * API测试
 * 对应MQ3.xml ->消费者
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@Component
@ContextConfiguration(locations = {"/application-context-test.xml"})
public class ActiveMqReceiverTest {

//    @Autowired
//    private SimpleJmsTemplate receiverJmsTemplate;
//    @Autowired
//    private ActiveMQQueue activeMQQueue;
//
//    /**
//     * 坑爹的方法,如果session事物设置为true,receiver直接将sessioin进行commit,
//     *
//     * 如果设置为false,receiver方法会直接判断进行消息确认,无法做到手动的消息确认,所以一旦发生异常,这条消息不会回到消息队列中
//     *
//     * session的提交可以认为是消息确认收到
//     * @throws JMSException
//     */
//    @Test
//    public void receiver() throws JMSException {
//        int i=1;
//        while (true){
//            i++;
//            TextMessage message = (TextMessage)receiverJmsTemplate.receive(activeMQQueue);
//            if (null != message) {
//                System.out.println("收到消息==================" + message.getText());
//
//            } else {
//                System.out.print("超时10秒");
//                break;
//            }
//        }
//    }

    @Autowired
    private SimpleJmsTemplate receiverJmsTemplate;
    @Autowired
    private ActiveMQQueue activeMQQueue;

    @Test
    public void recerver() throws JMSException {
        int i=1;
        while (true){
            i++;
//            ObjectMessage message = (ObjectMessage) receiverJmsTemplate.receiveAndConvert(activeMQQueue);
            TextMessage message = (TextMessage)receiverJmsTemplate.receive(activeMQQueue);
            if (null != message) {
                System.out.println("收到消息==================" + message.getText());
//                if(i==4){
//                    throw new RuntimeException("Exception");
//                }
                receiverJmsTemplate.msgAckAndcloseSession(message);
            } else {
                System.out.print("超时10秒");
                break;
            }
        }
    }
}
