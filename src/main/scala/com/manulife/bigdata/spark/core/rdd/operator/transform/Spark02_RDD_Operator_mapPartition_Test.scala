package com.manulife.bigdata.spark.core.rdd.operator.transform

import com.manulife.bigdata.spark.core.rdd.operator.transform.SCFactory.sc
import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark02_RDD_Operator_mapPartition_Test {
  def main(args: Array[String]): Unit = {

    val rdd: RDD[Int] = sc.makeRDD(List(1, 2, 3, 4), 2)

    val mapRDD: RDD[Int] = rdd.mapPartitions(
      iter => {
        List(iter.max).iterator
      }
    )

    mapRDD.collect().foreach(println)

    println(mapRDD.collect().sum)

    sc.stop()

  }
}
