package com.isuwang.soa.time.service;

import com.isuwang.dapeng.core.SoaException;
import com.isuwang.dapeng.core.timer.ScheduledTask;
import com.isuwang.dapeng.core.timer.ScheduledTaskCron;

/**
 * Created by tangliu on 2016/8/17.
 */
@ScheduledTask
public class TimerTaskServiceImpl implements TimeTaskService {

    @Override
    @ScheduledTaskCron(cron = "0 0/1 * * * ?")
    public void timerTask1() throws SoaException {
        System.out.println("timerTask1 is being executed");
    }

    @Override
    public void timerTask2() throws SoaException {

    }
}
