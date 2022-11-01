package com.manulife.bigdata.spark.core.rdd.operator.transform

import com.manulife.bigdata.spark.core.rdd.operator.transform.SCFactory.sc
import org.apache.spark.rdd.RDD

object Spark20_RDD_AggregateByKey {
  def main(args: Array[String]): Unit = {
    // TODO 取出每个分区内相同 key 的最大值然后分区间相加
    val rdd =
      sc.makeRDD(List( ("a",1),("a",2),("c",3),
        ("b",4),("c",5),("c",6)
      ),2)

    rdd.mapPartitionsWithIndex((idx, data) => {
      println("=======current==========")
      println(idx)
      data.foreach(println)
      data
    }).collect()

    // aggregateByKey 算子是函数柯里化，存在两个参数列表
    // 1. 第一个参数列表中的参数表示初始值
    // 2. 第二个参数列表中含有两个参数
    //	2.1 第一个参数表示分区内的计算规则
    //	2.2 第二个参数表示分区间的计算规则
    val result: RDD[(String, Int)] = rdd.aggregateByKey(10)(
      (x, y) => math.max(x, y),
      (x, y) => x + y
    )

    result.collect().foreach(println)

  }
}
