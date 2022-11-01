package com.manulife.bigdata.spark.core.rdd.operator.transform

import com.manulife.bigdata.spark.core.rdd.operator.transform.SCFactory.sc
import org.apache.spark.HashPartitioner

object Spark19_RDD_GroupByKey {
  def main(args: Array[String]): Unit = {
    val dataRDD1 = sc.makeRDD(List(("a",1),("a",2),("c",3)))
    val dataRDD2 = dataRDD1.groupByKey()
    val dataRDD3 = dataRDD1.groupByKey(2)
    val dataRDD4 = dataRDD1.groupByKey(new HashPartitioner(2))

    dataRDD2.foreach(println)

    println("=======groupByKey with partition============")
    dataRDD3.foreachPartition(partitionData =>{
      println(partitionData.mkString(","))
    })

    dataRDD4.foreachPartition(partitionData =>{
      println(partitionData.mkString(","))
    })

  }
}
