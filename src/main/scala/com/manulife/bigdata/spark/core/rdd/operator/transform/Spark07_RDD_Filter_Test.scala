package com.manulife.bigdata.spark.core.rdd.operator.transform

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark07_RDD_Filter_Test {
  def main(args: Array[String]): Unit = {
    // TODO 配置环境
    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("spark_RDD_operator")
    val sc: SparkContext = new SparkContext(sparkConf)

    val logDataRDD: RDD[String] = sc.textFile("input/apache.log")
    val resultRDD: RDD[String] = logDataRDD.filter(record => record.split(" ")(3).substring(0, 10).equals("17/05/2015"))

    resultRDD.groupBy(record => record.split(" ")(6))
      .map(tuple => (tuple._1, tuple._2.size))
      .sortBy(tuple=>tuple._2,false)
      .collect()
      .foreach(println)

//    resultRDD.collect().foreach(record=> {
//      print(record.split(" ")(3))
//      println(record.split(" ")(6))
//    })


    sc.stop()
  }
}
