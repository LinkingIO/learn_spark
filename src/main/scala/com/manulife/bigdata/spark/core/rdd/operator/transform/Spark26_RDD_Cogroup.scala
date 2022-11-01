package com.manulife.bigdata.spark.core.rdd.operator.transform

import com.manulife.bigdata.spark.core.rdd.operator.transform.SCFactory.sc
import org.apache.spark.rdd.RDD

object Spark26_RDD_Cogroup {
  def main(args: Array[String]): Unit = {
    val dataRDD1 = sc.makeRDD(List(("a",1),("a",2),("c",3),("d",4)))
    val dataRDD2 = sc.makeRDD(List(("a",1),("c",2),("c",3), ("e",5)))

    // 返回一个(K,(Iterable<V>,Iterable<W>))类型的 RDD
    // 类似与SQL中的full join
    val value: RDD[(String, (Iterable[Int], Iterable[Int]))] = dataRDD1.cogroup(dataRDD2)

    value.collect().foreach(println)

  }
}
