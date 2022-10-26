package com.manulife.bigdata.scala.chapter05.learnObject

// TODO... 测试特质方法的叠加
object Test13_TraitOverlying {
  def main(args: Array[String]): Unit = {
    val student: Student13 = new Student13()
    student.increase()

    val football: MyFootball = new MyFootball
    println(football.describe())

    val ball: MyCategoryBall = new MyCategoryBall
    println(ball.describe())
  }
}

trait Ball {
  val name: String = "ball"
  def describe(): String = name
}

trait ColorBall extends Ball {
  val color: String = "red"

  override def describe(): String = color + "-" + super.describe()
}

trait CategoryBall extends Ball {
  val category: String = "foot"

  override def describe(): String = category + "-" + super.describe()
}

// 钻石问题： 菱形调用
class MyFootball extends CategoryBall with ColorBall {
  override def describe(): String = "My " + super.describe()
}

// 指定父类或者特质引用起始位置
class MyCategoryBall extends CategoryBall with ColorBall {
  override def describe(): String = "My " + super[CategoryBall].describe()
}

trait Knowledge13 {
  def increase(): Unit = println("Knowledge increase")
}

trait Talent13 {
  def increase(): Unit = println("Talent increase")
}

// 单继承多实现之后使用哪个中的super同名方法？？？
// extends 之后混入的特征从右往左叠加
class Student13 extends Person11 with Knowledge13 with Talent13 {
  override def increase(): Unit = super.increase()
}
