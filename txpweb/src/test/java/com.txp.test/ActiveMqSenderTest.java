package com.txp.test;


import lombok.extern.slf4j.Slf4j;
import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * API测试
 * 对应MQ3.xml ->生产者
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@Component
@ContextConfiguration(locations = {"/application-context-test.xml"})
public class ActiveMqSenderTest {

    @Autowired
    private JmsTemplate senderJmsTemplate;
    @Autowired
    private ActiveMQQueue activeMQQueue;

    @Test
    public void activeMq(){
        for(int i = 1;i<=10;i++){
            if(i==5 || i==9) {
                senderJmsTemplate.convertAndSend(activeMQQueue,"abc");
            }else {
                senderJmsTemplate.convertAndSend(activeMQQueue,"我是第"+i+"个");
            }
        }
        System.out.print("全部执行完毕!!!");
    }
}
