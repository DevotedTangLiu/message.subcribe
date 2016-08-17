package com.isuwang.soa.time;

import com.isuwang.dapeng.core.SoaException;
import com.isuwang.dapeng.remoting.BaseServiceClient;
import com.isuwang.org.apache.thrift.TException;
import com.isuwang.soa.time.TimeTaskServiceCodec.*;

public class TimeTaskServiceClient extends BaseServiceClient {

    public TimeTaskServiceClient() {
        super("com.isuwang.soa.time.service.TimeTaskService", "1.0.0");
    }

    @Override
    protected boolean isSoaTransactionalProcess() {
        return false;
    }


    /**
     *
     **/

    public void timerTask1() throws SoaException {
        initContext("timerTask1");

        try {
            timerTask1_args timerTask1_args = new timerTask1_args();


            timerTask1_result response = sendBase(timerTask1_args, new timerTask1_result(), new TimerTask1_argsSerializer(), new TimerTask1_resultSerializer());


        } catch (SoaException e) {
            throw e;
        } catch (TException e) {
            throw new SoaException(e);
        } finally {
            destoryContext();
        }
    }


    /**
     *
     **/

    public void timerTask2() throws SoaException {
        initContext("timerTask2");

        try {
            timerTask2_args timerTask2_args = new timerTask2_args();


            timerTask2_result response = sendBase(timerTask2_args, new timerTask2_result(), new TimerTask2_argsSerializer(), new TimerTask2_resultSerializer());


        } catch (SoaException e) {
            throw e;
        } catch (TException e) {
            throw new SoaException(e);
        } finally {
            destoryContext();
        }
    }


    /**
     * getServiceMetadata
     **/
    public String getServiceMetadata() throws SoaException {
        initContext("getServiceMetadata");
        try {
            getServiceMetadata_args getServiceMetadata_args = new getServiceMetadata_args();
            getServiceMetadata_result response = sendBase(getServiceMetadata_args, new getServiceMetadata_result(), new GetServiceMetadata_argsSerializer(), new GetServiceMetadata_resultSerializer());
            return response.getSuccess();
        } catch (SoaException e) {
            throw e;
        } catch (TException e) {
            throw new SoaException(e);
        } finally {
            destoryContext();
        }
    }

}
      