package com.manulife.bigdata.scala.chapter05.learnObject

object Test10_Singleton {
  def main(args: Array[String]): Unit = {
    val person1: Person10 = Person10.getInstance()
    person1.printInfo()

    val person2: Person10 = Person10.getInstance()
    person2.printInfo()
    println(person1)
    println(person2)


  }
}

class Person10 private (val name: String, val age: Int) {
  def printInfo(): Unit ={
    println(s"Person: $name  $age  ${Person9.job}")
  }
}

// 饿汉式，只要调用了Person10, 就一定会创建Person10对象，之后会进行返回
//object Person10 {
//  private val person = new Person10("alice", 10)
//  def getInstance(): Person10 = person
//}

// 懒汉式，没有Person10对象才创建
object Person10 {
  private var person:Person10 = _
  def getInstance(): Person10 = {
    if (person == null) {
      person = new Person10("alice", 10)
    }
    return person
  }
}
