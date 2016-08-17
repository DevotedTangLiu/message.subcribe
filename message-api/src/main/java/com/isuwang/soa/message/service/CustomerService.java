package com.isuwang.soa.message.service;

import com.isuwang.dapeng.core.Processor;
import com.isuwang.dapeng.core.Service;

/**
 *
 **/
@Service(version = "1.0.0")
@Processor(className = "com.isuwang.soa.message.CustomerServiceCodec$Processor")
public interface CustomerService {

    /**
     *
     **/


    void onCustomerUpdated(java.nio.ByteBuffer message) throws com.isuwang.dapeng.core.SoaException;


    /**
     *
     **/


    void coCustomerUpdated2(java.nio.ByteBuffer message) throws com.isuwang.dapeng.core.SoaException;


}
        