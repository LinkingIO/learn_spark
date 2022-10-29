package com.manulife.bigdata.scala.chapter07

object Test06_Set {
  def main(args: Array[String]): Unit = {
    // 默认Set不可变，数据无序
    val set: Set[Int] = Set(1, 2, 4, 3)
    println(set)

    val set1: Set[Int] = Set(1, 3, 4, 2, 3, 4)
    println(set1)

    set1.foreach(println)
  }
}
