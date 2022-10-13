package com.manulife.bigdata.spark.core.rdd.operator.transform

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark04_RDD_Operator_flatMap {
  def main(args: Array[String]): Unit = {
    // TODO 配置环境
    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("spark_RDD_operator")
    val sc: SparkContext = new SparkContext(sparkConf)

    val rdd: RDD[List[Int]] = sc.makeRDD(List(List(1, 2), List(3, 4)), 2)
    rdd.foreach(print)

    // TODO 算子扁平化
    val flatMapRDD = rdd.flatMap(list =>{
      list
    })

    flatMapRDD.foreach(print)

    sc.stop()

  }
}
