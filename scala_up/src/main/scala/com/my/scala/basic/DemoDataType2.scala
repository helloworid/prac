package com.my.scala.basic

object DemoDataType2 {
  def main(args: Array[String]): Unit = {

    var i:Int = 2.1.toInt
    var i1:Int = 2.9.toInt
    println(i)  // 2
    println(i1)  // 2

    var s:String = "aa"
//    val i2:Int = s.toInt
    println(s.toCharArray.mkString)

  }
}
