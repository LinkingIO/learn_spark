package com.manulife.bigdata.spark.core.rdd.operator.transform

import org.apache.spark.{SparkConf, SparkContext}

object SCFactory {
  // TODO 配置环境
  val sparkConf = new SparkConf().setMaster("local[*]").setAppName("spark_RDD_operator")
  val sc: SparkContext = new SparkContext(sparkConf)
}
