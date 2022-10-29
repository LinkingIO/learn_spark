package com.manulife.bigdata.scala.chapter04.function

import scala.collection.mutable.ArrayBuffer

object Scala04_Demo02_Filter {
  def main(args: Array[String]): Unit = {
    // TODO... Filter 过滤
    def filter(array: Array[Int], op: Int=>Boolean):Array[Int]={
      val resultArray: ArrayBuffer[Int] = ArrayBuffer[Int]()
      for (elem <- array) if (op(elem)) resultArray.append(elem)
      resultArray.toArray
    }

    val data = Array(12, 42, 23, 12)

    val arr1 = filter(data, _ % 2 == 1)
    println(arr1.mkString(","))

    val arr2 = filter(data, _ % 2 == 0)
    println(arr2.mkString(","))

  }

}
