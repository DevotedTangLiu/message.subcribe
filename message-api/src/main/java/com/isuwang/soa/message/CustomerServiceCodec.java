package com.isuwang.soa.message;

import com.isuwang.dapeng.core.*;
import com.isuwang.org.apache.thrift.TException;
import com.isuwang.org.apache.thrift.protocol.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Optional;

public class CustomerServiceCodec {
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

    public static class TPageResponeSerializer implements TBeanSerializer<com.isuwang.soa.common.util.TPageRespone> {

        @Override
        public void read(com.isuwang.soa.common.util.TPageRespone bean, TProtocol iprot) throws TException {

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
                        if (schemeField.type == TType.I32) {
                            bean.setResults(iprot.readI32());
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
        public void write(com.isuwang.soa.common.util.TPageRespone bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new TStruct("TPageRespone"));


            oprot.writeFieldBegin(new TField("start", TType.I32, (short) 1));
            oprot.writeI32(bean.getStart());
            oprot.writeFieldEnd();

            oprot.writeFieldBegin(new TField("limit", TType.I32, (short) 2));
            oprot.writeI32(bean.getLimit());
            oprot.writeFieldEnd();

            oprot.writeFieldBegin(new TField("results", TType.I32, (short) 3));
            oprot.writeI32(bean.getResults());
            oprot.writeFieldEnd();

            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

        public void validate(com.isuwang.soa.common.util.TPageRespone bean) throws TException {

            if (bean.getStart() == null)
                throw new SoaException(SoaBaseCode.NotNull, "start字段不允许为空");

            if (bean.getLimit() == null)
                throw new SoaException(SoaBaseCode.NotNull, "limit字段不允许为空");

            if (bean.getResults() == null)
                throw new SoaException(SoaBaseCode.NotNull, "results字段不允许为空");

        }

        @Override
        public String toString(com.isuwang.soa.common.util.TPageRespone bean) {
            return bean == null ? "null" : bean.toString();
        }
    }

    public static class TreeNodeSerializer implements TBeanSerializer<com.isuwang.soa.common.util.TreeNode> {

        @Override
        public void read(com.isuwang.soa.common.util.TreeNode bean, TProtocol iprot) throws TException {

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
                            bean.setId(iprot.readI32());
                        } else {
                            TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;

                    case 2:
                        if (schemeField.type == TType.I32) {
                            bean.setParentId(iprot.readI32());
                        } else {
                            TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;

                    case 3:
                        if (schemeField.type == TType.STRING) {
                            bean.setText(iprot.readString());
                        } else {
                            TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;

                    case 4:
                        if (schemeField.type == TType.BOOL) {
                            bean.setLeaf(iprot.readBool());
                        } else {
                            TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;

                    case 5:
                        if (schemeField.type == TType.I32) {
                            bean.setSort(iprot.readI32());
                        } else {
                            TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;

                    case 6:
                        if (schemeField.type == TType.STRING) {
                            bean.setIcon(iprot.readString());
                        } else {
                            TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;

                    case 8:
                        if (schemeField.type == TType.STRING) {
                            bean.setFullName(iprot.readString());
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
        public void write(com.isuwang.soa.common.util.TreeNode bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new TStruct("TreeNode"));


            oprot.writeFieldBegin(new TField("id", TType.I32, (short) 1));
            oprot.writeI32(bean.getId());
            oprot.writeFieldEnd();

            oprot.writeFieldBegin(new TField("parentId", TType.I32, (short) 2));
            oprot.writeI32(bean.getParentId());
            oprot.writeFieldEnd();

            oprot.writeFieldBegin(new TField("text", TType.STRING, (short) 3));
            oprot.writeString(bean.getText());
            oprot.writeFieldEnd();

            oprot.writeFieldBegin(new TField("leaf", TType.BOOL, (short) 4));
            oprot.writeBool(bean.getLeaf());
            oprot.writeFieldEnd();

            oprot.writeFieldBegin(new TField("sort", TType.I32, (short) 5));
            oprot.writeI32(bean.getSort());
            oprot.writeFieldEnd();

            oprot.writeFieldBegin(new TField("icon", TType.STRING, (short) 6));
            oprot.writeString(bean.getIcon());
            oprot.writeFieldEnd();

            oprot.writeFieldBegin(new TField("fullName", TType.STRING, (short) 8));
            oprot.writeString(bean.getFullName());
            oprot.writeFieldEnd();

            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

        public void validate(com.isuwang.soa.common.util.TreeNode bean) throws TException {

            if (bean.getId() == null)
                throw new SoaException(SoaBaseCode.NotNull, "id字段不允许为空");

            if (bean.getParentId() == null)
                throw new SoaException(SoaBaseCode.NotNull, "parentId字段不允许为空");

            if (bean.getText() == null)
                throw new SoaException(SoaBaseCode.NotNull, "text字段不允许为空");

            if (bean.getLeaf() == null)
                throw new SoaException(SoaBaseCode.NotNull, "leaf字段不允许为空");

            if (bean.getSort() == null)
                throw new SoaException(SoaBaseCode.NotNull, "sort字段不允许为空");

            if (bean.getIcon() == null)
                throw new SoaException(SoaBaseCode.NotNull, "icon字段不允许为空");

            if (bean.getFullName() == null)
                throw new SoaException(SoaBaseCode.NotNull, "fullName字段不允许为空");

        }

        @Override
        public String toString(com.isuwang.soa.common.util.TreeNode bean) {
            return bean == null ? "null" : bean.toString();
        }
    }


    public static class onCustomerUpdated_args {

        private java.nio.ByteBuffer message;

        public java.nio.ByteBuffer getMessage() {
            return this.message;
        }

        public void setMessage(java.nio.ByteBuffer message) {
            this.message = message;
        }


        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("{");

            stringBuilder.append("\"").append("message").append("\":").append(message).append(",");

            if (stringBuilder.lastIndexOf(",") > 0)
                stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
            stringBuilder.append("}");

            return stringBuilder.toString();
        }

    }


    public static class onCustomerUpdated_result {


        @Override
        public String toString() {
            return "{}";
        }

    }

    public static class OnCustomerUpdated_argsSerializer implements TBeanSerializer<onCustomerUpdated_args> {

        @Override
        public void read(onCustomerUpdated_args bean, TProtocol iprot) throws TException {

            TField schemeField;
            iprot.readStructBegin();

            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == TType.STOP) {
                    break;
                }

                switch (schemeField.id) {

                    case 1:
                        if (schemeField.type == TType.STRING) {
                            bean.setMessage(iprot.readBinary());
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
        public void write(onCustomerUpdated_args bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new TStruct("onCustomerUpdated_args"));


            oprot.writeFieldBegin(new TField("message", TType.STRING, (short) 1));
            oprot.writeBinary(bean.getMessage());
            oprot.writeFieldEnd();

            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }


        public void validate(onCustomerUpdated_args bean) throws TException {

            if (bean.getMessage() == null)
                throw new SoaException(SoaBaseCode.NotNull, "message字段不允许为空");

        }


        @Override
        public String toString(onCustomerUpdated_args bean) {
            return bean == null ? "null" : bean.toString();
        }

    }

    public static class OnCustomerUpdated_resultSerializer implements TBeanSerializer<onCustomerUpdated_result> {
        @Override
        public void read(onCustomerUpdated_result bean, TProtocol iprot) throws TException {

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
        public void write(onCustomerUpdated_result bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new TStruct("onCustomerUpdated_result"));


            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }


        public void validate(onCustomerUpdated_result bean) throws TException {

        }


        @Override
        public String toString(onCustomerUpdated_result bean) {
            return bean == null ? "null" : bean.toString();
        }
    }

    public static class onCustomerUpdated<I extends com.isuwang.soa.message.service.CustomerService> extends SoaProcessFunction<I, onCustomerUpdated_args, onCustomerUpdated_result, OnCustomerUpdated_argsSerializer, OnCustomerUpdated_resultSerializer> {
        public onCustomerUpdated() {
            super("onCustomerUpdated", new OnCustomerUpdated_argsSerializer(), new OnCustomerUpdated_resultSerializer());
        }

        @Override
        public onCustomerUpdated_result getResult(I iface, onCustomerUpdated_args args) throws TException {
            onCustomerUpdated_result result = new onCustomerUpdated_result();

            iface.onCustomerUpdated(args.message);

            return result;
        }


        @Override
        public onCustomerUpdated_args getEmptyArgsInstance() {
            return new onCustomerUpdated_args();
        }

        @Override
        protected boolean isOneway() {
            return false;
        }
    }

    public static class coCustomerUpdated2_args {

        private java.nio.ByteBuffer message;

        public java.nio.ByteBuffer getMessage() {
            return this.message;
        }

        public void setMessage(java.nio.ByteBuffer message) {
            this.message = message;
        }


        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("{");

            stringBuilder.append("\"").append("message").append("\":").append(message).append(",");

            if (stringBuilder.lastIndexOf(",") > 0)
                stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
            stringBuilder.append("}");

            return stringBuilder.toString();
        }

    }


    public static class coCustomerUpdated2_result {


        @Override
        public String toString() {
            return "{}";
        }

    }

    public static class CoCustomerUpdated2_argsSerializer implements TBeanSerializer<coCustomerUpdated2_args> {

        @Override
        public void read(coCustomerUpdated2_args bean, TProtocol iprot) throws TException {

            TField schemeField;
            iprot.readStructBegin();

            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == TType.STOP) {
                    break;
                }

                switch (schemeField.id) {

                    case 1:
                        if (schemeField.type == TType.STRING) {
                            bean.setMessage(iprot.readBinary());
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
        public void write(coCustomerUpdated2_args bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new TStruct("coCustomerUpdated2_args"));


            oprot.writeFieldBegin(new TField("message", TType.STRING, (short) 1));
            oprot.writeBinary(bean.getMessage());
            oprot.writeFieldEnd();

            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }


        public void validate(coCustomerUpdated2_args bean) throws TException {

            if (bean.getMessage() == null)
                throw new SoaException(SoaBaseCode.NotNull, "message字段不允许为空");

        }


        @Override
        public String toString(coCustomerUpdated2_args bean) {
            return bean == null ? "null" : bean.toString();
        }

    }

    public static class CoCustomerUpdated2_resultSerializer implements TBeanSerializer<coCustomerUpdated2_result> {
        @Override
        public void read(coCustomerUpdated2_result bean, TProtocol iprot) throws TException {

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
        public void write(coCustomerUpdated2_result bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new TStruct("coCustomerUpdated2_result"));


            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }


        public void validate(coCustomerUpdated2_result bean) throws TException {

        }


        @Override
        public String toString(coCustomerUpdated2_result bean) {
            return bean == null ? "null" : bean.toString();
        }
    }

    public static class coCustomerUpdated2<I extends com.isuwang.soa.message.service.CustomerService> extends SoaProcessFunction<I, coCustomerUpdated2_args, coCustomerUpdated2_result, CoCustomerUpdated2_argsSerializer, CoCustomerUpdated2_resultSerializer> {
        public coCustomerUpdated2() {
            super("coCustomerUpdated2", new CoCustomerUpdated2_argsSerializer(), new CoCustomerUpdated2_resultSerializer());
        }

        @Override
        public coCustomerUpdated2_result getResult(I iface, coCustomerUpdated2_args args) throws TException {
            coCustomerUpdated2_result result = new coCustomerUpdated2_result();

            iface.coCustomerUpdated2(args.message);

            return result;
        }


        @Override
        public coCustomerUpdated2_args getEmptyArgsInstance() {
            return new coCustomerUpdated2_args();
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

    public static class getServiceMetadata<I extends com.isuwang.soa.message.service.CustomerService> extends SoaProcessFunction<I, getServiceMetadata_args, getServiceMetadata_result, GetServiceMetadata_argsSerializer, GetServiceMetadata_resultSerializer> {
        public getServiceMetadata() {
            super("getServiceMetadata", new GetServiceMetadata_argsSerializer(), new GetServiceMetadata_resultSerializer());
        }

        @Override
        public getServiceMetadata_result getResult(I iface, getServiceMetadata_args args) throws TException {
            getServiceMetadata_result result = new getServiceMetadata_result();

            try (InputStreamReader isr = new InputStreamReader(CustomerServiceCodec.class.getClassLoader().getResourceAsStream("com.isuwang.soa.message.service.CustomerService.xml"));
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
    public static class Processor<I extends com.isuwang.soa.message.service.CustomerService> extends SoaBaseProcessor {
        public Processor(I iface) {
            super(iface, getProcessMap(new java.util.HashMap<>()));
        }

        @SuppressWarnings("unchecked")
        private static <I extends com.isuwang.soa.message.service.CustomerService> java.util.Map<String, SoaProcessFunction<I, ?, ?, ? extends TBeanSerializer<?>, ? extends TBeanSerializer<?>>> getProcessMap(java.util.Map<String, SoaProcessFunction<I, ?, ?, ? extends TBeanSerializer<?>, ? extends TBeanSerializer<?>>> processMap) {

            processMap.put("onCustomerUpdated", new onCustomerUpdated());

            processMap.put("coCustomerUpdated2", new coCustomerUpdated2());

            processMap.put("getServiceMetadata", new getServiceMetadata());

            return processMap;
        }
    }

}
      