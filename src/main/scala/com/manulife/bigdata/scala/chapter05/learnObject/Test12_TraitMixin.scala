package com.manulife.bigdata.scala.chapter05.learnObject

object Test12_TraitMixin {
  def main(args: Array[String]): Unit = {
    val student: Student12 = new Student12
    student.studying()
    student.increase()

    student.dating()
    student.increase()

    student.play()
    student.increase()

    val student2 = new Student12 with Talent {
      override val name: String = "student with talent"
      override def dancing(): Unit = println(s"Student $name is dancing")

      override def singing(): Unit = println(s"Student $name is singing")
    }

    student2.studying()
    student2.hello()
    student2.play()
    student2.dating()
    student2.dancing()
    student2.singing()

  }
}

trait Knowledge {
  var amount = 0
  def increase(): Unit
}

trait Talent {
  def dancing(): Unit
  def singing(): Unit
}

class Student12 extends Person11 with Young11 with Knowledge {
  override val name: String = "student"

  // 实现抽象方法
  override def dating(): Unit = println("Student with knowledge is dating")

  // 实现父类方法
  override def hello(): Unit = {
    super.hello()
    println(s"say hello from student $name")
  }

  def studying(): Unit = println(s"Student: $name is studying")

  override def increase(): Unit = {
    amount += 1
    println(s"Current knowledge is $amount")
  }
}
