package com.manulife.bigdata.scala.chapter05.learnObject

object Test08_AnonymousClass {
  def main(args: Array[String]): Unit = {
    val student: Person8 = new Person8 {
      override var name: String = "Student"

      override def eat(): Unit = {
        println("student eat")
      }
    }
    println(student.name)
    student.eat()
  }
}

abstract class Person8 {
  var name: String

  def eat(): Unit
}
