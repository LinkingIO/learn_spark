package com.manulife.bigdata.spark.core.rdd.operator.transform

import com.manulife.bigdata.spark.core.rdd.operator.transform.SCFactory.sc
import org.apache.spark.rdd.RDD

object Spark16_RDD_Zip {
  def main(args: Array[String]): Unit = {
    val dataRDD1: RDD[Int] = sc.makeRDD(List(1, 2, 3, 4, 5))
    val dataRDD2: RDD[String] = sc.makeRDD(List("a","b", "c", "d", "e"))

    // Can only zip RDDs with same number of elements in each partition
    // 将两个RDD中的元素，以键值对的形式合并
    val value: RDD[(Int, String)] = dataRDD1.zip(dataRDD2)

    value.foreach(println)

  }
}
