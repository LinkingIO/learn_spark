package com.manulife.bigdata.spark.core.rdd.operator.transform

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark09_RDD_Distinct {
  def main(args: Array[String]): Unit = {
    // TODO 配置环境
    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("spark_RDD_operator")
    val sc: SparkContext = new SparkContext(sparkConf)

    val dataRDD = sc.makeRDD(List( 1,2,3,4,1,2),1)

    val value: RDD[Int] = dataRDD.distinct()
    value.collect().foreach(println)

    // 控制去重的分区数
    val value1: RDD[Int] = dataRDD.distinct(2)
    value1.collect().foreach(println)

    sc.stop()
  }

}
