# Txpweb
## test

#### 打包，-P test是指定用哪个文件下的配置
mvn clean -P test package -DskipTests

#打包时过虑掉一些文件 eg https://www.cnblogs.com/panie2015/p/5737393.html


#### 2018-05-08
1.add junit
2.activeMQ 实现生成消费，手动确认保留信息(mq3.xml 传递对象的有问题，需要升级版本)
    ActiveMqSenderTest
    ActiveMqReceiverTest <MQ3Customer>


#### 2018-06-07
1.add controller
2.上传文件的三种方式对比


#### 2018-06-19
1.add swagger  -- version 0.9.5
