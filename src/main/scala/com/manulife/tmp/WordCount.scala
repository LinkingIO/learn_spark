package com.manulife.tmp

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object WordCount {
  def main(args: Array[String]): Unit = {
    // 创建Spark运行配置对象
    val conf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("WordCount")
    // 创建Spark运行时上下文环境
    val sc: SparkContext = new SparkContext(conf)
    // 读取文件，生成RDD
    val fileRDD: RDD[String] = sc.textFile("input/word.txt")
    // 1对多
    val wordRDD: RDD[String] = fileRDD.flatMap(_.split(" "))
    // 1对1
    val word2OneRDD: RDD[(String, Int)] = wordRDD.map((_, 1))
    // 累加操作_ + _
    val word2CountRDD: RDD[(String, Int)] = word2OneRDD.reduceByKey(_ + _)
    // 数据收集到内容
    val word2Collect: Array[(String, Int)] = word2CountRDD.collect()
    // 遍历结果，展示
    word2Collect.foreach(println)
    sc.stop()
  }
}
