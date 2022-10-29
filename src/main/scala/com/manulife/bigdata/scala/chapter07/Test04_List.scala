package com.manulife.bigdata.scala.chapter07

object Test04_List {
  def main(args: Array[String]): Unit = {
    // List 默认为不可变集合，是LearSql的实现

    // 创建List
    val list: List[Int] = List(1, 4, 12, 2, 11)
    println(list)
    val list1 = 5::list
    println(list1)

    // 空集合Nil, list运算规则从右往左
    val listAdd = 4::3::2::1::Nil
    println(listAdd)

    val list2 = listAdd.+:(5)
    println(list2)
    println(7::6::list2)

    // 集合间合并
    val list3 = List(8, 9)
    val list4 = list3 ::: list1
    println(list4)

    // 查询数据
    println(list(0))

    // 遍历
    listAdd.foreach(println)

  }
}
