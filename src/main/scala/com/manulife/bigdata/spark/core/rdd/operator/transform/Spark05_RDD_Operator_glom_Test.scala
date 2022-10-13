package com.manulife.bigdata.spark.core.rdd.operator.transform

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark05_RDD_Operator_glom_Test {
  def main(args: Array[String]): Unit = {
    // TODO 配置环境
    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("spark_RDD_operator")
    val sc: SparkContext = new SparkContext(sparkConf)

    val rdd = sc.makeRDD(List(1, 2, 3, 4), 2)

    // TODO 计算所有分区最大值求和（分区内取最大值，分区间最大值求和）
    val glomRDD: RDD[Array[Int]] = rdd.glom()

    val mapRDD: RDD[Int] = glomRDD.map(data => data.max)

    println(mapRDD.collect().sum)

    sc.stop()

  }
}
