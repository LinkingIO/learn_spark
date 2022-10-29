package com.manulife.bigdata.scala.chapter04.function

object Scala05_ClosureAndCurrying {
  def main(args: Array[String]): Unit = {
    // 1. 固定加数4
    def addByFour(b: Int): Int = {
      4 + b
    }

    // 2. 固定加数5
    def addByFive(b: Int): Int = {
      5 + b
    }

    println(addByFour(12))
    println(addByFive(12))

    // 3. 将固定加数作为另一个参数传入，但作为 第一层参数 传入
    def addByFour1(): (Int => Int) = {
      val a = 4

      def addByB(b: Int): Int = {
        a + b
      }

      addByB
    }

    println(addByFour1()(12))

    // 4. 将固定参数作为第一层参数的行参输入
    def addByA1(a: Int): (Int => Int) = {
      def addByB(b: Int): Int = {
        a + b
      }

      addByB
    }

    println(addByA1(4)(12))
    println(addByA1(5)(12))

    // 5. 闭包简化
    def addByA2(a: Int): (Int => Int) = {
      (b: Int) => {
        a + b
      }
    }

    def addByA3(a: Int): (Int => Int) = {
      b => a + b
    }

    def addByA4(a: Int): (Int => Int) = a + _

    println(addByA4(4)(12))

    // 6. 函数柯里化
    def addCurrying(a: Int)(b:Int) = {
      a + b
    }
    addCurrying(4)(12)

    def addCurrying2(a: Int)(b:Int) = a + b

  }
}
