package com.isuwang.soa.time.service;

import com.isuwang.dapeng.core.Processor;
import com.isuwang.dapeng.core.Service;

/**
 *
 **/
@Service(version = "1.0.0")
@Processor(className = "com.isuwang.soa.time.TimeTaskServiceCodec$Processor")
public interface TimeTaskService {

    /**
     *
     **/


    void timerTask1() throws com.isuwang.dapeng.core.SoaException;


    /**
     *
     **/


    void timerTask2() throws com.isuwang.dapeng.core.SoaException;


}
        