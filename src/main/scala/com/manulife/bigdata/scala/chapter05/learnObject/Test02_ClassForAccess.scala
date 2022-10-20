package com.manulife.bigdata.scala.chapter05.learnObject

object Test02_ClassForAccess {

}

class Person {
  private var idCard: String = "001"
  protected var name: String = "zhangsan"
  var age: Int = 18
  private[learnObject] var sex: String = "female"

  def printInfo(): Unit ={
    println(s"Person info: \n idCard:$idCard name:$name age: $age sex:$sex")
  }
}
