package com.manulife.bigdata.spark.core.broadcast

import org.apache.spark.broadcast.Broadcast
import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark01_BroadCast {
  def main(args: Array[String]): Unit = {
    // TODO 配置环境
    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("")
    val sc: SparkContext = new SparkContext(sparkConf)

    val rdd1 = sc.makeRDD(List( ("a",1), ("b", 2), ("c", 3), ("d", 4) ),4)
    val list = List( ("a",4), ("b", 5), ("c", 6), ("d", 7) )

    val broadcast: Broadcast[List[(String, Int)]] = sc.broadcast(list)

    val result: RDD[(String, (Int, Int))] = rdd1.map({
      case (key, value) => {
        var value2 = 0
        for ((k, v) <- broadcast.value) {
          if (k == key) {
            value2 = v
          }
        }
        (key, (value, value2))
      }
    })

    result.collect().foreach(println)

  }
}
