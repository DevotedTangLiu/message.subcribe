package com.isuwang.soa.time;

import com.isuwang.dapeng.core.*;
import com.isuwang.org.apache.thrift.TException;
import com.isuwang.org.apache.thrift.protocol.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Optional;

public class TimeTaskServiceCodec {
    public static class RequestHeaderSerializer implements TBeanSerializer<com.isuwang.soa.common.util.RequestHeader> {

        @Override
        public void read(com.isuwang.soa.common.util.RequestHeader bean, TProtocol iprot) throws TException {

            TField schemeField;
            iprot.readStructBegin();

            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == TType.STOP) {
                    break;
                }

                switch (schemeField.id) {

                    case 1:
                        if (schemeField.type == TType.I32) {
                            bean.setOperatorId(iprot.readI32());
                        } else {
                            TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;

                    case 2:
                        if (schemeField.type == TType.STRING) {
                            bean.setOperatorName(iprot.readString());
                        } else {
                            TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;

                    case 3:
                        if (schemeField.type == TType.I32) {
                            bean.setCustomerId(Optional.of(iprot.readI32()));
                        } else {
                            TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;

                    case 4:
                        if (schemeField.type == TType.STRING) {
                            bean.setCustomerName(Optional.of(iprot.readString()));
                        } else {
                            TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;

                    case 5:
                        if (schemeField.type == TType.I32) {
                            bean.setCallerFrom(Optional.of(com.isuwang.soa.common.util.CallerFrom.findByValue(iprot.readI32())));
                        } else {
                            TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;

                    case 6:
                        if (schemeField.type == TType.STRING) {
                            bean.setCallerIP(Optional.of(iprot.readString()));
                        } else {
                            TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;

                    case 7:
                        if (schemeField.type == TType.STRING) {
                            bean.setSessionId(Optional.of(iprot.readString()));
                        } else {
                            TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;


                    default:
                        TProtocolUtil.skip(iprot, schemeField.type);

                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            validate(bean);
        }

        @Override
        public void write(com.isuwang.soa.common.util.RequestHeader bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new TStruct("RequestHeader"));


            oprot.writeFieldBegin(new TField("operatorId", TType.I32, (short) 1));
            oprot.writeI32(bean.getOperatorId());
            oprot.writeFieldEnd();

            oprot.writeFieldBegin(new TField("operatorName", TType.STRING, (short) 2));
            oprot.writeString(bean.getOperatorName());
            oprot.writeFieldEnd();
            if (bean.getCustomerId().isPresent()) {
                oprot.writeFieldBegin(new TField("customerId", TType.I32, (short) 3));
                oprot.writeI32(bean.getCustomerId().get());
                oprot.writeFieldEnd();
            }
            if (bean.getCustomerName().isPresent()) {
                oprot.writeFieldBegin(new TField("customerName", TType.STRING, (short) 4));
                oprot.writeString(bean.getCustomerName().get());
                oprot.writeFieldEnd();
            }
            if (bean.getCallerFrom().isPresent()) {
                oprot.writeFieldBegin(new TField("callerFrom", TType.I32, (short) 5));
                oprot.writeI32(bean.getCallerFrom().get().getValue());
                oprot.writeFieldEnd();
            }
            if (bean.getCallerIP().isPresent()) {
                oprot.writeFieldBegin(new TField("callerIP", TType.STRING, (short) 6));
                oprot.writeString(bean.getCallerIP().get());
                oprot.writeFieldEnd();
            }
            if (bean.getSessionId().isPresent()) {
                oprot.writeFieldBegin(new TField("sessionId", TType.STRING, (short) 7));
                oprot.writeString(bean.getSessionId().get());
                oprot.writeFieldEnd();
            }

            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

        public void validate(com.isuwang.soa.common.util.RequestHeader bean) throws TException {

            if (bean.getOperatorId() == null)
                throw new SoaException(SoaBaseCode.NotNull, "operatorId字段不允许为空");

            if (bean.getOperatorName() == null)
                throw new SoaException(SoaBaseCode.NotNull, "operatorName字段不允许为空");

        }

        @Override
        public String toString(com.isuwang.soa.common.util.RequestHeader bean) {
            return bean == null ? "null" : bean.toString();
        }
    }

    public static class TPageRequestSerializer implements TBeanSerializer<com.isuwang.soa.common.util.TPageRequest> {

        @Override
        public void read(com.isuwang.soa.common.util.TPageRequest bean, TProtocol iprot) throws TException {

            TField schemeField;
            iprot.readStructBegin();

            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == TType.STOP) {
                    break;
                }

                switch (schemeField.id) {

                    case 1:
                        if (schemeField.type == TType.I32) {
                            bean.setStart(iprot.readI32());
                        } else {
                            TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;

                    case 2:
                        if (schemeField.type == TType.I32) {
                            bean.setLimit(iprot.readI32());
                        } else {
                            TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;

                    case 3:
                        if (schemeField.type == TType.STRING) {
                            bean.setSortFields(Optional.of(iprot.readString()));
                        } else {
                            TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;


                    default:
                        TProtocolUtil.skip(iprot, schemeField.type);

                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            validate(bean);
        }

        @Override
        public void write(com.isuwang.soa.common.util.TPageRequest bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new TStruct("TPageRequest"));


            oprot.writeFieldBegin(new TField("start", TType.I32, (short) 1));
            oprot.writeI32(bean.getStart());
            oprot.writeFieldEnd();

            oprot.writeFieldBegin(new TField("limit", TType.I32, (short) 2));
            oprot.writeI32(bean.getLimit());
            oprot.writeFieldEnd();
            if (bean.getSortFields().isPresent()) {
                oprot.writeFieldBegin(new TField("sortFields", TType.STRING, (short) 3));
                oprot.writeString(bean.getSortFields().get());
                oprot.writeFieldEnd();
            }

            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

        public void validate(com.isuwang.soa.common.util.TPageRequest bean) throws TException {

            if (bean.getStart() == null)
                throw new SoaException(SoaBaseCode.NotNull, "start字段不允许为空");

            if (bean.getLimit() == null)
                throw new SoaException(SoaBaseCode.NotNull, "limit字段不允许为空");

        }

        @Override
        public String toString(com.isuwang.soa.common.util.TPageRequest bean) {
            return bean == null ? "null" : bean.toString();
        }
    }

    public static class timerTask1_args {


        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("{");

            if (stringBuilder.lastIndexOf(",") > 0)
                stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
            stringBuilder.append("}");

            return stringBuilder.toString();
        }

    }


    public static class timerTask1_result {


        @Override
        public String toString() {
            return "{}";
        }

    }

    public static class TimerTask1_argsSerializer implements TBeanSerializer<timerTask1_args> {

        @Override
        public void read(timerTask1_args bean, TProtocol iprot) throws TException {

            TField schemeField;
            iprot.readStructBegin();

            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == TType.STOP) {
                    break;
                }

                switch (schemeField.id) {


                    default:
                        TProtocolUtil.skip(iprot, schemeField.type);

                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            validate(bean);
        }


        @Override
        public void write(timerTask1_args bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new TStruct("timerTask1_args"));


            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }


        public void validate(timerTask1_args bean) throws TException {

        }


        @Override
        public String toString(timerTask1_args bean) {
            return bean == null ? "null" : bean.toString();
        }

    }

    public static class TimerTask1_resultSerializer implements TBeanSerializer<timerTask1_result> {
        @Override
        public void read(timerTask1_result bean, TProtocol iprot) throws TException {

            TField schemeField;
            iprot.readStructBegin();

            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == TType.STOP) {
                    break;
                }

                switch (schemeField.id) {
                    case 0:  //SUCCESS
                        if (schemeField.type == TType.VOID) {
                            TProtocolUtil.skip(iprot, schemeField.type);
                        } else {
                            TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    /*
                    case 1: //ERROR
                        bean.setSoaException(new SoaException());
                        new SoaExceptionSerializer().read(bean.getSoaException(), iprot);
                        break A;
                    */
                    default:
                        TProtocolUtil.skip(iprot, schemeField.type);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            validate(bean);
        }

        @Override
        public void write(timerTask1_result bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new TStruct("timerTask1_result"));


            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }


        public void validate(timerTask1_result bean) throws TException {

        }


        @Override
        public String toString(timerTask1_result bean) {
            return bean == null ? "null" : bean.toString();
        }
    }

    public static class timerTask1<I extends com.isuwang.soa.time.service.TimeTaskService> extends SoaProcessFunction<I, timerTask1_args, timerTask1_result, TimerTask1_argsSerializer, TimerTask1_resultSerializer> {
        public timerTask1() {
            super("timerTask1", new TimerTask1_argsSerializer(), new TimerTask1_resultSerializer());
        }

        @Override
        public timerTask1_result getResult(I iface, timerTask1_args args) throws TException {
            timerTask1_result result = new timerTask1_result();

            iface.timerTask1();

            return result;
        }


        @Override
        public timerTask1_args getEmptyArgsInstance() {
            return new timerTask1_args();
        }

        @Override
        protected boolean isOneway() {
            return false;
        }
    }

    public static class timerTask2_args {


        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("{");

            if (stringBuilder.lastIndexOf(",") > 0)
                stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
            stringBuilder.append("}");

            return stringBuilder.toString();
        }

    }


    public static class timerTask2_result {


        @Override
        public String toString() {
            return "{}";
        }

    }

    public static class TimerTask2_argsSerializer implements TBeanSerializer<timerTask2_args> {

        @Override
        public void read(timerTask2_args bean, TProtocol iprot) throws TException {

            TField schemeField;
            iprot.readStructBegin();

            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == TType.STOP) {
                    break;
                }

                switch (schemeField.id) {


                    default:
                        TProtocolUtil.skip(iprot, schemeField.type);

                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            validate(bean);
        }


        @Override
        public void write(timerTask2_args bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new TStruct("timerTask2_args"));


            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }


        public void validate(timerTask2_args bean) throws TException {

        }


        @Override
        public String toString(timerTask2_args bean) {
            return bean == null ? "null" : bean.toString();
        }

    }

    public static class TimerTask2_resultSerializer implements TBeanSerializer<timerTask2_result> {
        @Override
        public void read(timerTask2_result bean, TProtocol iprot) throws TException {

            TField schemeField;
            iprot.readStructBegin();

            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == TType.STOP) {
                    break;
                }

                switch (schemeField.id) {
                    case 0:  //SUCCESS
                        if (schemeField.type == TType.VOID) {
                            TProtocolUtil.skip(iprot, schemeField.type);
                        } else {
                            TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    /*
                    case 1: //ERROR
                        bean.setSoaException(new SoaException());
                        new SoaExceptionSerializer().read(bean.getSoaException(), iprot);
                        break A;
                    */
                    default:
                        TProtocolUtil.skip(iprot, schemeField.type);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            validate(bean);
        }

        @Override
        public void write(timerTask2_result bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new TStruct("timerTask2_result"));


            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }


        public void validate(timerTask2_result bean) throws TException {

        }


        @Override
        public String toString(timerTask2_result bean) {
            return bean == null ? "null" : bean.toString();
        }
    }

    public static class timerTask2<I extends com.isuwang.soa.time.service.TimeTaskService> extends SoaProcessFunction<I, timerTask2_args, timerTask2_result, TimerTask2_argsSerializer, TimerTask2_resultSerializer> {
        public timerTask2() {
            super("timerTask2", new TimerTask2_argsSerializer(), new TimerTask2_resultSerializer());
        }

        @Override
        public timerTask2_result getResult(I iface, timerTask2_args args) throws TException {
            timerTask2_result result = new timerTask2_result();

            iface.timerTask2();

            return result;
        }


        @Override
        public timerTask2_args getEmptyArgsInstance() {
            return new timerTask2_args();
        }

        @Override
        protected boolean isOneway() {
            return false;
        }
    }


    public static class getServiceMetadata_args {

        @Override
        public String toString() {
            return "{}";
        }
    }


    public static class getServiceMetadata_result {

        private String success;

        public String getSuccess() {
            return success;
        }

        public void setSuccess(String success) {
            this.success = success;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("{");
            stringBuilder.append("\"").append("success").append("\":\"").append(this.success).append("\",");
            stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
            stringBuilder.append("}");

            return stringBuilder.toString();
        }
    }

    public static class GetServiceMetadata_argsSerializer implements TBeanSerializer<getServiceMetadata_args> {

        @Override
        public void read(getServiceMetadata_args bean, TProtocol iprot) throws TException {

            TField schemeField;
            iprot.readStructBegin();

            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                    default:
                        TProtocolUtil.skip(iprot, schemeField.type);

                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            validate(bean);
        }


        @Override
        public void write(getServiceMetadata_args bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new TStruct("getServiceMetadata_args"));
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

        public void validate(getServiceMetadata_args bean) throws TException {
        }

        @Override
        public String toString(getServiceMetadata_args bean) {
            return bean == null ? "null" : bean.toString();
        }

    }

    public static class GetServiceMetadata_resultSerializer implements TBeanSerializer<getServiceMetadata_result> {
        @Override
        public void read(getServiceMetadata_result bean, TProtocol iprot) throws TException {

            TField schemeField;
            iprot.readStructBegin();

            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == TType.STOP) {
                    break;
                }

                switch (schemeField.id) {
                    case 0:  //SUCCESS
                        if (schemeField.type == TType.STRING) {
                            bean.setSuccess(iprot.readString());
                        } else {
                            TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    default:
                        TProtocolUtil.skip(iprot, schemeField.type);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            validate(bean);
        }

        @Override
        public void write(getServiceMetadata_result bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new TStruct("getServiceMetadata_result"));

            oprot.writeFieldBegin(new TField("success", TType.STRING, (short) 0));
            oprot.writeString(bean.getSuccess());
            oprot.writeFieldEnd();

            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

        public void validate(getServiceMetadata_result bean) throws TException {

            if (bean.getSuccess() == null)
                throw new SoaException(SoaBaseCode.NotNull, "success字段不允许为空");
        }

        @Override
        public String toString(getServiceMetadata_result bean) {
            return bean == null ? "null" : bean.toString();
        }
    }

    public static class getServiceMetadata<I extends com.isuwang.soa.time.service.TimeTaskService> extends SoaProcessFunction<I, getServiceMetadata_args, getServiceMetadata_result, GetServiceMetadata_argsSerializer, GetServiceMetadata_resultSerializer> {
        public getServiceMetadata() {
            super("getServiceMetadata", new GetServiceMetadata_argsSerializer(), new GetServiceMetadata_resultSerializer());
        }

        @Override
        public getServiceMetadata_result getResult(I iface, getServiceMetadata_args args) throws TException {
            getServiceMetadata_result result = new getServiceMetadata_result();

            try (InputStreamReader isr = new InputStreamReader(TimeTaskServiceCodec.class.getClassLoader().getResourceAsStream("com.isuwang.soa.time.service.TimeTaskService.xml"));
                 BufferedReader in = new BufferedReader(isr)) {
                int len = 0;
                StringBuilder str = new StringBuilder("");
                String line;
                while ((line = in.readLine()) != null) {

                    if (len != 0) {
                        str.append("\r\n").append(line);
                    } else {
                        str.append(line);
                    }
                    len++;
                }
                result.success = str.toString();

            } catch (Exception e) {
                e.printStackTrace();
                result.success = "";
            }

            return result;
        }

        @Override
        public getServiceMetadata_args getEmptyArgsInstance() {
            return new getServiceMetadata_args();
        }

        @Override
        protected boolean isOneway() {
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    public static class Processor<I extends com.isuwang.soa.time.service.TimeTaskService> extends SoaBaseProcessor {
        public Processor(I iface) {
            super(iface, getProcessMap(new java.util.HashMap<>()));
        }

        @SuppressWarnings("unchecked")
        private static <I extends com.isuwang.soa.time.service.TimeTaskService> java.util.Map<String, SoaProcessFunction<I, ?, ?, ? extends TBeanSerializer<?>, ? extends TBeanSerializer<?>>> getProcessMap(java.util.Map<String, SoaProcessFunction<I, ?, ?, ? extends TBeanSerializer<?>, ? extends TBeanSerializer<?>>> processMap) {

            processMap.put("timerTask1", new timerTask1());

            processMap.put("timerTask2", new timerTask2());

            processMap.put("getServiceMetadata", new getServiceMetadata());

            return processMap;
        }
    }

}
      