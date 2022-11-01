package com.manulife.bigdata.spark.core.rdd.operator.transform

import com.manulife.bigdata.spark.core.rdd.operator.transform.SCFactory.sc
import org.apache.spark.rdd.RDD

object Spark14_RDD_Union {
  def main(args: Array[String]): Unit = {
    val dataRDD1: RDD[Int] = sc.makeRDD(List(1, 2, 3, 4))
    val dataRDD2: RDD[Int] = sc.makeRDD(List(3, 4, 5, 6))

    val dataRDD: RDD[Int] = dataRDD1.union(dataRDD2)
    dataRDD.foreach(println)

  }
}
