package com.manulife.bigdata.scala.chapter07.collection01

import scala.collection.mutable.ListBuffer

object Test05_ListBuffer {
  def main(args: Array[String]): Unit = {

    // 创建可变集合
    val buffer: ListBuffer[Int] = ListBuffer(3, 2, 1, 4)

    println("============添加==================")
    buffer.+=(5) // 末位添加元素
    buffer.append(6)
    buffer.insert(1,2) // 指定位置添加元素
    println(buffer)

    println("===============修改===============")
    buffer(1) = 6
    println(buffer)
    buffer.update(1,7)
    println(buffer)

    println("---------删除---------------")
    val buffer1: ListBuffer[Int] = buffer.-(3)  //生成新的对象进行操作
    println(buffer)
    println(buffer1)
    buffer.-=(3)  // 原对象上删除对应的元素
    println(buffer)


  }
}
