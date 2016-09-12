package com.isuwang.soa.message.service;

import com.isuwang.dapeng.core.SoaException;
import com.isuwang.dapeng.core.message.MessageConsumer;
import com.isuwang.dapeng.core.message.MessageConsumerAction;
import com.isuwang.soa.message.binlog.BinlogEvent;
import com.isuwang.soa.message.binlog.BinlogUtils;
import com.isuwang.soa.message.binlog.demo.BinlogDemoAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.ByteBuffer;
import java.util.List;

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
        List<BinlogEvent> events = BinlogEvent.apply(message);
        events.forEach(binlogEvent -> new BinlogDemoAction(binlogEvent).action());
    }

    @Override
    @MessageConsumerAction(topic = "Binlog")
    public void coCustomerUpdated2(ByteBuffer message) throws SoaException {

        logger.info("onCustomerUpdated2 been called ...");
    }

}
