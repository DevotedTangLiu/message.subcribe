package com.isuwang.soa.message;

import com.isuwang.dapeng.core.SoaException;
import com.isuwang.dapeng.remoting.BaseServiceClient;
import com.isuwang.org.apache.thrift.TException;
import com.isuwang.soa.message.CustomerServiceCodec.*;

public class CustomerServiceClient extends BaseServiceClient {

    public CustomerServiceClient() {
        super("com.isuwang.soa.message.service.CustomerService", "1.0.0");
    }

    @Override
    protected boolean isSoaTransactionalProcess() {
        return false;
    }


    /**
     *
     **/

    public void onCustomerUpdated(java.nio.ByteBuffer message) throws SoaException {
        initContext("onCustomerUpdated");

        try {
            onCustomerUpdated_args onCustomerUpdated_args = new onCustomerUpdated_args();
            onCustomerUpdated_args.setMessage(message);


            onCustomerUpdated_result response = sendBase(onCustomerUpdated_args, new onCustomerUpdated_result(), new OnCustomerUpdated_argsSerializer(), new OnCustomerUpdated_resultSerializer());


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

    public void coCustomerUpdated2(java.nio.ByteBuffer message) throws SoaException {
        initContext("coCustomerUpdated2");

        try {
            coCustomerUpdated2_args coCustomerUpdated2_args = new coCustomerUpdated2_args();
            coCustomerUpdated2_args.setMessage(message);


            coCustomerUpdated2_result response = sendBase(coCustomerUpdated2_args, new coCustomerUpdated2_result(), new CoCustomerUpdated2_argsSerializer(), new CoCustomerUpdated2_resultSerializer());


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
      