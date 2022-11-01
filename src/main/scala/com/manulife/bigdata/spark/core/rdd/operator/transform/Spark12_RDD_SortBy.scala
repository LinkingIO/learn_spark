package com.manulife.bigdata.spark.core.rdd.operator.transform

import com.manulife.bigdata.spark.core.rdd.operator.transform.SCFactory.sc
import org.apache.spark.rdd.RDD

object Spark12_RDD_SortBy {
  def main(args: Array[String]): Unit = {
    val dataRDD: RDD[Int] = sc.makeRDD(List(1, 2, 3, 4, 1, 3), 2)
    val value: RDD[Int] = dataRDD.sortBy(num => num, false, 4)

    value.collect().foreach(println)

  }
}
