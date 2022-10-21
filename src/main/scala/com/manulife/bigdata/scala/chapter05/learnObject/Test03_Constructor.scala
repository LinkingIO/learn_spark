package com.manulife.bigdata.scala.chapter05.learnObject

object Test03_Constructor {
  def main(args: Array[String]): Unit = {
    val person: Person1 = new Person1
    person.Person1

    val foo: Person1 = new Person1("foo")

    val bar: Person1 = new Person1("bar", 20)
  }
}

class Person1() {
  var name: String = _
  var age: Int = _
  println(s"1. 主构造器被调用  $name  $age")

  def this(name: String) {
    this()
    this.name = name
    println(s"2. 辅助构造器一被调用: $name  $age")
  }

  def this(name: String, age: Int) {
    this(name)
    this.age = age
    println(s"3. 辅助构造器二被调用: $name  $age")
  }

  def Person1() = {
    println("一般方法被调用")
  }

}
