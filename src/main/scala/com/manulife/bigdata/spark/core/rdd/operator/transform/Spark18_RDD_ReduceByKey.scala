package com.manulife.bigdata.spark.core.rdd.operator.transform

import com.manulife.bigdata.spark.core.rdd.operator.transform.SCFactory.sc

object Spark18_RDD_ReduceByKey {
  def main(args: Array[String]): Unit = {
    val dataRDD1 = sc.makeRDD(List(("a",1),("a",2),("c",3)))
    val dataRDD2 = dataRDD1.reduceByKey(_+_)
    val dataRDD3 = dataRDD1.reduceByKey(_+_, 2)

    dataRDD2.foreach(println)
    dataRDD3.foreach(println)

  }
}
