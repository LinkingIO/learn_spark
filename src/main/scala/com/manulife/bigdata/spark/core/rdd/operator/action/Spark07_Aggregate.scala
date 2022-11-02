package com.manulife.bigdata.spark.core.rdd.operator.action

import com.manulife.bigdata.spark.core.rdd.operator.action.SCFactory.sc

object Spark07_Aggregate {
  def main(args: Array[String]): Unit = {
    val rdd = sc.makeRDD(List(1, 2, 3, 4), 4)

    val result: Int = rdd.aggregate(10)(_ + _, _ + _)

    println(result)

    sc.stop()
  }
}
