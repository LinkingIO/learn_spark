package com.manulife.bigdata.scala.chapter04.function

object Scala02_TestFunction02 {
  def main(args: Array[String]): Unit = {
    // TODO.. 函数可以作为参数进行传递

    //(1)定义一个函数，函数参数还是一个函数签名;f 表示函数名称;(Int,Int) 表示输入两个 Int 参数;Int 表示函数返回值
    def f1(f:(Int,Int)=>Int)=f(2, 3)

    // (2)定义一个函数，参数和返回值类型和 f1 的输入参数一致
    def f2(a: Int, b: Int)= a + b

    println(f1(f2))
    println(f1(f2 _))

  }
}
