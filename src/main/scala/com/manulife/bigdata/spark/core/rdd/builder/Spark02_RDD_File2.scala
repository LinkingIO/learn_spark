package com.manulife.bigdata.spark.core.rdd.builder

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark02_RDD_File2 {
  def main(args: Array[String]): Unit = {
    // TODO 配置环境
    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Memory_RDD")
    val sc: SparkContext = new SparkContext(sparkConf)

    val rdd: RDD[(String, String)] = sc.wholeTextFiles("input")
    rdd.foreach(println)

    sc.stop()
  }

}
