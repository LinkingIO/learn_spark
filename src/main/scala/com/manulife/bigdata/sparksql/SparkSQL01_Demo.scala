package com.manulife.bigdata.sparksql

import org.apache.spark.SparkConf
import org.apache.spark.sql.{DataFrame, SparkSession}

object SparkSQL01_Demo {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("SparkSQL")

    val spark: SparkSession = SparkSession.builder().config(conf).getOrCreate()

    import spark.implicits._

    val df: DataFrame = spark.read.json("input/user.json")

    df.show()

    df.createOrReplaceTempView("user")
    spark.sql("select avg(age) from user").show()

    // DSL
    df.select("username", "age").show()

    spark.stop()


  }
}
