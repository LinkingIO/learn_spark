package com.manulife.bigdata.scala.chapter07

object Test10_Tuple {
  def main(args: Array[String]): Unit = {
    val tuple: (String, Int, Boolean) = ("tuple", 10, true)
    println("===========元素的顺序访问元素===========")
    println(tuple._1)
    println(tuple._2)
    println(tuple._3)

    println("=========元素索引访问============")
    println(tuple.productElement(0))

    println("=========迭代器访问==============")
    tuple.productIterator.foreach(println)

    val map: Map[String, Int] = Map("a" -> 1, "b" -> 2, "c" -> 3)
    val map1 = Map(("a", 1), ("b",2), ("c", 3))

    map.foreach(tuple => println(tuple._1 + " = " + tuple._2))
  }
}
