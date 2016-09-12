package com.isuwang.soa.message.binlog.demo

import com.alibaba.otter.canal.protocol.CanalEntry
import com.isuwang.soa.message.binlog.BinlogEvent
import spray.json._

/**
  * Created by Ever on 16/9/7.
  */
class BinlogDemoAction(binlogEvent: BinlogEvent) {
  def action =
  binlogEvent match {
    case BinlogEvent("crm", "customers", CanalEntry.EventType.INSERT, timestamp, json"""{"id"=235}""", _) =>

  }

}
