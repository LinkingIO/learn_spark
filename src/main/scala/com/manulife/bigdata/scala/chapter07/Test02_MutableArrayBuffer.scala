package com.manulife.bigdata.scala.chapter07

import scala.collection.mutable.ArrayBuffer

object Test02_MutableArrayBuffer {
  def main(args: Array[String]): Unit = {
    val arr  = ArrayBuffer[Any](12, 28, 23)

    // 遍历
    arr.foreach(println)
    println(arr.length)
    println("arr hashcode: "+ arr.hashCode())

    // 拼接追加元素
    arr .+= (4)
    println("arr hashcode: "+ arr.hashCode())
    // 数组最后追加元素
    arr.append(5, 6)
    // 指定位置插入元素
    arr.insert(0, 1, 2)
    println("arr hashcode: "+ arr.hashCode())

    println(arr.mkString(","))

    // 修改元素
    arr(2) = 10
    println(arr(2))

  }
}


