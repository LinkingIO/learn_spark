package com.manulife.bigdata.spark.core.rdd.operator.transform

import com.manulife.bigdata.spark.core.rdd.operator.transform.SCFactory.sc

object Spark25_RDD_LeftOuterJoin {
  def main(args: Array[String]): Unit = {

    // SQL中的left join
    val dataRDD1 = sc.makeRDD(List(("a",1),("b",2),("c",3),("d",4)))
    val dataRDD2 = sc.makeRDD(List(("a",(1, 2)),("b",2),("c",3)))

    dataRDD1.leftOuterJoin(dataRDD2).collect().foreach(println)
  }
}
