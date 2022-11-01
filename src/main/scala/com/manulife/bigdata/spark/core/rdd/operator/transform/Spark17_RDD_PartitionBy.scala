package com.manulife.bigdata.spark.core.rdd.operator.transform

import com.manulife.bigdata.spark.core.rdd.operator.transform.SCFactory.sc
import org.apache.spark.HashPartitioner
import org.apache.spark.rdd.RDD

object Spark17_RDD_PartitionBy {
  def main(args: Array[String]): Unit = {
    val dataRDD: RDD[(Int, String)] = sc.makeRDD(List((1, "a"), (2, "b"), (3, "c")), 3)
    val value: RDD[(Int, String)] = dataRDD.partitionBy(new HashPartitioner(2))

    value.foreach(println)
  }
}
