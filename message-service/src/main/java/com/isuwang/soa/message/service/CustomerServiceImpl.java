package com.isuwang.soa.message.service;

import com.alibaba.otter.canal.protocol.CanalEntry;
import com.google.protobuf.InvalidProtocolBufferException;
import com.isuwang.dapeng.core.SoaException;
import com.isuwang.dapeng.core.message.MessageConsumer;
import com.isuwang.dapeng.core.message.MessageConsumerAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.ByteBuffer;

/**
 * Created by tangliu on 2016/8/3.
 */
@MessageConsumer
public class CustomerServiceImpl implements CustomerService {

    Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);

    @MessageConsumerAction(topic = "Binlog")
    @Override
    public void onCustomerUpdated(ByteBuffer message) throws SoaException {

        logger.info("onCustomerUpdated been called ...");

        byte[] bytes = new byte[message.remaining()];
        message.get(bytes, 0, bytes.length);

        try {
            CanalEntry.Entry binlog = CanalEntry.Entry.parseFrom(bytes);
            logger.info(binlog.toString());
            CanalEntry.RowChange rowChange = CanalEntry.RowChange.parseFrom(binlog.getStoreValue());
            logger.info(rowChange.toString());

        } catch (InvalidProtocolBufferException e) {
            logger.error("[KafkaConsumer] [receive] " + e.getMessage(), e);
        }

    }

    @Override
    @MessageConsumerAction(topic = "Binlog")
    public void coCustomerUpdated2(ByteBuffer message) throws SoaException {

        logger.info("onCustomerUpdated2 been called ...");
    }

}
