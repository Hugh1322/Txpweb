package com.txp.test;


import com.txp.activemq.base.ProducerService;
import lombok.extern.slf4j.Slf4j;
import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.*;

/**
 * API测试
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@Component
@ContextConfiguration(locations = {"/application-context-test.xml"})
public class ActiveMQTest {

    @Resource
    ProducerService payLogProducer;

    @Test
    public void sendMessageTest(){
        try {
            log.info("接口调用:sendMessageTest");
            payLogProducer.sendMessage("a3");
            ActiveMQQueue activeMQQueue = new ActiveMQQueue("PayLog1_2");
            payLogProducer.sendMessage(activeMQQueue,"a3");
        }catch (Exception e) {
            log.error("sendMessageTest error {}",e);
        }
    }
}
