package com.manulife.bigdata.scala.chapter05.learnObject

object Test05_Inherit {
  def main(args: Array[String]): Unit = {
    val foo: Student55 = new Student55("foo", 20)
    foo.printInfo()

    val zhangsan: Student55 = new Student55("zhangsan", 17, "001")
    zhangsan.printInfo()


  }
}

class Person5(){
  var name: String = _
  var age: Int = _
  println("父类 Person 主构造器执行")

  def this(name: String, age: Int){
    this()
    this.name = name
    this.age = age
    println("父类 Person 辅助构造器1执行")
  }

  def printInfo(): Unit ={
    println(s"Person: name:$name age:$age")
  }
}

class Student55(name: String, age: Int) extends Person5(name, age){
  println("子类 主构造器执行")
  var stuNo: String = _
  def this(name: String, age: Int, stuNo: String) {
    this(name, age)
    this.stuNo = stuNo
    println("子类 Student55 辅助构造器1执行")
  }

  override def printInfo(): Unit ={
    println(s"Student: name:$name age:$age stuNo: $stuNo")
  }
}
