package com.manulife.bigdata.scala.chapter09.exception

object Test03_Throws {
  def main(args: Array[String]): Unit = {
    myToInt()
  }
  // 调用函数处理并将该代码包含在 try-catch 块中，以避免程序异常终止
  @throws(classOf[NumberFormatException])
  def myToInt():Int = {
    "aaa".toInt
  }
}
