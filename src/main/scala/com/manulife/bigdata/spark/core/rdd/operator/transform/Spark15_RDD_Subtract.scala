package com.manulife.bigdata.spark.core.rdd.operator.transform

import com.manulife.bigdata.spark.core.rdd.operator.transform.SCFactory.sc
import org.apache.spark.rdd.RDD

object Spark15_RDD_Subtract {
  def main(args: Array[String]): Unit = {
    val dataRDD1: RDD[Int] = sc.makeRDD(List(1, 2, 3, 4))
    val dataRDD2: RDD[Int] = sc.makeRDD(List(3, 4, 5, 6))

    val value: RDD[Int] = dataRDD1.subtract(dataRDD2)

    value.foreach(println)
  }
}
