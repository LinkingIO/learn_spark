package com.manulife.bigdata.spark.core.rdd.operator.transform

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark02_RDD_Operator_mapPartitionsIndex_Test {
  def main(args: Array[String]): Unit = {
    // TODO 配置环境
    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("spark_RDD_operator")
    val sc: SparkContext = new SparkContext(sparkConf)

    val rdd: RDD[Int] = sc.makeRDD(List(1, 2, 3, 4), 2)
    // TODO 获取第二个分区的数据
    val mapRDDIdx = rdd.mapPartitionsWithIndex(
      (idx, iter) => {
        if (idx == 1) {
          iter.map(_ * 2)
        } else {
          Nil.iterator
        }
      }
    )

    mapRDDIdx.collect().foreach(println)

    sc.stop()

  }
}
