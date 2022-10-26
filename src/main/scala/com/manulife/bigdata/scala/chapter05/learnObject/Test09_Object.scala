package com.manulife.bigdata.scala.chapter05.learnObject

object Test09_Object {
  def main(args: Array[String]): Unit = {
//    val person: Person9 = new Person9("adan", 18)
//    person.printInfo()

    Person9.createPerson("alice", 22).printInfo()

    Person9("bob", 30).printInfo()

  }
}

class Person9 private (val name: String, val age: Int) {
  def printInfo(): Unit ={
    println(s"Person: $name  $age  ${Person9.job}")
  }
}

object Person9 {
  var job: String = "student"

  def createPerson(name: String, age: Int): Person9 ={
    job = "worker"
    new Person9(name, age)
  }

  def apply(name: String, age: Int): Person9 ={
    job = "worker"
    new Person9(name, age)
  }

}
