package com.my.scala.basic

import scala.util.control.Breaks

object DemoIf01 {
  def main(args: Array[String]): Unit = {

    val a = 11
    val i:Any = if (a == 1) {
      'a'
    } else {
      0
    }

/*

    for (elem <- 1 to 10 by 3; if elem % 2 == 0) {
      println(elem)
    }
*/

    Breaks.breakable(
      for (i <- 1 to 100){
        if (i==3) {
          Breaks.break()
        }
      }

    )



  }
}
