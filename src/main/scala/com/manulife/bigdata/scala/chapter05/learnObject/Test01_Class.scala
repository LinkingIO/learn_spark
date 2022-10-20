package com.manulife.bigdata.scala.chapter05.learnObject

import scala.beans.BeanProperty

object Test01_Class {
  def main(args: Array[String]): Unit = {
    val student: Student = new Student()
    // println(student.name)
    println(student.age)
    println(student.sex)
    student.setAge(22)
    student.sex = "female"
    println(student.getAge)
    println(student.sex)
  }
}

// 定义一个类，默认是public,手动指定则会报错
class Student {
  // 私有化属性
  private val name: String = "zhangsan"
  // 自动生成get set方法
  @BeanProperty
  var age: Int = 18
  // 自动推断默认值
  var sex: String = _
}
