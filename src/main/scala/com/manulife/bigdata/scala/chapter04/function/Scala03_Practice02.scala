package com.manulife.bigdata.scala.chapter04.function

object Scala03_Practice02 {
  /**
  练习 2: 定义一个函数 func，它接收一个 Int 类型的参数，返回一个函数(记作 f1)。 它返回的函数 f1，接收一个 String 类型的参数，
  同样返回一个函数(记作 f2)。函数 f2 接 收一个 Char 类型的参数，返回一个 Boolean 的值。
  要求调用函数 func(0) (“”) (‘0’)得到返回值为 false，其它情况均返回 true。
   * @param args
   */
  def main(args: Array[String]): Unit = {
    def func(i1: Int) ={
      def f1(s1: String) ={
        def f2(c1: Char)={
          if (i1 == 0 && s1 == "" && c1=='0')
            false
          else
            true
        }
        f2 _
      }
      f1 _
    }
    println(func(0)("")('0'))
    println(func(0)("")('1'))
    println(func(1)("")('1'))
  }
}
