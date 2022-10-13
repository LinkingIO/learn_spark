package com.manulife.bigdata.spark.core.rdd.builder

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark02_RDD_File_par {
  def main(args: Array[String]): Unit = {
    // TODO 配置环境
    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Memory_RDD")
    val sc: SparkContext = new SparkContext(sparkConf)
    /**
     * 12345@@  [0123456]
     * 6789@@  [789101112]
     * 0      [13]
     *
     * 【12345@@6789@@】 【0】
     */
    val rdd: RDD[String] = sc.textFile("input/file.txt", 2)
    rdd.saveAsTextFile("output")

    sc.stop()
  }
}
