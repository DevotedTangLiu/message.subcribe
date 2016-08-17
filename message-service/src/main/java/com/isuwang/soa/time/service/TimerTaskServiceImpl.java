package com.isuwang.soa.time.service;

import com.isuwang.dapeng.core.SoaException;
import com.isuwang.dapeng.core.timer.ScheduledTask;
import com.isuwang.dapeng.core.timer.ScheduledTaskCron;
import com.isuwang.dapeng.hello.HelloServiceClient;

/**
 * Created by tangliu on 2016/8/17.
 */
@ScheduledTask
public class TimerTaskServiceImpl implements TimeTaskService {

    @Override
    @ScheduledTaskCron(cron = "0 0/1 * * * ?")
    public void timerTask1() throws SoaException {
        HelloServiceClient client = new HelloServiceClient();
        client.sayHello("tang");
    }

    @Override
    public void timerTask2() throws SoaException {

    }
}
