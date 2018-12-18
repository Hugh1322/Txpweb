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
public class RefundCustomer implements SessionAwareMessageListener<Message> {
//    @Autowired
//    RefundTaskService refundTaskService;

    @Override
    public void onMessage(Message textMessage, Session session) {
        log.info("退款状态查询 入参 textMessage:" + textMessage);

        // true:移出队列, false:留在队列
        boolean bool = false;

        try {
            if (textMessage instanceof TextMessage) {
                TextMessage tm = (TextMessage) textMessage;

                String msg = tm.getText();
                log.info("退款状态查询 入参 msg:" + msg);

//                bool = refundTaskService.receiveMessage(msg);

                if (bool) {
                    tm.acknowledge();
                    session.commit();
                } else {
                    session.rollback();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
