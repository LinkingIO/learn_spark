package com.manulife.bigdata.scala.function

object Scala04_Demo01_Map {
  def main(args: Array[String]): Unit = {
    // 模拟 Map 映射
    def map(array: Array[Int], op:Int => Int) ={
      for (elem <- array) yield op(elem)
    }

    val data = Array(12, 42, 23, 12)

    val arr = map(data, _ * 2)
    println(arr.mkString(","))

    val arr1 = map(data, x => x + 1)
    println(arr1.mkString(","))

  }
}
