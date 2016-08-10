#### 使用说明

1. 使用IDL定义订阅kafka消息的服务
    ```
    namespace java com.isuwang.soa.message.service
    service CustomerService {
       void onCustomerUpdated(1: binary message),
    }
    ```
    唯一的约束是：参数必须为binary类型

2. 使用dapeng-code-generator生成代码，跟其他soa服务一样

3. install api

4. 实现CustomerService
    ```java
    @MessageConsumer
    public class CustomerServiceImpl implements CustomerService {
    
        @MessageConsumerAction(topic = "Binlog")
        @Override
        public void onCustomerUpdated(ByteBuffer message) throws SoaException {
    
            logger.info("onCustomerUpdated been called ...");
    
            byte[] bytes = new byte[message.remaining()];
            message.get(bytes, 0, bytes.length);
            try {
                CanalEntry.Entry binlog = CanalEntry.Entry.parseFrom(bytes);
                logger.info(binlog.toString());
            } catch (InvalidProtocolBufferException e) {
                logger.error("[KafkaConsumer] [receive] " + e.getMessage(), e);
            }
    
        }
    ```
    注意:
    1. 类上需要使用标签`@MessageConsumer(groupId="customerService")`,groupId不声明时，默认用类名（全路径）作为groupId;
    2. 方法上需要使用标签`@MessageConsumerAction(topic = "Binlog")`, topic不声明时，默认topic为"Binlog"
    
5. 启动mysql, zookeeper, canalServer, kafkaServer, binlogkafkaserver

6. 修改数据表数据，则onCustomerUpdated方法自动被调用：
    ```
    08-10 11:35:23 692 Thread-1 INFO - KafkaConsumer groupId(com.isuwang.soa.message.service.CustomerServiceImpl) topic(Binlog) 收到消息
    08-10 11:35:23 695 MessageConsumerExecutor-1 INFO - com.isuwang.soa.message.service.CustomerServiceImpl收到kafka消息，执行onCustomerUpdated方法
    08-10 11:35:23 695 MessageConsumerExecutor-2 INFO - com.isuwang.soa.message.service.CustomerServiceImpl收到kafka消息，执行coCustomerUpdated2方法
    08-10 11:35:23 696 MessageConsumerExecutor-2 INFO - onCustomerUpdated2 been called ...
    08-10 11:35:23 698 MessageConsumerExecutor-2 INFO - com.isuwang.soa.message.service.CustomerServiceImpl收到kafka消息，执行coCustomerUpdated2方法完成
    08-10 11:35:23 697 MessageConsumerExecutor-1 INFO - onCustomerUpdated been called ...
    08-10 11:35:23 788 MessageConsumerExecutor-1 INFO - header {
      version: 1
      logfileName: "mysql-bin.000012"
      logfileOffset: 1332
      serverId: 1
      serverenCode: "UTF-8"
      executeTime: 1470800112000
      sourceType: MYSQL
      schemaName: "crm"
      tableName: "customers"
      eventLength: 306
      eventType: UPDATE
      ...
      08-10 11:35:23 808 MessageConsumerExecutor-1 INFO - com.isuwang.soa.message.service.CustomerServiceImpl收到kafka消息，执行onCustomerUpdated方法完成
    ```