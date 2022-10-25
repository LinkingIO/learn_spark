package com.manulife.bigdata.scala.chapter05.learnObject

object Test07_AbstractClass {
  def main(args: Array[String]): Unit = {
    val student: Person7 = new Student7()
    student.eat()
    student.sleep()

    println(student.name)
    println(student.age)
  }

}

abstract class Person7 {
  // 非抽象属性
  var name: String = "person"

  // 抽象属性
  var age: Int

  // 非抽象方法
  def eat(): Unit = {
    println("person eat")
  }

  // 抽象方法
  def sleep(): Unit

}

class Student7 extends Person7 {
//  override val name: String = "student"
  name = "person"
  var age: Int = 18

  override def eat(): Unit = {
    println("Student eat")
  }

  override def sleep(): Unit = {
    println("Student sleep")
  }
}