package com.manulife.bigdata.scala.chapter07.collection01

import scala.collection.mutable

object Test11_Queue {
  def main(args: Array[String]): Unit = {
    val queue: mutable.Queue[String] = new mutable.Queue[String]()
    queue.enqueue("a","b", "c")
    println(queue.dequeue())
    println(queue)

    println(queue.dequeue())
    println(queue)

    println(queue.dequeue())
    println(queue)

//    println(queue.dequeue())
//    println(queue)

  }
}
