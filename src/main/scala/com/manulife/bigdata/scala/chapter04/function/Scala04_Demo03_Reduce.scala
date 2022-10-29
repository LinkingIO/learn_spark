package com.manulife.bigdata.scala.chapter04.function

object Scala04_Demo03_Reduce {
  def main(args: Array[String]): Unit = {
    // TODO... Reduce 聚合
    def reduce(array: Array[Int], op:(Int, Int)=>Int): Int ={

      var temp:Int = array(0)
      for (elem <- 1 until array.length) temp = op(temp, array(elem))
      temp
    }

    val data = Array(12, 42, 23, 12)
    val arr1 = reduce(data, (a: Int, b: Int) => a + b)
    println(arr1)

    val arr2 = reduce(data, _ - _)
    println(arr2)
  }

}
