package com.manulife.bigdata.scala.chapter07.collection01

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Test03_ArrayConvertBuffer {
  def main(args: Array[String]): Unit = {
    val arr = ArrayBuffer[Any]()

    arr.append(3, 6, 2)
    println(arr)

    // ArrayBuffer -> Array
    val newArray: Array[Any] = arr.toArray
    println(newArray)

    // Array -> ArrayBuffer
    newArray(1) = 12
    println(newArray.mkString(","))
    val newArrayBuffer: mutable.Buffer[Any] = newArray.toBuffer
    println(newArrayBuffer)

    newArrayBuffer.append(21, 13)
    println(newArrayBuffer)


  }
}
