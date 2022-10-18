package com.manulife.bigdata.scala.function

object Scala03_Practice01 {
  /**
   * 练习 1:定义一个匿名函数，并将它作为值赋给变量 fun。函数有三个参数，类型分别
   * 为 Int，String，Char，返回值类型为 Boolean。
   * 要求调用函数 fun(0, “”, ‘0’)得到返回值为 false，其它情况均返回 true。
   * @param args
   */
  def main(args: Array[String]): Unit = {
    val fun = (i: Int, s: String, c: Char) => if(i == 0 && s == "" && c == '0')  false else true

    println(fun(0, "", '0'))
    println(fun(0, "", '1'))
    println(fun(1, "", '0'))
  }

}
