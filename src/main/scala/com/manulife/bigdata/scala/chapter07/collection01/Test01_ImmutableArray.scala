package com.manulife.bigdata.scala.chapter07.collection01

object Test01_ImmutableArray {
  def main(args: Array[String]): Unit = {
    // Array 继承自IndexedSeq, 查询快，增删慢
    // TODO 创建数组的2种方式
    val arr1: Array[Int] = new Array[Int](5)

    val arr = Array(12, 22, 41, 12, 54)
    println(arr)

    // 数组值内容的查询和修改
    println("================数组值内容的查询和修改======================")
    println(arr(0))
    println(arr(2))
    println(arr(4))
//    println(arr(6))

    arr(2) = 78
    arr(4) = 48
    println(arr(2))
    println(arr(4))



    // TODO 遍历数组
    println("================遍历数组======================")
    // 1. 查看数组
    println(arr.mkString(","))

    // 2. 普通遍历
    for (x <- arr ) { println(x)}

    // 2. 简化遍历
//    arr.foreach(x => println(x))
//    arr.foreach(println(_))
    arr.foreach(println)

    // TODO 不可变数组的扩容
    println("================不可变数组的扩容======================")
    println("arr hashcode: "+ arr.hashCode())
    val new_arr:Array[Int]  = arr :+ 23
    println(new_arr(5))
    println("arr hashcode: "+ arr.hashCode())
  }
}
