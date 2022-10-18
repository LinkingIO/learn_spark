package com.manulife.bigdata.scala.function

object Scala02_TestFunction {
  def main(args: Array[String]): Unit = {
    // TODO.. 函数作为值传递

    // (1)调用 foo 函数，把返回值给变量 f
//    val f1 = foo()
    val f1 = foo
    println(f1)

    // (2)在被调用函数 foo 后面加上 _，相当于把函数 foo 当成一个整体， 传递给变量 f1
    val f2 = foo _
    f2()
    foo()

    // (3)如果明确变量类型，那么不使用下划线也可以将函数作为整体传递给 变量
    var f3: ()=>Int = foo
    f3()
    foo()

  }
  def foo():Int={
    println("foo...")
    2
  }
}
