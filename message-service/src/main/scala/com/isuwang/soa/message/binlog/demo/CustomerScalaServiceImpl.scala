//package com.isuwang.soa.message.binlog.demo
//
//import java.nio.ByteBuffer
//
//import com.isuwang.dapeng.message.consumer.api.annotation.MessageConsumer
//import com.isuwang.soa.message.binlog.BinlogEvent
//import com.isuwang.soa.message.binlog.BinlogEvent._
//import com.isuwang.soa.message.service.CustomerService
//import org.slf4j.{Logger, LoggerFactory}
//
///**
//  * Created by Ever on 16/9/12.
//  */
//@MessageConsumer
//class CustomerScalaServiceImpl extends CustomerService {
//  val logger: Logger = LoggerFactory.getLogger(classOf[CustomerScalaServiceImpl])
//
//  override def onCustomerUpdated(message: ByteBuffer): Unit = {
//    logger.info("onCustomerUpdated been called ...")
//    val events: java.util.List[BinlogEvent] = message
//    events.forEach(new BinlogDemoAction(_).action)
//  }
//
//  override def coCustomerUpdated2(message: ByteBuffer): Unit = ???
//}
