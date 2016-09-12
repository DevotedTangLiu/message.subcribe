package com.isuwang.soa.message.binlog

import com.alibaba.otter.canal.protocol.CanalEntry.EventType
import spray.json.JsValue

/**
  * binlog事件模型
  *
  * @param schema 库名
  * @param tblName 表名
  * @param eventType 数据变动类型
  * @param timestamp 事件发生的时间戳, 毫秒
  * @param before 变动前的值
  * @param after 变动后的值
  */
case class BinlogEvent(val schema:String, val tblName: String, val eventType: EventType,
                       val timestamp:Long, val before: JsValue, val after: JsValue)
