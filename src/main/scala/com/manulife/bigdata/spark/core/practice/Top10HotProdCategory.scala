package com.manulife.bigdata.spark.core.practice

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Top10HotProdCategory {
  def main(args: Array[String]): Unit = {
    // 创建Spark运行配置对象
    val conf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("Top10")
    // 创建Spark运行时上下文环境
    val sc: SparkContext = new SparkContext(conf)

    val textRDD: RDD[String] = sc.textFile("input/user_visit_action.csv")

    textRDD.map(record => {
      val elems: Array[String] = record.split(",")
      UserVisitAction(elems(0),elems(1).toLong,elems(2),elems(3).toLong,
        elems(4),elems(5),elems(6).toLong,elems(7).toLong,
        elems(8),elems(9),elems(10),elems(11),elems(12).toLong
      )
    }).map(userAction => (userAction.click_category_id, 1))
      .reduceByKey(_ + _)
      .filter(_._1 != -1)
      .sortBy(_._2, false)
      .collect()
      .take(10).foreach(println)

    sc.stop()

  }
}

//用户访问动作表
case class UserVisitAction(
  date: String,  //用户点击行为的日期
  user_id: Long,  // 用 户 的 ID
  session_id: String,  //Session 的 ID
  page_id: Long,  // 某 个 页 面 的 ID
  action_time: String,  //动作的时间点
  search_keyword: String,  //用户搜索的关键词
  click_category_id: Long,  // 某 一 个 商 品 品 类 的 ID
  click_product_id: Long,  // 某 一 个 商 品 的 ID
  order_category_ids: String,  // 一次订单中所有品类的 ID 集合
  order_product_ids: String,  // 一次订单中所有商品的 ID 集合
  pay_category_ids: String,  // 一次支付中所有品类的 ID 集合
  pay_product_ids: String,  // 一次支付中所有商品的 ID 集合
  city_id: Long  // 城市 id
)

