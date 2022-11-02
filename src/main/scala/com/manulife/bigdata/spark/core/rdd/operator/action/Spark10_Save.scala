package com.manulife.bigdata.spark.core.rdd.operator.action

import com.manulife.bigdata.spark.core.rdd.operator.action.SCFactory.sc

object Spark10_Save {
  def main(args: Array[String]): Unit = {
    val rdd = sc.makeRDD(List(1, 2, 3, 4), 4)

    // 保存txt文件
//    rdd.saveAsTextFile("output/saveAction.txt")

    // 序列化成对象保存文件
//    rdd.saveAsObjectFile("output/saveObject.txt")

    rdd.map((_, 1)).saveAsSequenceFile("output")

    sc.stop()
  }
}
