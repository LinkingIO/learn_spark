package com.manulife.bigdata.spark.core.accumulator

import org.apache.spark.{SparkConf, SparkContext}

object Spark01_Accumulator {
  def main(args: Array[String]): Unit = {
    // TODO 配置环境
    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("spark_RDD_operator")
    val sc: SparkContext = new SparkContext(sparkConf)

    val rdd = sc.makeRDD(List(1, 2, 3, 4, 5))
    // 声明累加器
    var sum = sc.longAccumulator("sum")
    rdd.foreach( num => {
      sum.add(num)
    })

    println("Accumulator sum = " + sum)

  }
}
