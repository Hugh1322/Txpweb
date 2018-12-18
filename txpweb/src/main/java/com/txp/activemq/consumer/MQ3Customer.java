package com.txp.activemq.consumer;

import com.txp.activemq.Person;
import com.txp.activemq.util.SimpleJmsTemplate;
import lombok.extern.slf4j.Slf4j;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.listener.SessionAwareMessageListener;

import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import javax.jms.TextMessage;

/**
 * ---消费者
 */
@Slf4j
public class MQ3Customer implements SessionAwareMessageListener<Message> {
//    @Autowired
//    PayLogTaskService payLogTaskService;

//    @Override
//    public void onMessage(Message textMessage, Session session) {
//        log.info("MQ3Customer :" + textMessage);
//
//    }

    @Autowired
    private SimpleJmsTemplate receiverJmsTemplate;
    @Autowired
    private ActiveMQQueue activeMQQueue;

    @Override
    public void onMessage(Message textMessage, Session session) {
        log.info("支付状态查询 入参 textMessage:" + textMessage);

        // true:移出队列, false:留在队列
        boolean bool = false;

        try {
            if (textMessage instanceof TextMessage) {
//                TextMessage message = (TextMessage)receiverJmsTemplate.receive(activeMQQueue);
                TextMessage message = (TextMessage) textMessage;

                String msg = message.getText();
                log.info("MQ3Customer 消费检查 msg:" + msg);

                if(!msg.equals("abc")) {
                    bool = true;
                }

                if (bool) {
                    log.info("if status : {}" + bool);
                    receiverJmsTemplate.msgAckAndcloseSession(message);
                } else {
                    log.info("else status : {}" + bool);
                }
            } else if(textMessage instanceof ObjectMessage) {
                ObjectMessage message = (ObjectMessage) textMessage;
                Person person = (Person)message.getObject();
                log.info("MQ3Customer 消费检查 obj:" + person.getName() + "\t" + person.getAge());
                receiverJmsTemplate.msgAckAndcloseSession(message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
