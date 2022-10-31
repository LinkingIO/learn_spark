package com.manulife.bigdata.spark.core.rdd.operator.transform

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark08_RDD_Sample {
  def main(args: Array[String]): Unit = {
    // TODO 配置环境
    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("spark_RDD_operator")
    val sc: SparkContext = new SparkContext(sparkConf)

    val dataRDD: RDD[Int] = sc.makeRDD(List(1, 2, 3, 4), 1)

    println("=========伯努利算法============")
    val sample1: RDD[Int] = dataRDD.sample(false, .5)
    sample1.collect().foreach(println)

    println("=========泊松算法============")
    val sample2: RDD[Int] = dataRDD.sample(true, 2)
    sample2.collect().foreach(println)

    sc.stop()
  }
}
