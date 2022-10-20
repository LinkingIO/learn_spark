package com.manulife.bigdata.scala.chapter05.learnObject

object Test02_Access {
  def main(args: Array[String]): Unit = {
    val person: Person = new Person()
    // person.idCard   // error
//    person.name  // error
    println(person.age)
    println(person.sex)
    person.printInfo()

    val teacher: Teacher = new Teacher()
//    teacher.idCard  // error
//    teacher.name
    println(teacher.sex)
    println(teacher.age)
    teacher.printInfo()
  }
}

// 定义子类
class Teacher extends Person {
  override def printInfo(): Unit = {
    name = "lisi"
    sex = "male"
    age = 35
    println(s"Teacher info: No idCard $name $sex $age")
  }
}