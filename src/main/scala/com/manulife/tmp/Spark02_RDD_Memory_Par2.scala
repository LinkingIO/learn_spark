package com.manulife.tmp

import org.apache.spark.{SparkConf, SparkContext}

object Spark02_RDD_Memory_Par2 {
  def main(args: Array[String]): Unit = {
    // TODO 配置环境
    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Memory_RDD_Par2")
    sparkConf.set("spark.default.parallelism", "7")

    val sc: SparkContext = new SparkContext(sparkConf)

    val rdd = sc.makeRDD(List(1, 2, 3, 4, 5),3)
    rdd.saveAsTextFile("output")

    sc.stop()
  }
}
