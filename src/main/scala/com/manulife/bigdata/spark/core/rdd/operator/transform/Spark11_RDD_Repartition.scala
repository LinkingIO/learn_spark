package com.manulife.bigdata.spark.core.rdd.operator.transform

import com.manulife.bigdata.spark.core.rdd.operator.transform.SCFactory.sc
import org.apache.spark.rdd.RDD

object Spark11_RDD_Repartition {
  def main(args: Array[String]): Unit = {
    val dataRDD: RDD[Int] = sc.makeRDD(List(1, 3, 5, 2), 1)

    dataRDD.repartition(4)

    sc.stop()
  }
}
