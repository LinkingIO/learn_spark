package com.manulife.tmp

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark02_RDD_Memory_Par {
  def main(args: Array[String]): Unit = {
    // TODO 配置环境
    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Memory_RDD_Par")
    sparkConf.set("spark.default.parallelism", "7")

    val sc: SparkContext = new SparkContext(sparkConf)

    //  numSlices 默认情况下取 spark.default.parallelism属性值 totalCores
    // totalCores 获取到当前系统环境的核数
    // 且spark.default.parallelism 可以指定的
    val rdd = sc.makeRDD(List(1, 2, 3, 4),3)
    rdd.saveAsTextFile("output")

    sc.stop()
  }

}
