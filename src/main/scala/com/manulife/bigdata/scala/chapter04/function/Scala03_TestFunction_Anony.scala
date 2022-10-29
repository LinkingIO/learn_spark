package com.manulife.bigdata.scala.chapter04.function

object Scala03_TestFunction_Anony {
  def main(args: Array[String]): Unit = {
    // 对数组进行处理，将操作抽象，处理完毕后返回一个新数组, 相当于map操作
    val arr: Array[Int] = Array(12, 43, 12, 23, 42, 22)
    def arrayOperation(array: Array[Int], op:Int=>Int): Array[Int] = {
      for (ele <- array) yield op(ele)
    }

    def addOne(elem: Int) = elem + 1

    val outArray: Array[Int] = arrayOperation(arr, addOne _)
    println("======================Map: + 1================")
    print(outArray.mkString(","))
    println()

    val out2: Array[Int] = arrayOperation(arr, elem => elem * 2)
    println("======================Anonymous================")
    print(out2.mkString(","))
    println()

    val out3: Array[Int] = arrayOperation(arr, _ * 2)
    println("====================simplify==================")
    print(out3.mkString(","))
    println()

  }

}
