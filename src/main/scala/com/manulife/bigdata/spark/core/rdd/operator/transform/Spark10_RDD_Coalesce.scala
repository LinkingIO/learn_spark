package com.manulife.bigdata.spark.core.rdd.operator.transform

import com.manulife.bigdata.spark.core.rdd.operator.transform.SCFactory.sc
import org.apache.spark.rdd.RDD

object Spark10_RDD_Coalesce {
  def main(args: Array[String]): Unit = {
    val dataRDD: RDD[Int] = sc.makeRDD(List(1, 3, 3, 2), 6)

    dataRDD.coalesce(2)
    
    sc.stop()
  }
}
