package com.manulife.bigdata.spark.core.rdd.operator.transform

import com.manulife.bigdata.spark.core.rdd.operator.transform.SCFactory.sc
import org.apache.spark.rdd.RDD

object Spark_RDD_Practice {
  def main(args: Array[String]): Unit = {
    // TODO 统计出每一个省份每个广告被点击数量排行的 Top3

    /**
     * 从agent.log读取数据。
     * 分省份: groupBy。
     * 分广告分用户点击量：reduceByKey
     * 取Top3
     */
    val dataRDD: RDD[String] = sc.textFile("input/agent.log")

    val mapRDD: RDD[((String, String), Int)] = dataRDD.map(record => {
      val dataArray: Array[String] = record.split(" ")
      ((dataArray(1), dataArray(4)), 1)
    })

     val provinceMapRDD = mapRDD.reduceByKey(_ + _)
       .map{
         case ((prv, adv), sum) => (prv, (adv, sum))
       }

    val groupByRDD: RDD[(String, Iterable[(String, Int)])] = provinceMapRDD.groupByKey()

    // mapValues 专门用来操作value的算子
    // value如果是一个Iterable迭代器，则需要转换为List，然后用List的方法进行排序以及获取
    val provinceAdvTop3: RDD[(String, List[(String, Int)])] = groupByRDD.mapValues(iter => {
      iter.toList.sortBy(_._2)(Ordering.Int.reverse).take(3)
    })

    provinceAdvTop3.collect().foreach(println)

  }
}
