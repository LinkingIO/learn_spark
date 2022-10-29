package com.manulife.bigdata.scala.chapter07.collection01

object Practice01_WordCount {
  def main(args: Array[String]): Unit = {
    // 录入数据
    val data: List[String] = List("hello scala spark kafka", "hello scala spark", "hello scala", "hello")

    // 数据拍平,分组
    val wordToStrings: Map[String, List[String]] = data.flatMap(elem => elem.split(" ")).groupBy(elem => elem)

    // (word, List(word)) => (word, size)
    val wordToInt: Map[String, Int] = wordToStrings.map(tuple => (tuple._1, tuple._2.size))
    println(wordToInt)

    // 对单词统计后按照词频进行降序排序
    val wordsCountSorted: List[(String, Int)] = wordToInt.toList.sortWith((left, right) => {
      left._2 > right._2
    })

    val wordsCountTop3: List[(String, Int)] = wordsCountSorted.take(3)
    println(wordsCountTop3)

  }
}
