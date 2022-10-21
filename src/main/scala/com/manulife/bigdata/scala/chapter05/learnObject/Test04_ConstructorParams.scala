package com.manulife.bigdata.scala.chapter05.learnObject

object Test04_ConstructorParams {
  def main(args: Array[String]): Unit = {
    val student: Student1 = new Student1
    println(s"student info: name: ${student.name}  age: ${student.age}")

    val student2: Student2 = new Student2("bob", 20)
    println(s"student info: name: ${student2.name}  age: ${student2.age}")

    val student3: Student3 = new Student3("bob", 20)
    student3.printInfo()

    val student5: Student5 = new Student5("alice", 20, "female")
    println(s"student info: name: ${student5.name}  age: ${student5.age}  sex: ${student5.sex}")

  }

}

class Student1 {
  var name: String = _
  var age: Int = _
}

// 定义主构造器和变量属性
class Student2(var name: String, var age: Int) {}

// 定义主构造器和形式参数
class Student3(name: String, age: Int) {
  def printInfo(): Unit ={
    println(s"student info: name: ${name}  age: ${age}")
  }
}

// 定义主构造器和val, 但是不推荐
//class Student4(val name: String,val age: Int) {
//  def printInfo(): Unit ={
//    println(s"student info: name: ${name}  age: ${age}")
//  }
//}

// 定义主构造器和属性，再新增新的构造器
class Student5(val name: String,val age: Int) {
  var sex: String = _

  def this(name:String, age: Int, sex: String ) {
    this(name, age)
    this.sex = sex
  }
}