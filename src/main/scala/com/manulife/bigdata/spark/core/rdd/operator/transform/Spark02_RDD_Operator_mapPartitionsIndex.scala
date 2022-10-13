package com.manulife.bigdata.spark.core.rdd.operator.transform

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark02_RDD_Operator_mapPartitionsIndex {
  def main(args: Array[String]): Unit = {
    // TODO 配置环境
    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("spark_RDD_operator")
    val sc: SparkContext = new SparkContext(sparkConf)

    val rdd: RDD[Int] = sc.makeRDD(List(1, 2, 3, 4))
    // TODO 有时候需要查找元素所在的分区
    val mapRDDIdx = rdd.mapPartitionsWithIndex(
      (idx, iter) => iter.map(num => (idx, num))
    )

    mapRDDIdx.collect().foreach(println)

    sc.stop()

  }
}
