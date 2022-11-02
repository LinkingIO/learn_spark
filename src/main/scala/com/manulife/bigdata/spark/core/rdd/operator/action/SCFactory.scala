package com.manulife.bigdata.spark.core.rdd.operator.action

import org.apache.spark.{SparkConf, SparkContext}

object SCFactory {
  // TODO 配置环境
  val sparkConf = new SparkConf().setMaster("local[*]").setAppName("spark_RDD_Action")
  val sc: SparkContext = new SparkContext(sparkConf)
}
