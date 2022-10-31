package com.manulife.bigdata.spark.core.rdd.operator.transform

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark06_RDD_Operator_groupBy_Test_ApacheLog {
  def main(args: Array[String]): Unit = {
    // TODO 配置环境
    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("spark_RDD_operator")
    val sc: SparkContext = new SparkContext(sparkConf)

    val rdd: RDD[String] = sc.textFile("input/apache.log")
    val groupByRdd: RDD[(String, Iterable[String])] = rdd.groupBy(records => {
      val dataArray: Array[String] = records.split(" ")
      dataArray(3).substring(0, 13)
    })

    val PVCount: RDD[(String, Int)] = groupByRdd.map(tuple => (tuple._1, tuple._2.size))
    PVCount.collect().foreach(println)

    sc.stop()

  }
}
