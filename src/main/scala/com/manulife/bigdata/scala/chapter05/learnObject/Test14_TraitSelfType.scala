package com.manulife.bigdata.scala.chapter05.learnObject

object Test14_TraitSelfType {
  def main(args: Array[String]): Unit = {
    val register: UserRegister = new UserRegister("alice", "123456")
    register.insert()
  }
}

class User(val username: String,val password: String)

trait UserDao {
  // 对应自身实例是从外部注入，实现了依赖注入
  // 不仅可以用在trait，也可以用在class中
  _: User =>
  def insert():Unit = println(s"insert into db ${this.username}")
}

class UserRegister(username: String, password: String) extends User(username, password) with UserDao {

}