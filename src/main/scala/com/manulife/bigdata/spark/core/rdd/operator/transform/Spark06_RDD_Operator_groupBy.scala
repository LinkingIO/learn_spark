package com.manulife.bigdata.spark.core.rdd.operator.transform

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark06_RDD_Operator_groupBy {
  def main(args: Array[String]): Unit = {
    // TODO 配置环境
    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("spark_RDD_operator")
    val sc: SparkContext = new SparkContext(sparkConf)

    val rdd = sc.makeRDD(List("Hello", "hive", "hbase", "Hadoop"), 2)

    val groupByRDD: RDD[(String, Iterable[String])] = rdd.groupBy(_.substring(0, 1))
    groupByRDD.collect().foreach(println)

    sc.stop()

  }
}
