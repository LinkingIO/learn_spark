package com.manulife.bigdata.scala.chapter09.exception

object Test01_ExceptionBlocker {
  def main(args: Array[String]): Unit = {
   try {
     val data = 10 / 0
   } catch {
     case ex: ArithmeticException => println("====算数异常============")
     case ex: Exception => println("===========发生异常===========")
  } finally {
   println("finally 处理")
   }
  }
}
