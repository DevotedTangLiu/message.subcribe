package com.isuwang.soa.message.binlog

import java.nio.ByteBuffer

import com.alibaba.otter.canal.protocol.CanalEntry
import com.alibaba.otter.canal.protocol.CanalEntry.RowData
import spray.json._
import scala.collection.JavaConversions._

/**
  * Created by Ever on 16/9/11.
  */
object BinlogUtils {
  def parseBinlogEvent(message: ByteBuffer): java.util.List[BinlogEvent] = {
    val bytes: Array[Byte] = new Array[Byte](message.remaining)
    message.get(bytes, 0, bytes.length)

    val binlog: CanalEntry.Entry = CanalEntry.Entry.parseFrom(bytes)

    val rowChange: CanalEntry.RowChange = CanalEntry.RowChange.parseFrom(binlog.getStoreValue())

    val execTime = binlog.getHeader().getExecuteTime()
    val eventType: CanalEntry.EventType = binlog.getHeader().getEventType()
    val schema = binlog.getHeader().getSchemaName()
    val tblName = binlog.getHeader().getTableName()
    rowChange.getRowDatasList().map { rowData =>
      val before = getBeforeColumnsList(rowData)
      val after = getAfterColumnsList(rowData)

      BinlogEvent(schema, tblName, eventType,
        execTime, before, after)
    }
  }

  def getBeforeColumnsList(rowData: RowData): JsValue =
    rowData.getBeforeColumnsList.map(column => (column.getName, column.getValue)).toMap.toJson

  def getAfterColumnsList(rowData: RowData): JsValue =
    rowData.getAfterColumnsList.map(column => (column.getName, column.getValue)).toMap.toJson
}
