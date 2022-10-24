package com.manulife.bigdata.scala.chapter05.learnObject

object Test06_DynamicBind {
  def main(args: Array[String]): Unit = {
    val student: Person6 = new Student6
    println(student.name)
    println(student.hello)
  }
}

class Person6 {
  val name: String = "Person"
  def hello(): Unit = {
    println("person hello")
  }
}

class Student6  extends Person6{
  override val name: String = "Student"
  override def hello(): Unit = {
    println("student hello")
  }
}