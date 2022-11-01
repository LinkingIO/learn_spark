package com.manulife.bigdata.spark.core.rdd.operator.transform

import com.manulife.bigdata.spark.core.rdd.operator.transform.SCFactory.sc
import org.apache.spark.rdd.RDD

object Spark_RDD_Practice {
  def main(args: Array[String]): Unit = {
    // TODO 统计出每一个省份每个广告被点击数量排行的 Top3

    /**
     * 从agent.log读取数据。
     * 分省份: groupBy。
     * 分广告: groupBy。
     * 分用户点击量：reduceByKey
     * 取Top3
     */
    val dataRDD: RDD[String] = sc.textFile("input/agent.log")

    val mapRDD: RDD[((String, String), Int)] = dataRDD.map(record => {
      val dataArray: Array[String] = record.split(" ")
      ((dataArray(1), dataArray(4)), 1)
    })

    val groupByRDD1: RDD[(String, Iterable[String])] = dataRDD.groupBy(_.split(" ")(1))

//    val reduceByKeyRDD: RDD[((String, String), Int)] = mapRDD.reduceByKey(_ + _).sortByKey(false).collect().foreach()


      // .groupBy(tuple=>tuple._2.foreach(_.split(" ")(4)))

//    value.collect().foreach(record=>println(record.mkString(",")))

  }
}
