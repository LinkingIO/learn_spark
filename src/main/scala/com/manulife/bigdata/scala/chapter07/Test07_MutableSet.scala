package com.manulife.bigdata.scala.chapter07

import scala.collection.mutable

object Test07_MutableSet {
  def main(args: Array[String]): Unit = {
    val set: mutable.Set[Int] = mutable.Set(1, 3, 4, 2, 3, 4)
    println("========增加元素==========")
    set += 8
    println(set)

    println("========减少元素==========")
    set -=(4)
    println(set)

    println("========生成新的可变集合==========")
    val set1: mutable.Set[Int] = set.+(9)
    println(set1)

  }
}
