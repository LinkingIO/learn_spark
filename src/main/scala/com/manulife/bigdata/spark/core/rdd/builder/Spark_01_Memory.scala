package com.manulife.bigdata.spark.core.rdd.builder

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark_01_Memory {

  def main(args: Array[String]): Unit = {
    // TODO 配置环境
    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Memory_RDD")
    val sc: SparkContext = new SparkContext(sparkConf)

    // TODO 内存RDD
    val seq: Seq[Int] = Seq[Int](1, 2, 3, 4)
    // parallelize: 并行
    //    val rdd: RDD[Int] = sc.parallelize(seq)
    val rdd: RDD[Int] = sc.makeRDD(seq)
    rdd.foreach(println)

    // TODO 关闭上下文环境
    sc.stop()
  }

}
