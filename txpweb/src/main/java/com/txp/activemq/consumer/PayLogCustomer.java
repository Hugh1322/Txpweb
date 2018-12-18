package com.txp.activemq.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.listener.SessionAwareMessageListener;

import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

/**
 * ---消费者
 */
@Slf4j
public class PayLogCustomer implements SessionAwareMessageListener<Message> {
//    @Autowired
//    PayLogTaskService payLogTaskService;

    @Override
    public void onMessage(Message textMessage, Session session) {
        log.info("支付状态查询 入参 textMessage:" + textMessage);

        // true:移出队列, false:留在队列
        boolean bool = false;

        try {
            if (textMessage instanceof TextMessage) {
                TextMessage tm = (TextMessage) textMessage;

                String msg = tm.getText();
                log.info("支付状态查询 入参 msg:" + msg);

                if(msg.equals("abc")) {
                    bool = true;
                }else {
//                    throw new RuntimeException("故意抛出的异常");
                }
//                bool = payLogTaskService.receiveMessage(msg);

                if (bool) {
                    log.info("if status : {}" + bool);
                    tm.acknowledge();
                    session.commit();
                } else {
                    log.info("else status : {}" + bool);
                    session.rollback();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
