package com.manulife.bigdata.scala.chapter07

object Test08_Map {
  def main(args: Array[String]): Unit = {
    // 默认创建不可变Map，其中每个元素存储为元祖。每个元素仅有2个值，称为对偶
    val map: Map[String, Int] = Map("a" -> 1, "b" -> 2, "c" -> 3)

    // 访问数据
    for (elem <- map.keys) println(elem +" = "+ map(elem))

    // get访问map集合，会返回特殊类型Option：有值（Some），无值（None）
    println(map.get("d"))
    // key不存在则返回0
    println(map.get("d").getOrElse(0))
    println(map.getOrElse("d", 0))

  }
}
