package com.manulife.bigdata.spark.core.rdd.operator.transform

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark07_RDD_Filter {
  def main(args: Array[String]): Unit = {
    // TODO 配置环境
    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("spark_RDD_operator")
    val sc: SparkContext = new SparkContext(sparkConf)

    val dataRDD: RDD[Int] = sc.makeRDD(List(1, 2, 3, 4), 1)
    val resultRDD: RDD[Int] = dataRDD.filter(_ % 2 == 0)
    resultRDD.collect().foreach(println)

    sc.stop()
  }
}
