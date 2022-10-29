package com.manulife.bigdata.scala.chapter07.collection01

import scala.collection.mutable

object Test09_MutableMap {
  def main(args: Array[String]): Unit = {
    val map: mutable.Map[String, Int] = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)
    println("==========集合中添加=========")
    map.+=("d" -> 4)
    println(map)

    println("========添加数据并返回原数据========")
    val maybeInt: Option[Int] = map.put("b", 4)
    println(maybeInt)
    println(maybeInt.getOrElse(0))

    println("===========删除元素==========")
    map.-=("b", "c")
    println(map)

    println("===========更新数据==========")
    map.update("d", 5)
    map("d") = 5
    println(map)

  }
}
