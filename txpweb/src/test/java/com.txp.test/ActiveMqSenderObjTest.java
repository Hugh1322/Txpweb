package com.txp.test;


import com.txp.activemq.Person;
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
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@Component
@ContextConfiguration(locations = {"/application-context-test.xml"})
public class ActiveMqSenderObjTest {

    @Autowired
    private JmsTemplate senderJmsTemplate;
    @Autowired
    private ActiveMQQueue activeMQQueue;

    @Test
    public void activeMq(){
        for(int i = 1;i<=2;i++){
            Person person = new Person("姓名"+i,i);
            senderJmsTemplate.convertAndSend(activeMQQueue,person);
        }
        log.info("全部执行完毕!!!");
    }
}
