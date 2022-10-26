package com.manulife.bigdata.scala.chapter05.learnObject

object Test11_Trait {
  def main(args: Array[String]): Unit = {
    val student: Student11 = new Student11
    student.hello()
    student.play()
    student.dating()
    student.studying()
  }
}

class Person11 {
  val name: String = "person"
  var age: Int = _

  def hello(): Unit = println(s"Person: $name say hello")

  def increase(): Unit = println(s"Person increase $name")
}

trait Young11 {
  val name: String = "Young"
  var age: Int

  def play():Unit = println(s"Young:  $name is playing")
  def dating(): Unit
}

class Student11 extends Person11 with Young11 {
  override val name: String = "student"
//  override def hello() :Unit = println(s"Student : $name say hello")

  override def dating(): Unit = println(s"Student: $name is dating")

  def studying(): Unit = println(s"Student: $name is studying")

  // 实现父类方法
  override def hello(): Unit = {
    super.hello()
    println(s"say hello from student $name")
  }

}
