package com.my.scala.basic

object DemoDataByte {
  def main(args: Array[String]): Unit = {
    //    var a:Byte = 10 + 20
    //    println(a)
    //    var l = 10L // long type
    //    // Char
    //    var c1:Char = 'a'
    //    println(c1)
    var c: Char = 'a'
    var s: Int = c

    println(s)
    //    nothingT(0)

  }

  def nothingT(i: Int): Int = {
    if (i != 0) {
      i
    } else {
      throw new RuntimeException
    }

  }


}
