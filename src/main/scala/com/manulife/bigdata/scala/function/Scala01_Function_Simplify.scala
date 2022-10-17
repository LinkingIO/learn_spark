package com.manulife.bigdata.scala.function

object Scala01_Function_Simplify {
  def main(args: Array[String]): Unit = {
    /** TODO
     函数至简原则:能省则省
    (1)return 可以省略，Scala 会使用函数体的最后一行代码作为返回值
    (2)如果函数体只有一行代码，可以省略花括号
    (3)返回值类型如果能够推断出来，那么可以省略(:和返回值类型一起省略)
    (4)如果有 return，则不能省略返回值类型，必须指定
    (5)如果函数明确声明 unit，那么即使函数体中使用 return 关键字也不起作用
    (6)Scala 如果函数是无返回值类型，可以省略等号
    (7)如果函数无参，但是声明了参数列表，那么调用时，小括号，可加可不加
    (8)如果函数没有参数列表，那么小括号可以省略，调用时小括号必须省略
    (9)如果不关心名称，只关心逻辑处理，那么函数名(def)可以省略
     */

    // 标准函数定义
    def f0(s: String): String = {
      return s + " dalang"
    }

    println(f0("wu"))

    // 函数至简原则:能省则省
    // (1)return 可以省略，Scala 会使用函数体的最后一行代码作为返回值
    def f1(s: String):String = {
      s + " world"
    }
    println(f1("hello"))

    // (2)如果函数体只有一行代码，可以省略花括号
    def f2(s: String): String = s + " dingdang"
    println(f2("cat"))

    // (3)返回值类型如果能够推断出来，那么可以省略(:和返回值类型一起省略)
    def f3(s: String) = s + " jinlian"
    println(f3("pan"))

    // (4)如果有 return，则不能省略返回值类型，必须指定
    def f4(s: String): String = {return s + " song"}
    println(f4("wu"))

    // (5)如果函数明确声明 unit，那么即使函数体中使用 return 关键字也不起作用
    def f5(s: String): Unit = {return  s + " null"}
    println(f5("string"))

    // (6)Scala 如果期望是无返回值类型，可以省略等号
    def f6(s: String){println(s + " menqing")}
    f6("xi")

    // (7)如果函数无参，但是声明了参数列表，那么调用时，小括号，可加可不加
    def f7() = {println("xu zhishen")}
    f7

    // (8)如果函数没有参数列表，那么小括号可以省略，调用时小括号必须省略
    def f8 = {println("zhou qimo")}
    // f8()
    f8

    // (9)如果不关心名称，只关心逻辑处理，那么函数名(def)可以省略
    val f9 = (s: String) => {println(s)}

    def f10(f: String=>Unit): Unit ={
      f("hu lan")
    }
    f10(f9)
    f10((s: String)=>println("hu lan 2"))

  }
}
