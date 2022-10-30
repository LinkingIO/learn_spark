package com.manulife.bigdata.scala.chapter07.collection01

object Practice02_WordCount {
  def main(args: Array[String]): Unit = {
    val worldCountTop3: List[(String, Int)] = List("hello scala spark kafka", "hello scala spark", "hello scala", "hello")
      .flatMap(elem => elem.split(" "))
      .groupBy(word => word)
      .map(tuple => (tuple._1, tuple._2.size))
      .toList
      .sortWith((left, right) => left._2 > right._2)
      .take(3)
    println(worldCountTop3.mkString(","))
  }
}
