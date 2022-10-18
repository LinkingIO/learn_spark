package com.manulife.bigdata.scala.function

object Scala02_TestFunction03 {
  def main(args: Array[String]): Unit = {
    // TODO.. 函数可以作为函数返回值返回
    def f1() = {
      def f2()={
        println("start...")
      }
      f2 _
    }

    val f = f1()
    // 因为 f1 函数的返回值依然为函数，所以可以变量 f 可以作为函数继续调用
    f()

    f1()()

  }
}
